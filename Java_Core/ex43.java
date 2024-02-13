import java.io.*;
import java.util.*;
public class ex43 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of participants:");
        int size=sc.nextInt();
        int arr[][]=new int[size][size-1];
        for(int i=0;i<size;i++){
            for(int j=0;j<size-1;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size-1;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
    }
}
