import java.io.*;
import java.util.*;

public class area{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius:");
        int r=sc.nextInt();
        double pi=3.14;
        double area=pi*r*r;
        System.out.println("The area of circle is "+area);
    }
}