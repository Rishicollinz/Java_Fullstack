import java.io.*;
import java.util.*;

import javax.sound.sampled.SourceDataLine;
class Employee{
    private int id;
    private double salary;
    private String name;
    //using getters and setters from source
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
}

public class ex67 {
    public static void main(String[] args) {
        Employee emp1=new Employee();
        emp1.setName("Jack");
        emp1.setSalary(101.25);
        emp1.setId(25);
        System.out.println(emp1.getId());
        System.out.println(emp1.getName()+" "+emp1.getId()+" "+emp1.getSalary());

    }
    
}
