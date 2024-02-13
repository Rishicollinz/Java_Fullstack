import java.io.*;
import java.util.*;
public class ex38 {
    public static void main(String[] args) {
        //stringbuffer~=stringbuilder
        StringBuilder sb=new StringBuilder();//it can be expanded through append
        //constructor can be string or length(capacity) of the string;
        //sb="hello";//will give type casting error of can't convert from string to stringbuffer;
        System.out.println(sb.capacity());
        sb.append("Java Code");
        System.out.println(sb.length());
        sb.insert(5,"Practice ");
        System.out.println(sb.capacity());
        System.out.println(sb+" "+sb.length());//o.p:Java Practice Code 18
        System.out.println(sb.indexOf("Cod"));
        System.out.println(sb.lastIndexOf("a"));
        System.out.println(sb.replace(0, 2, "mouli"));//it replaces start to end then appends all
        //op:mouliva practice code
        System.out.println(sb.substring(0));
        //same as above o.p
        System.out.println(sb.substring(0,3));
        //o.p mou
        System.out.println(sb.delete(0,6));//including
        System.out.println(sb.reverse());
        System.out.println(sb.capacity());
    }
}
