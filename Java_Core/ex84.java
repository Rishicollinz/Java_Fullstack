import java.util.*;
public class ex84 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");

        int a=sc.nextInt();
        try{
            if(a<18){
                throw new NullPointerException("You are not eligible to vote");
            }else{
                System.out.println("You are eligible to vote");
            }
        }
        catch(NullPointerException e){
            System.out.println("you have successfully catched the manually thrown exception:"+e.getMessage());
        }


    }
}
