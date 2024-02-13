import java.io.*;
import java.util.*;
public class assignment_2a {
    public static void main(String[] args) {
        //intialized int mark[][][]={{{87,79,91,88},{92,80,86,91}},{{80,75,66,74},{81,89,70,83}},{{98,88,94,95},{99,93,96,97}}};
        //user-defined:
        Scanner sc=new Scanner(System.in);
        int mark[][][]=new int[3][2][4];
        for(int i=0;i<=2;i++){
            System.out.println("Student:"+(i+1));
            for(int j=0;j<=1;j++){
                System.out.println("Semester:"+(j+1));
                for(int z=0;z<=3;z++){
                    System.out.println("Subject "+(z+1)+"\nEnter the mark:");
                    mark[i][j][z]=sc.nextInt();
                }
                System.out.println();
            }
        }
        for(int i=0;i<=2;i++){
            System.out.println("Student:"+(i+1));
            for(int j=0;j<=1;j++){
                System.out.println("Semester:"+(j+1));
                for(int z=0;z<=3;z++){
                    System.out.print(mark[i][j][z]+" ");
                }
                System.out.println();
            }
        }
    }
}
