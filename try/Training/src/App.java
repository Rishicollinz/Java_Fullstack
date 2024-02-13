import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class App {
    static Connection connect() throws ClassNotFoundException,SQLException{
        Class.forName("com.jdbc.cj.mysql.Driver");
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

    static void view(Connection con) throws SQLException{
            String qry="Select * from signup";
    		PreparedStatement prt=con.prepareStatement(qry);
            ResultSet rs=prt.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }
    }

    static void update(Connection con) throws SQLException{
        Scanner sc=new Scanner(System.in);
        String qry="update signup set username=?,password=? WHERE id=?";
        PreparedStatement prt=con.prepareStatement(qry);
        System.out.println("Enter the id to update:");
        int update_id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the username:");
        String update_username=sc.nextLine();
        System.out.println("Enter the password:");
        String update_password=sc.nextLine();
        prt.setString(1, update_username);
        prt.setString(2, update_password);
        prt.setInt(3, update_id);
        prt.executeUpdate();
        
    }

    static void delete(Connection con) throws SQLException,ClassNotFoundException{
        Scanner sc=new Scanner(System.in);
        String qry="Delete from signup where id=?";
        PreparedStatement prt=con.prepareStatement(qry);
        System.out.println("Enter the id to delete:");
        int delete_id=sc.nextInt();
        prt.setInt(1,delete_id);
        prt.executeUpdate();
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        Connection con=connect();
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose:");
        System.out.println("1.Insert");
        System.out.println("2.View");
        System.out.println("3.Update");
        System.out.println("4.Delete");
        int chosen=sc.nextInt();
        switch(chosen){
            case 1: 
                insert(con);
                break;
            case 2:
                view(con);
                break;
            case 3:
                update(con);
                break;
            case 4:
                delete(con);
                break;
        }
    }
}

//task=atm 3 password wrong means blocked instead of block use reset_password;