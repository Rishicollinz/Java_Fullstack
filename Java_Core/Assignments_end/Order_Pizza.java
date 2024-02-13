 package Assignments_end;
import java.io.*;
import java.util.*;
public class Order_Pizza {
    static int count=0;
    public static void main(String[] args) {
        System.out.println("Welcome to Pizza Parlour:");
        int typepizza;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Pizza you want to order:");
        int noofpizza=sc.nextInt();
        int pizza[][]=new int[noofpizza][2];
        for(int i=0;i<noofpizza;i++){
            System.out.println("1.Base Veg Pizza -300 INR\n2.Base Non Veg Pizza-450INR");
            int pizzano=sc.nextInt();
            switch(pizzano){
                case 1:
                    System.out.println("You have ordered Base Veg Pizza");
                    pizza[i][0]=1;
                    System.out.println("Choose the type of extras:");
                    System.out.println("0.No extras\n3.Cheese-150INR\n4.Toppings-100INR");
                    typepizza=sc.nextInt();
                    pizza[i][1]=typepizza;
                    break;
                case 2:
                    System.out.println("You have ordered Base Non Veg Pizza");
                    pizza[i][0]=2;
                    System.out.println("Choose the type of extras:");
                    System.out.println("0.No extras\n3.Cheese-150INR\n4.Toppings-100INR");
                    typepizza=sc.nextInt();
                    pizza[i][1]=typepizza;
                    break;
            }
        }
        Pizza prizecal=new Pizza();
        prizecal.findprize(pizza,noofpizza);
        Pizza billcal=new Pizza();
        billcal.bill(pizza,noofpizza);
    }
}
class Pizza{
    static int total=0;
    void findprize(int pizza[][],int size){
        Deluxe delcount=new Deluxe();
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
                    delcount.deluxe();
                }
                else if(pizza[i][j]==4){
                    sum+=100;
                    delcount.deluxe();
                }
            }
        }
        int takeawaychr=20;
        System.out.println("===================================================================================================");
        total=sum+takeawaychr;
        delcount.display();
    }
    void bill(int pizza[][],int size){
        System.out.println("===================================================================================================");
        System.out.println("Your Bill is:");
        for(int i=0;i<size;i++){
            for(int j=0;j<2;j++){
                if(pizza[i][j]==1){
                    System.out.println("The price of Base Veg Pizza="+300);
                }
                else if(pizza[i][j]==2){
                    System.out.println("The price of Base Veg Pizza="+450);
                    
                }
                else if(pizza[i][j]==3){
                    System.out.println("The price of Base Veg Pizza="+150);
                }
                else if(pizza[i][j]==4){
                    System.out.println("The price of Base Veg Pizza="+100);
                
                }
            }
        }
        System.out.println("The takeaway charge="+20);
        System.out.println("Total="+total);
    }
}

class Deluxe{
     int count=0;
     void deluxe(){
        count++;
    }
    void display(){
        System.out.println("The total number of deluxe pizza is:"+count);
    }
}


