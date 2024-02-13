package sqls;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;


public class Ex1 {
	static Connection connect() throws ClassNotFoundException,SQLException{
		final String db_url="jdbc:mysql://localhost:3306/registration";
        final String user="root";
        
        Connection con=null;
        con=DriverManager.getConnection(db_url, user, "");
        if(con!=null) {
        	System.out.println("Connected");
        	return con;
        }else {
        	System.out.println("Not Connected");
        	return null;
        }
        
	}
	static void insert(Connection con) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		String username,password;
		
		/*if(con!=null) {
			System.out.println("Successful");
		}*/
		String qry="insert into signup(username,password) values(?,?)";
		PreparedStatement prt=con.prepareStatement(qry);
		System.out.println("Enter the username:");
		username=sc.nextLine();
		System.out.println("Enter the password:");
		password=sc.nextLine();
		prt.setString(1, username);
		prt.setString(2,password);
		prt.executeUpdate();
	}
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
    		Connection con=connect();
    		insert(con);
    		String qry="Select * from signup";
    		PreparedStatement prt=con.prepareStatement(qry);
    		
    		prt.executeQuery();//
    	}
    }

