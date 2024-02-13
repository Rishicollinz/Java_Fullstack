import java.io.*;
import java.util.*;
public class ex48 {
    public static void main(String[] args) {
        int a=3;
        boolean prime=false;
        for(int i=2;i<a;i++){
            
            if(a==2){
                prime=true;
            }
            else if(a%i!=0){
                prime=true;
            }
            else{
                prime=false;
                break;
            }


        }
        if(prime==true){
            System.out.println("prime");
        }else{
            System.out.println("Not prime");
        }
    }
}
