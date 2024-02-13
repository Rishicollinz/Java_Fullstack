package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	static final String DB_URL="jdbc:mysql://localhost:3306/daopattern";
    static final String USER="root";
    static final String PASSWORD="";
    static Connection con=null;
    
	public static Connection getConnection() throws ClassNotFoundException {
        try {
            con=DriverManager.getConnection(DB_URL, USER, PASSWORD);
        }
        catch(SQLException e) {
        	e.printStackTrace();
        }
        return con;
        }
//	public static void main(String[] args) throws ClassNotFoundException {
//		Connection con=getConnection();
//		if(con!=null) {
//			System.out.println("connected");
//		}
//	}
}
