package login;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class LoginUserDao {
	private String url="jdbc:mysql://localhost:3306/shoppingzone";
	private String username="root";
	private String password="";
	
	public LoginUserDao() {}
	
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
	
	public boolean loginVerify(String username,String password) {
		boolean chk=false;
		try {
			Connection con=getConnection();
			String query="Select * from users where username=? and password=?";
			PreparedStatement prt=con.prepareStatement(query);
			prt.setString(1, username);
			prt.setString(2,password);
			ResultSet rs=prt.executeQuery();
			if(rs.next()) {
				chk=true;
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return chk;
	}
}
