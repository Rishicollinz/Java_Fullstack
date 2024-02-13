import java.io.*;
public class ex4 {
    public static void main(String[] args) {
        String s="h";//'h' gives char cannot be converted to string error
        char ch='h';
        int a=10;
        System.out.println(s+a);//here first s printed then a is typecasted to string;
        System.out.println(ch+a);//104+10//here ch is taken as ascii value and added with a;
    }   
}
