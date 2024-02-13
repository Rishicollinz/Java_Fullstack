import java.io.*;
import java.util.*;
public class ex30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows:");
        int a=sc.nextInt();
        int arr[][]=new int[a][];
        int b=0;
        for(int i=0,j=a;i<a;i++,j--){
            b=j;
            arr[i]=new int[b];
        }
        
        for(int i=0;i<a;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println("stu"+i+"sub"+j);
                sc.nextLine();
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<a;i++){
            for(int z=0; z<arr[i].length;z++){
                if(i+z<=6){
                System.out.print(arr[i][z]+" ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
            
        }
    }
}
