import java.io.*;
import java.util.*;
public class ex21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int arr[][]=new int[a][b];
        int i,j;
        for(i=0;i<a;i++){
            for(j=0;j<b;j++){
                System.out.println("stu"+i+"sub"+j);
                sc.nextLine();
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<a;i++){
            for(j=0;j<b;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        
    }
}