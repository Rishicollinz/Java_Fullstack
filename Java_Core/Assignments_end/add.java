package Assignments_end;
import java.util.*;
public class add {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean val=true;
        int a,b=0;
        String v=null;
        while(val){
            System.out.println("First num:");
            a=sc.nextInt();
            System.out.println("Second num:");
            b=sc.nextInt();
            System.out.println("Addition:"+(a+b));
            System.out.println("Do you want to continue:\n1.Yes\n2.No");
            v=sc.next();
            if(v.equals("Yes")){
                val=true;
            }else{
                val=false;
                break;
            }
        }
    }
}
