import java.io.*;
import java.util.*;


class joy{
    public void hii(){
        System.out.println("hii");
    }
    
    public static int[] firstMethod(){
        int arr[]={1,2};
        return arr;
    }

}
class ex42 extends joy{
    public static void main(String[] args) {
        ex42 a=new ex42();
        a.hii();
        int brr[]=firstMethod();
        System.out.println(Arrays.toString(brr));
    }
}