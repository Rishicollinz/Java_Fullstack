import java.io.*;
import java.util.*;
class Employee{
    int id;
    String name;
    float sal;
    public Employee(){
        System.out.println("hello");
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
public class ex45 {
    public static void main(String[] args) {
        Employee emp=new Employee(); //if we use employee in that class as a func then it executes.
        Employee emp2=new Employee();
        emp.id=25;
        emp.name="Rishi";
        emp.sal=25.00f;
        emp2.id=21;
        emp2.name="Jameer";
        emp2.sal=25000.00f;
        emp.display();//it sends the value of the emp obj;
        emp2.display();
        //this code repeats,we can't use loop because input changes, we should use function.
        //we are gonna use display();


        /*System.out.println(emp.name+" "+emp.id+" "+emp.sal);
        System.out.println(emp2.name+" "+emp2.id+" "+emp2.sal);*/
    }
}
