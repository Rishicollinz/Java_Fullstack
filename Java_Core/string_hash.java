import java.io.*;
import java.util.*;
public class string_hash {
    public static void main(String[] args) {
        String s1="hash";
        String s2="hash";
        String s3="java";
        String s4="Java";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());

        //note that s1 and s2 are same, then the hashcode is same for both s1 and s2 because it refers.
        
    }
}
