import java.io.*;
import java.util.*;
class Employee{
    int id;
    String name;
    float sal;
    String email;

    public Employee(){
        System.out.println("Default constructor:");
    }

    public Employee(String name){
        this();//this goes to empty argument constructor(1st employee method)
        this.name=name;
        this.email=name+"@gmail.com";
    }

    public Employee(int id,String name,float sal){
        this(name);//it goes to string name (2nd employee method)
        this.id=id;
        this.sal=sal;
    }

    void display(){
        System.out.println(name+" "+id+" "+sal+" "+email);
        
    }
    

    
}
public class ex49 {
    public static void main(String[] args) {
        
        Employee emp=new Employee(25,"Rishi",2000); 
        Employee emp2=new Employee(21,"Jameer",5000);
        Employee emp3=new Employee();
        Employee emp4=new Employee("mouli");
        
        emp.display();
        emp2.display();
        emp4.display();
        
    }
}
