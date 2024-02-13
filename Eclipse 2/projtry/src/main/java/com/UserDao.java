package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class UserDao {
	private String url="jdbc:mysql://localhost:3306/db3";
	private String username="root";
	private String password="";
	
	private static final String INSERT_USER_SQL="Insert into userreg"+" (name,email,country) VALUES "+
	"(?,?,?)";
	
	private static final String SELECT_USER_BY_ID="select id,name,email,country from userreg where id=?";
	
	private static final String SELECT_ALL_USERS="select * from userreg";
	
	private static final String DELETE_USERS_SQL="delete from userreg where id=?";
	
	private static final String UPDATE_USERS_SQL="update userreg set name=?,email=?,country=? where id=?";
	
	public UserDao() {
		
	}
	
	protected Connection getConnection() {
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public void insert_user(User u){
		try {
			Connection con=getConnection();
			PreparedStatement prt=con.prepareStatement(INSERT_USER_SQL);
			prt.setString(1, u.getName());
			prt.setString(2, u.getEmail());
			prt.setString(3, u.getCountry());
			prt.executeUpdate();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public User selectUser(int id) {
		User user=null;
		try {
			Connection con=getConnection();
			PreparedStatement prt=con.prepareStatement(SELECT_USER_BY_ID);
			prt.setInt(1, id);
			ResultSet rs=prt.executeQuery();
			
			while(rs.next()) {
				String name=rs.getString("name");
				String email=rs.getString("email");
				String country=rs.getString("country");
				user=new User(id,name,email,country);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return user;
		
		
	}
	public ArrayList<User> selectAllUser() {
		ArrayList<User> users=new ArrayList<>();
		try {
			
			Connection con=getConnection();
			PreparedStatement prt=con.prepareStatement(SELECT_ALL_USERS);
			ResultSet rs=prt.executeQuery();
			while(rs.next()) {
				int id=rs.getInt("id");
				String name=rs.getString("name");
				String email=rs.getString("email");
				String country=rs.getString("country");
				users.add(new User(id,name,email,country));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return users;
	}
	
	public boolean deleteUser(int id) {
		boolean rowDeleted=false;
		try {
			Connection con=getConnection();
			PreparedStatement prt=con.prepareStatement(DELETE_USERS_SQL);
			prt.setInt(1, id);
			rowDeleted=prt.executeUpdate()>0;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return rowDeleted;
	}
	
	public boolean updateUser(User user) {
		boolean rowUpdated=false;
		try {
			Connection con=getConnection();
			PreparedStatement prt=con.prepareStatement(UPDATE_USERS_SQL);
			prt.setString(1, user.getName());
			prt.setString(2, user.getEmail());
			prt.setString(3, user.getCountry());
			prt.setInt(4, user.getId());
			
			rowUpdated=prt.executeUpdate()>0;
			
		}
		catch(SQLException e) {
			printSQLException(e);
		}
		return rowUpdated;
	}

	private void printSQLException(SQLException ex) {
		// TODO Auto-generated method stub
		for(Throwable e:ex) {
			if(e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQL State: "+((SQLException) e).getSQLState());
				System.err.println("Error code: "+((SQLException) e).getErrorCode());
				System.err.println("Message: "+((SQLException) e).getMessage());
				Throwable t=ex.getCause();
				while(t!=null) {
					System.out.println("Cause: "+t);
					t=t.getCause();
				}
				
				
				
			}
			
		}
		
	}
	
}