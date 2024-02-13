import java.io.*;
import java.util.*;
public class ex37 {
    public static void main(String[] args) {
        StringTokenizer st=new StringTokenizer("This is java programming");
        //this is constructor overloading,
        //if one argument it is this.
        //if two argument(str,delimiter) then it is used to split
        //this is constructor overloading
        System.out.println(st.countTokens());//starts high and if used, then decrease by 1;
        while(st.hasMoreTokens()){//in scanner it is like sc.hasNext();
            System.out.println(st.nextToken()+" ");
            System.out.println(st.countTokens());
        }
        
    }
}
