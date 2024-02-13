import java.io.*;
import java.util.*;
public class ex44 {
    public static void main(String[] args) {
        //creating an object;
        ex44 a=new ex44();
        //a is an object it has its hashcode. Except string everything has unique hashcode.
        System.out.println(a.hashCode());
        System.out.println(a);//output will be:classname@location(fully quantified name);
    }
}
