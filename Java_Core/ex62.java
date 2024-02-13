import java.io.*;
import java.util.*;
//deep copy
class Employee {
    int id=0;
    String name="";
    Employee(){

    }
    Employee(int id,String name){
        this.id=id;
        this.name=name;
    }
    //tostring override
    public String toString(){
        return id+" "+name;
    }

}

public class ex62{
    public static void main(String[] args) {
        Employee emp1=new Employee(101, "jack");
        Employee emp2=new Employee(102, "sparrow");
        Employee emp3=new Employee();
        emp3.id=emp2.id;
        emp3.name=emp2.name;
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        emp3.name="vini";
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
    }
}
