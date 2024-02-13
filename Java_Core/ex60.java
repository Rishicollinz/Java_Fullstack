import java.io.*;
import java.util.*;
//method overloading:
class employee{
    int id;
    String name;
    float sal;
    /*public employee(){//this is not required but we need for developer which checks this default constructor
    }*/ //Now we don't need this because we give developer to employee by super.
    public employee(){}
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
    public developer(){

    }
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
class Manager extends developer{
    developer manages=new developer();
    public Manager(String name,int id,float sal,String skills,developer man){
        super(id,name,sal,skills);
        
            manages=man;
        
    }
    void display(){
        super.display();
        System.out.println("\nManager manages:"+manages);
    }
}
public class ex60 {
    public static void main(String[] args) {
        employee emp=new employee(15,"rishi",12.20f);
        developer d=new developer(20,"jd",52.25f,"stringd");
        developer d2=new developer(55, "jdjd", 555.555f, "jdjdd");
        
        //emp.display();
        //d.display(); we don't need it now, bcoz we used info to do that by using super keyword;
        //d.display();//runtime polymorphism
        //emp.skill="Python";//emp doesn't extend dev
        String man[]={"dev1","dev2"};
        Manager mgr=new Manager("Raja",1,5000.00f,"skills",d2);
        mgr.display();
        System.out.println(d);
    }
}
/*This is known as overriding:runtime polymorphism:
if it can't hit the display in child class, it automatically goes to parent class display method;
*/