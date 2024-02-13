import java.io.*;
import java.util.*;
public class ex26 {
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
        System.out.println("Enter the element to be searched:");
        int sr=sc.nextInt();
        int count=0,lastocc=0;
        boolean crt=false;
        for(i=0;i<size;i++){
            if(arr[i]==sr){
                System.out.println("The element found at:"+(i+1));
                crt=true;
                count++;
                lastocc=i+1;
            }else{
                if(i>=size-1 && crt==false){
                    System.out.println("Element not found");
                }
            }
        }
        //update
        System.out.println("Update: ");
        int up=sc.nextInt();
        arr[i-1]=up;

        for(int zz:arr){
            System.out.print(zz+" ");
        }
        System.out.println();
        //update finish
        if(count>0){
            System.out.println("The no of times the searched element in array is:"+count);
            System.out.println("The element last occured at: "+lastocc);
        }
    }
}

