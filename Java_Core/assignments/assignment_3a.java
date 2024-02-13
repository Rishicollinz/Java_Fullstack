import java.io.*;
import java.util.*;
public class assignment_3a {
    public static void main(String[] args) {
        String a[]={"a.txt.txt_txt.txt", "aab.txt","jf.txt.txt","pop.txt.jpg","pop1.jpg"};
        String val=null;
        int count=0;
        //String chk=null;
        for(int i=0;i<a.length;i++){
            val=a[i];
            if(val.charAt(i)=='.'&&val.charAt(i+1)=='t'&&val.charAt(i+2)=='x'&&val.charAt(i+3)=='t'){
                count+=1;

            }
            /*chk=val.substring(val.indexOf('.'));*/   
        }
        System.out.println(count);
    }
}
