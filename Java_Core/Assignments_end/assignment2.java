package Assignments_end;
import java.io.*;
import java.util.*;
public class assignment2 {
    static Scanner sc=new Scanner(System.in);
    static int health1=100,health2=100,round=0;
    static int sword_damage=20,gun_damage=20;
    static String name1="",name2="";
    public static void main(String[] args) {
        System.out.println("Enter the name of first player:");
        name1=sc.nextLine();
        System.out.println("Enter the name of second player:");
        name2=sc.nextLine();
        while(health1>0 && health2>0){
            first();
            second();
            round++;
            System.out.println("After Round:"+round);
            System.out.println("Health of "+name1+" :"+health1+"\nHealth of "+name2+" :"+health2);
            System.out.println("_____________________________________________________________________________________________");
        }
        if(health1<=0 && health2<=0){
            System.out.println("Draw");
            System.out.println("Health of "+name1+" :"+health1);
            System.out.println("Health of "+name2+" :"+health2);
        }
        else if(health1<=0){
            System.out.println(name2+" wins-Health of "+name2+" :"+health2);
            System.out.println(name1+" dies-Health of "+name1+" :"+health1);
        }
        else if(health2<=0){
            System.out.println(name1+" wins-Health of "+name1+" :"+health1);
            System.out.println(name2+" dies-Health of "+name2+" :"+health2);
        }
    }
    static void first(){
        
        System.out.println(name1+" Choose a weapon to attack "+name2+"\nType your weapon name :\n1.sword\n2.gun");
        String choice=sc.nextLine();
        switch(choice){
            case "sword":
                health2-=sword_damage;
                break;
            case "gun":
                health2-=gun_damage;
                break;
        }
    }
    static void second(){
        
        System.out.println(name2+" Choose a weapon to attack "+name1+"\nType your weapon name :\n1.sword\n2.gun");
        String choice=sc.nextLine();
        switch(choice){
            case "sword":
                health1-=sword_damage;
                break;
            case "gun":
                health1-=gun_damage;
                break;
        }
    }

}