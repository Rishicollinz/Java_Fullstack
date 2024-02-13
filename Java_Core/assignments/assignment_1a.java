import java.io.*;
import java.util.*;
public class assignment_1a {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the rollNo:");
    int rollno=sc.nextInt();
    System.out.println("Enter the name:");
    sc.nextLine();
    String name=sc.nextLine();
    System.out.println("Enter the age:");
    int age=sc.nextInt();
    System.out.println("ur rollNo is: "+rollno+"\nur name is: "+name+"\nur age is: "+age);
    sc.close();
    }
    
}
