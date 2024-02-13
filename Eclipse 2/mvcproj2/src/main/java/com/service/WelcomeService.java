package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {
	public Connection connect() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
        final String db_url="jdbc:mysql://localhost:3306/shoppingzone";
        final String user="root";
        Connection con=null;
        con=DriverManager.getConnection(db_url, user, "");
        if(con!=null) {
        	System.out.println("Database Connected");
            return con;
        }else {
        	System.out.println("Database Not Connected");
            return null;
        }
	}
	
	public String secondMsg() {
		return "Second Message from welcome service";
	}
	
	public ArrayList<Integer> thirdmsg(){
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(1);
		arr.add(2);
		return arr;
	}
}
