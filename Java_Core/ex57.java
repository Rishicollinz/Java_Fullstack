import java.io.*;
import java.util.*;
class employee{
    int id;
    String name;
    float sal;
    public employee(){//this is not required but we need for developer which checks this default constructor
    }
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
        this.id=id;
        this.name=name;
        this.sal=sal;
        this.skill=skill;
    }
}
public class ex57 {
    public static void main(String[] args) {
        employee emp=new employee(15,"rishi",12.20f);
        developer d=new developer(20,"jd",52.25f,"stringd");
        d.id=101;
        emp.display();
        d.display();
        //emp.skill="Python";//emp doesn't extend dev
    }
}
