import java.io.*;
import java.util.*;
public class ex19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int arr[][]=new int[a][b];
        int cls[][]={{1,2,5},{2,4,5}};
        int i,j;
        for(i=0;i<a;i++){
            for(j=0;j<b;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<a;i++){
            for(j=0;j<b;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for(i=0;i<=1;i++){
            for(j=0;j<=2;j++){
                System.out.print(cls[i][j]);
            }
            System.out.println();
        }
    }
}