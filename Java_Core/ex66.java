import java.io.*;
import java.util.*;

import javax.sound.sampled.SourceDataLine;
class Employee{
    private int id;
    double salary;
    String name;
    Employee(String name,double salary){
        
        this.name=name;
        this.salary=salary;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
}

public class ex66 {
    public static void main(String[] args) {
        Employee emp1=new Employee("jack", 102.15);//here id is accessed by employee
        emp1.setId(25);
        System.out.println(emp1.getId());
        System.out.println(emp1.name);

    }
    
}
