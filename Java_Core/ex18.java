import java.io.*;
import java.util.*;
public class ex18 {
    public static void main(String[] args) {
        //int arr[5]; in java array is object, so we can't assign directly
        int arr[]=new int[10];
        int arr2[]={0,1121,5};
        int arr3[]=new int[5];//we can declare like this
        Scanner sc=new Scanner(System.in);
        int n=0;
        while(n<5){
            arr3[n]=sc.nextInt();
            n++;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
        for(int i:arr2){
            System.out.print(i+" ");
        }
        for(int i:arr3){
            System.out.println(i+ " ");
        }
        
    }
}