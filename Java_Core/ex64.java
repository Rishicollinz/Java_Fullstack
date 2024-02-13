import java.io.*;
import java.util.*;
//deep copy
class Developer{
    String skill;
    
    Developer(String skill){
        this.skill=skill;
    }
}
class Employee implements Cloneable {
    int id=0;
    String name="";
    Developer dev;
    Employee(int id,String name,Developer dev){
        this.id=id;
        this.name=name;
        this.dev=dev;
    }
    //tostring override
    public String toString(){
        return id+" "+name+" "+dev.skill;
    }
    //here we use this because 
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}

public class ex64  {
    public static void main(String[] args) throws CloneNotSupportedException {
        Developer dev1=new Developer("java");
        Employee emp1=new Employee(101, "jack",dev1);
        Employee emp2=(Employee)emp1.clone();
        
        System.out.println(emp1);
        System.out.println(emp2);
        
        emp2.id=102;
        emp2.dev.skill="Python";//shallow copy occurs

        System.out.println(emp1);
        System.out.println(emp2);

    }
}
