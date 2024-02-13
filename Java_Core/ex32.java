import java.io.*;
import java.util.*;
public class ex32 {
    public static void main(String[] args) {
        String s1="Java";
        String s2=s1;
        String s3="Java";//contains same hashcode as s1;
        String s4=new String("Java");//new should give hashcode, but gives same hashcode. 
        System.out.println(s1.hashCode()+" "+s2.hashCode()+" "+s4.hashCode());
        System.out.println(s1==s4);//same java but due to new, it is false.//it checks content and reference in heap memory.
        System.out.println(s1==s3);//returns true;
        System.out.println(s1.equals(s4));//returns true;//checks only the content
    }
}
