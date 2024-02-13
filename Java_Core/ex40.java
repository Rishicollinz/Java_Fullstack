import java.io.*;
import java.util.*;
public class ex40 {
    int x=5;//non static
    static int xs=40;
    static int sum(int a,int b){
        return a+b;
    }
    void hello(){
        System.out.println(x);//prints hello
        System.out.println(xs);//can be used by static as well as non static
        //non static can be only used by non static;
    }
    static void thirdmethod(int arr[]){
        System.out.println(Arrays.toString(arr));

    }
    static String fourthmethod(int arr[]){
        return Arrays.toString(arr);
        }
    public static void main(String[] args) {
        ex40 a=new ex40();
        a.hello();
        int c=sum(5,25);
        int arr[]={1,2};
        System.out.println(xs);//can access because xs is static;
       // System.out.println(x);//cannot make a static reference to non-static field;
        System.out.println(c);
        thirdmethod(arr);
        String h=fourthmethod(arr);
        System.out.println(h);

    }
}
