import java.io.*;
import java.util.*;
//jagged array
public class ex29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows:");
        int a=sc.nextInt();
        int arr[][]=new int[a][];
        int b;
        for(int i=0;i<a;i++){
            System.out.println("Enter the no of col of array:"+(i+1));
            b=sc.nextInt();
            arr[i]=new int[b];
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println("stu"+i+"sub"+j);
                sc.nextLine();
                arr[i][j]=sc.nextInt();
            }
        }
        //int arr2[][]={{70},{70,80},{70,80,90},{70,80,90,100}};
        for(int i=0;i<a;i++){
            System.out.println("Stud:"+(i+1));
            for(int z=0; z<arr[i].length;z++){
                if(i>=z){
                System.out.print(arr[i][z]+" ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
            
        }
    }
}
