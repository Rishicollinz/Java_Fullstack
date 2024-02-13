import java.util.*;
import java.io.*;
public class sc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        sc.next();//bottleneck;
        String hello="";
        hello+=sc.nextLine();
        System.out.println(hello+" "+a);
    }
}
