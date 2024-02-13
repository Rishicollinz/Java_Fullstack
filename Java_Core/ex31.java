import java.io.*;
import java.util.*;
public class ex31 {
    public static void main(String[] args) {
        
    char arr[]={'a','b','c'};
    String a=new String(arr);//this converts it
    String amrr=new String(arr,1,2);//this takes only from 1 to 2;
    System.out.println(amrr);//prints bc
    System.out.println(a);
    }
}
