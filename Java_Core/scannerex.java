import java.io.*;
import java.util.*;

public class scannerex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int id=sc.nextInt();
        sc.nextLine();
        String name=sc.nextLine();//for getting multiple words
        Float salary=sc.nextFloat();
        char gen=sc.next().charAt(0);
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("Salary:"+salary);
        System.out.println("Gender:"+gen);
    
    }
}
