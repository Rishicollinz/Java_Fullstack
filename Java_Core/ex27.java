import java.io.*;
import java.util.*;
public class ex27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        System.out.println("Enter the element:");
        int arr[]=new int[size];
        int i;
        for(i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be deleted: ");
        int del=sc.nextInt();
        int z;
        for(int j=0;j<size;j++){
            if(arr[j]==del){
                for(z=j;z<size;z++){
                    if(z!=size-1){
                        arr[z]=arr[z+1];
                    }else{
                        arr[z]=0;
                    }
                }
            }
            
        }
        for(int za:arr){
            System.out.print(za+" ");
        }
    }
}
