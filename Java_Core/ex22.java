import java.io.*;
import java.util.*;
public class ex22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of college:");
        int clg=sc.nextInt();
        System.out.println("Enter the no of dept:");
        int dept=sc.nextInt();
        System.out.println("Enter the total class:");
        int classs=sc.nextInt();
        System.out.println("Enter the total students:");
        int stud=sc.nextInt();
        System.out.println("Enter the total subject:");
        int sub=sc.nextInt();
        int tn[][][][][]=new int[clg][dept][classs][stud][sub];
        String clgs[]={"KRCT","vsr"};
        int l,m,i,j,k;
        for(l=0;l<clg;l++){
            for(m=0;m<dept;m++){
                for(i=0;i<classs;i++){
                    for(j=0;j<stud;j++){
                        for(k=0;k<sub;k++){
                            System.out.println("Enter the mark of clg no:"+l+"dept no:"+m+"class no:"+i+" stud no: "+j+" of sub:"+k);
                            tn[l][m][i][j][k]=sc.nextInt();
                        }
                    }
                }
            }
        }
        
        System.out.println();
        for(l=0;l<clg;l++){
            for(m=0;m<dept;m++){
                for(i=0;i<classs;i++){
                    for(j=0;j<stud;j++){
                        for(k=0;k<sub;k++){
                            System.out.println("the mark of clg name:"+clgs[l]+" dept no:"+m+"class no:"+i+" stud no: "+j+" of sub:"+k);
                            System.out.println(tn[l][m][i][j][k]+" ");
                        }
                    }
                }
            }
        }
}
}
//tamilnadu/3 college/dept/ classes/student/subject