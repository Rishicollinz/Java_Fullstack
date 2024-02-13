import java.io.*;
import java.util.*;
public class assignment_2b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row,col;
        System.out.println("Enter the row and col of matrix:");
        int size=sc.nextInt();
        int mat[][]=new int[size][size];
        for(row=0;row<size;row++){
            for(col=0;col<size;col++){
                mat[row][col]=sc.nextInt();
            }
        }
        for(row=0;row<size;row++){
            for(col=0;col<size;col++){
                System.out.print(mat[row][col]+" ");
            }
            System.out.println();
        }
        System.out.println("How many numbers you have to search:");
        int noofsearch=sc.nextInt();
        for(int num=0;num<noofsearch;num++){
        System.out.println("Enter the no:");
        int search=sc.nextInt();
        for(row=0;row<size;row++){
            for(col=0;col<size;col++){
                if(mat[row][col]==search){
                    System.out.println(row+","+col+" "+row+(char)(col+65));
                }
            }
        }
    }
    }
}
