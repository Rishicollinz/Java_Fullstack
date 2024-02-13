import java.io.*;
import java.util.*;
public class ex24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=3;i++){
            System.out.println("Enter the pin:");
            if(sc.nextInt()==1234){
                    System.out.println("Logged in successfully");
                    break;
            }
            else if(i<3){
                System.out.println("Invalid.Try again");
            }else{
                    System.out.println("Card blocked");
            }
        }
    }
}
