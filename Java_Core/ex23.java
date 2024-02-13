import java.io.*;
import java.util.*;
public class ex23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting table:");
        int start=sc.nextInt();
        System.out.println("Enter the ending table:");
        int end=sc.nextInt();

        for(;start<end+1;start++){
            System.out.println("The table of "+start);
            for(int i=1;i<=10;i++){
            System.out.println(start+"*"+i+"="+start*i);
            }
        }
    sc.close();
    }
}
