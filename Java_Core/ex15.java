import java.io.*;
import java.util.*;
public class ex15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int inp=sc.nextInt();
        /*for(int i=1;i<=10;i++){
            System.out.println(inp+"*"+i+"="+inp*i);
        }*/
        int i=1;
        /*while(i<11){
            System.out.println(inp+"*"+i+"="+inp*i);
            i++;
        }*/
        
        do{
            System.out.println(inp+"*"+i+"="+inp*i);
            i++;
        }
        while(i<11);
    }
}