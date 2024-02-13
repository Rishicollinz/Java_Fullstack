package Assignments_end;
import java.io.*;
import java.util.*;
public class ex {
    static int count=0;
    public static void main(String[] args) {
        int typepizza;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of pizza");
        int noofpizza=sc.nextInt();
        int pizza[][]=new int[noofpizza][2];
        for(int i=0;i<noofpizza;i++){
            System.out.println("1.Base Veg Pizza -300 INR\n2.Base Non Veg Pizza-450INR");
            int pizzano=sc.nextInt();
            switch(pizzano){
                case 1:
                    System.out.println("veg");
                    pizza[i][0]=1;
                    System.out.println("0.No extras\n3.Cheese\n4.Toppings");
                    typepizza=sc.nextInt();
                    pizza[i][1]=typepizza;
                    break;
                case 2:
                    System.out.println("nonveg");
                    pizza[i][0]=2;
                    System.out.println("0.No extras\n3.Cheese\n4.Toppings");
                    typepizza=sc.nextInt();
                    pizza[i][1]=typepizza;
                    break;
            }
        }
        ex prizecal=new ex();
        prizecal.findprize(pizza,noofpizza);
    }

    void findprize(int pizza[][],int size){
        int sum=0;
        for(int i=0;i<size;i++){
            for(int j=0;j<2;j++){
                if(pizza[i][j]==1){
                    sum+=300;
                }
                else if(pizza[i][j]==0){
                    sum=sum;
                }
                else if(pizza[i][j]==2){
                    sum+=450;
                }
                else if(pizza[i][j]==3){
                    sum+=150;
                    deluxe();
                }
                else if(pizza[i][j]==4){
                    sum+=100;
                    deluxe();
                }
            }
        }
        int takeawaychr=20;
        System.out.println("=============================================================================================================================================================");
        System.out.println(sum+takeawaychr);
    };

    static void deluxe(){
        count++;
    }
}

