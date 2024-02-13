import java.io.*;
import java.util.*;
public class ex34 {
    public static void main(String[] args) {
        String arrr[]={"muba","aslam","rishi","mouli","jameer"};
        String temp=null;
        for(int i=0;i<arrr.length;i++){
            for(int j=i+1;j<arrr.length;j++){
                if(arrr[i].compareTo(arrr[j])>0){//positive if higher 1 than 2
                    temp=arrr[i];
                    arrr[i]=arrr[j];
                    arrr[j]=temp;
                }
            }
        }
        for(int i=0;i<arrr.length;i++){
            System.out.print(arrr[i]+" ");
        }
    }
}
