import java.io.*;
import java.util.*;
class Employee{
    int id;
    String name;
    float sal;
    
    public Employee(){//default constructor 
        System.out.println("Default constructor:");
    }

    public Employee(int i,String nam,float sa){
        id=i;
        name=nam;
        sal=sa;
    }

    void display(){
        System.out.println(name+" "+id+" "+sal);//if we use emp.data that emp should change to emp1,emp2,...
        //so if we call using what we wanted emp obj then it comes as calling object(value);
    }

    /*void getdetails(){
        Scanner sc=new Scanner(System.in);
        id=sc.nextInt();
        sc.nextLine();
        name=sc.nextLine();
        sal=sc.nextFloat();
    }*/
}
public class ex46 {
    public static void main(String[] args) {
        Employee emp=new Employee(25,"Rishi",2000); //if we use employee in that class as a func then it executes.
        Employee emp2=new Employee(21,"Jameer",5000);
        Employee emp3=new Employee();
        
        emp.display();
        emp2.display();
        //this code repeats,we can't use loop because input changes, we should use function.
        //we are gonna use display();


        /*System.out.println(emp.name+" "+emp.id+" "+emp.sal);
        System.out.println(emp2.name+" "+emp2.id+" "+emp2.sal);*/
    }
}
