import java.io.*;
import java.util.*;
public class ex33 {
    public static void main(String[] args) {
        int arrr[]={6,2,4,3,1,88,0};
        int temp;
        for(int i=0;i<arrr.length;i++){
            for(int j=i+1;j<arrr.length;j++){
                if(arrr[i]>arrr[j]){//cmp(a[i],a[j])>0
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
