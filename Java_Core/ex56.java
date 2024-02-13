import java.io.*;
import java.util.*;
class employee{
    int id;
    String name;
    float sal;
    void display(){
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
        System.out.println("Salary:"+sal);
    }
}

class developer extends employee{
    String skill;
}
public class ex56 {
    public static void main(String[] args) {
        employee emp=new employee();
        developer d=new developer();
        d.id=101;

        emp.display();

        d.display();
        //emp.skill="Python";//emp doesn't extend dev
    }
}
