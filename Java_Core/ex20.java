import java.io.*;
import java.util.*;
public class ex20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total class:");
        int classs=sc.nextInt();
        System.out.println("Enter the total students:");
        int stud=sc.nextInt();
        System.out.println("Enter the total subject:");
        int sub=sc.nextInt();
        int mark[][][]=new int[classs][stud][sub];
        int i,j,k;
        for(i=0;i<classs;i++){
            for(j=0;j<stud;j++){
                for(k=0;k<sub;k++){
                    System.out.println("Enter the mark of class no:"+i+" stud no: "+j+" of sub:"+k);
                    mark[i][j][k]=sc.nextInt();
                }
            }
        }
        System.out.println();
        for(i=0;i<classs;i++){
            for(j=0;j<stud;j++){
                for(k=0;k<sub;k++){
                    
                    System.out.println("the mark of class no:"+i+" stud no: "+j+" of sub:"+k);
                    
                    System.out.println(mark[i][j][k]+" ");
                }
            }
        }
        
    }
}
//tamilnadu/3 college/dept/ classes/student/subject