import java.io.*;
public class First{
    public static void main(String[] args) {
        int a=5,b=4;
        System.out.println(a&b);//convert a and b to binary and then use and(multiple) operation.
        System.out.println(a|b);//convert a and b to binary and then use or(add) operation
        System.out.println(~5);
        System.out.println(~-4);
        System.out.println(10<<2);
        System.out.println(10>>2);
        System.out.println(10<<3);
        System.out.println(10>>3);
        System.out.println(10>>>2);//it is same as 10>>2 but different for -10 dividend
    }
}
