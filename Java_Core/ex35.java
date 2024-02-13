import java.io.*;
import java.util.*;
public class ex35 {
    public static void main(String[] args) {
        String s1="This is Java program";
        String arr[]=s1.split(" ");//converts s1 to arr using split;
        for(String a:arr){
            System.out.println(a);
        }
        System.out.println(Arrays.toString(arr));
        char chrarr[]=new char[s1.length()];
        //char chrarr[]=s1.toCharArray();
        s1.getChars(0, s1.length(), chrarr, 0);//manually we can control the things;
        System.out.println(Arrays.toString(chrarr));
    }
}
