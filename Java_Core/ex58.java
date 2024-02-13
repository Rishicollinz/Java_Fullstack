import java.io.*;
import java.util.*;
//method overloading:
class employee{
    int id;
    String name;
    float sal;
    /*public employee(){//this is not required but we need for developer which checks this default constructor
    }*/ //Now we don't need this because we give developer to employee by super.
    public employee(int id,String name,float sal){
        this.id=id;
        this.name=name;
        this.sal=sal;
    }
    void display(){
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
        System.out.println("Salary:"+sal);
    }
}

class developer extends employee{
    String skill;
    public developer(int id,String name,float sal,String skill){
        /*this.id=id;
        this.name=name; we don't need this bcoz already declared in employee
        this.sal=sal;*/ //this means current class, super means parent class
        super(id,name,sal);
        this.skill=skill;
    }
    
    void display(){//this is called as overriding (polymorphism)
        //we can call super.display to directly run it from here;
        super.display();
        System.out.println("Skill:"+skill);
    }
    
}
public class ex58 {
    public static void main(String[] args) {
        employee emp=new employee(15,"rishi",12.20f);
        developer d=new developer(20,"jd",52.25f,"stringd");
        
        emp.display();
        //d.display(); we don't need it now, bcoz we used info to do that by using super keyword;
        d.display();//runtime polymorphism
        //emp.skill="Python";//emp doesn't extend dev
    }
}
/*This is known as overriding:runtime polymorphism:
if it can't hit the display in child class, it automatically goes to parent class display method;
*/