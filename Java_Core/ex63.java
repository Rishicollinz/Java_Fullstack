import java.io.*;
import java.util.*;
//deep copy
class Employee implements Cloneable {
    int id=0;
    String name="";
    
    Employee(int id,String name){
        this.id=id;
        this.name=name;
    }
    //tostring override
    public String toString(){
        return id+" "+name;
    }
    //here we use this because 
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}

public class ex63  {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee emp1=new Employee(101, "jack");
        Employee emp2=new Employee(102, "sparrow");
        //here .clone() is protected(can inherit only by itself and its inherited class)
        Employee emp3=(Employee)emp2.clone();
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);

        emp3.name="vini";

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
    }
}
