import java.io.*;
import java.util.*;
public class ex39 {
    void hello(){
        System.out.println("mouli");
    }
    static void jameer(){//using static we don't need an object
        System.out.println("Good afternoon Jameer");
    }
    public static void main(String[] args) {
        ex39 a=new ex39();
        a.hello();
        a.jameer();   
    }
}
