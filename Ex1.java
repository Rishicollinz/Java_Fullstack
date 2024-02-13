import java.sql.DriverManager;

public class Ex1 {
    public static void main(String[] args) {
        Class.forName("com.mysql.jdbc.driver");//driver(auto)
        DriverManager.getConnection("jdbc:mysql://localhost:3306/Registration", "root", "");
    }
}
