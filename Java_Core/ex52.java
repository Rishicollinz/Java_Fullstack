import java.io.*;
import java.util.*;
class Employee{
    int id;
    String name;
    float sal;
    String email;
    int raise=1000;
    static int empcount=0;//because static value remember them each time
    //normal each time of reference will start from 0 to 1;
    

    public Employee(){
        empcount++;
        System.out.println("Default constructor:"+empcount);
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
    float cal_pay(float sal){
        sal=sal+1000;
        return sal;
    }
    

    
}
public class ex52 {
    public static void main(String[] args) {
       
        Employee emp=new Employee(25,"Rishi",2000); 
        System.out.println(Employee.empcount);//empcount is a static we don't need object to print but we can use it.
        Employee emp2=new Employee(21,"Jameer",5000);
        Employee emp3=new Employee();
        Employee emp4=new Employee("mouli");
        emp.display();
        emp.sal=emp.cal_pay(emp.sal);
        emp.display();
        
        //emp2.display();
        //emp4.display();
        
    }
}
