import java.io.*;
import java.util.*;
public class assignment_1b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sub1 mark: ");
        int sub1mk=sc.nextInt();
        System.out.println("Enter the sub2 mark: ");
        int sub2mk=sc.nextInt();
        System.out.println("Enter the sub3 mark: ");
        int sub3mk=sc.nextInt();
        System.out.println("Enter the sub4 mark: ");
        int sub4mk=sc.nextInt();
        //pass mark=50;
        float average=(sub1mk+sub2mk+sub3mk+sub4mk)/4.0f;
        int total=sub1mk+sub2mk+sub3mk+sub4mk;
        System.out.println("Average: "+average+"\nTotal: "+total);
        if(sub1mk>=50 && sub2mk>=50 && sub3mk>=50 && sub4mk>=50){
            System.out.println("Result: Pass");
        }else{
            System.out.println("Result: Fail");
        }


    }
}
