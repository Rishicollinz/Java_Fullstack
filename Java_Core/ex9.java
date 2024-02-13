import java.io.*;
import java.util.*;
public class ex9 {
    public static void main(String[] args) {
        int amount;
        Scanner sc=new Scanner(System.in);
        amount=sc.nextInt();
        int discount=0,payamt=0;
        if(amount>10000){
            discount=1000;
            payamt=amount-discount;
            System.out.println(payamt);
        }
        else if(amount>5000){
            discount=500;
            payamt=amount-discount;
            System.out.println(payamt);
        }
        else if(amount>1000){
            discount=100;
            payamt=amount-discount;
            System.out.println(payamt);
        }
        else{
            discount=0;
            payamt=amount-discount;
            System.out.println(payamt);
        }
    }
}
//p>=1000=d=100
//>5000=d=500
//>10000d=1000