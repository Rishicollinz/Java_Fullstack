import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
public class Ex1_ATM {
    static Connection db_connect() throws SQLException{
        final String db_url="jdbc:mysql://localhost:3306/registration";
        final String username="root";
        Connection con=null;
        con=DriverManager.getConnection(db_url, username, "");
        if(con!=null){
            System.out.println("Database Connected");
            return con;
        }else{
            System.out.println("Database Not Connected");
            return null;
        }
    }
    /* 
    static boolean check_pid(int pid,Connection con){
        boolean chk=false;
        try{

            String qry="SELECT * FROM reset WHERE id=?";
            PreparedStatement prt=con.prepareStatement(qry);
            prt.setInt(1, pid);
            ResultSet rs=prt.executeQuery();
            while(rs.next()){
                if(Integer.valueOf(rs.getInt(1))==pid){
                    System.out.println("true");
                    chk=true;
                }else{
                    System.out.println("false");
                    chk=false;
                }
            }
            return chk;
        }
        catch(SQLException e){
            return chk;
        }
    }
    */
    
    static void pin_entering(Connection con) throws SQLException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your id:");
        int pid=sc.nextInt();
        //boolean chk_id=check_pid(pid,con);
        boolean chk_id=true;
        if(chk_id=true){
            String qry="SELECT pin FROM reset WHERE id=?";
            PreparedStatement prt=con.prepareStatement(qry);
            prt.setInt(1,pid);
            ResultSet rs=prt.executeQuery();
            int crt_pin=0;
            while(rs.next()){
                crt_pin=rs.getInt(1);
            }
            for(int i=1;i<=3;i++){
                System.out.println("Enter the pin:");
                if(sc.nextInt()==crt_pin){
                        System.out.println("Logged in successfully");
                        break;
                }
                else if(i<3){
                    System.out.println("Invalid.Try again");
                }else{
                        reset(crt_pin,con,pid);
                }
            }
        }else{
            System.out.println("Your id is not valid");
        }
    }
    public static void main(String[] args) throws SQLException {
        Connection con=db_connect();
        pin_entering(con);
        con.close();
    }
    static void reset(int crt_pin,Connection con,int pid) throws SQLException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Please! Reset your pin!");
        System.out.println("Please enter your new pin:");
        int new_pin=sc.nextInt();
        if(new_pin!=crt_pin){
            String qry="UPDATE reset SET pin=? WHERE id=?";
            PreparedStatement prt=con.prepareStatement(qry);
            prt.setInt(1,new_pin);
            prt.setInt(2, pid);
            int count=prt.executeUpdate();
            if(count>0){
                System.out.println("Pin updated successfully");
            }else{
                System.out.println("Pin is not updated");
            }
        }else{
            System.out.println("Please enter a different pin");
        }

    }
    
}


