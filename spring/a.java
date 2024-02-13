package spring;
import java.util.*;
public class a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input1=sc.nextInt();
        int input2=sc.nextInt();
        int input3=sc.nextInt();
        sc.close();

        int thou=thousand(input1,input2,input3);
        int hund=hundred(input1,input2,input3);
        int ten=tens(input1,input2,input3);
        int uni=unit(input1,input2,input3);
        String keys=thou+""+hund+""+ten+""+uni;
        int key=Integer.parseInt(keys);
        System.out.println(key);
    }

    static int unit(int num1, int num2, int num3) {
        int min=Integer.MAX_VALUE;
        int n1=(num1)%10;
        int n2=(num2)%10;
        int n3=(num3)%10;
        if(n1<min){
            min=n1;
        }
        if(n2<min){
            min=n2;
        }
        if(n3<min){
            min=n3;
        }
        return min;
    }

    static int tens(int num1, int num2, int num3) {
        int min=Integer.MAX_VALUE;
        int n1=(num1/10)%10;
        int n2=(num2/10)%10;
        int n3=(num3/10)%10;
        if(n1<min){
            min=n1;
        }
        if(n2<min){
            min=n2;
        }
        if(n3<min){
            min=n3;
        }
        return min;
    }

    static int hundred(int num1, int num2, int num3) {
        int min=Integer.MAX_VALUE;
        int n1=(num1/100)%10;
        int n2=(num2/100)%10;
        int n3=(num3/100)%10;
        if(n1<min){
            min=n1;
        }
        if(n2<min){
            min=n2;
        }
        if(n3<min){
            min=n3;
        }
        return min;
    }

 static int thousand(int num1,int num2,int num3){
        
        int min=Integer.MAX_VALUE;
        int n1=num1/1000;
        int n2=num2/1000;
        int n3=num3/1000;
        if(n1<min){
            min=n1;
        }
        if(n2<min){
            min=n2;
        }
        if(n3<min){
            min=n3;
        }
        return min;
    }
}
