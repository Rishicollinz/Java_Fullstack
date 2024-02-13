import java.io.*;
import java.util.*;
class employee {
    int id;
    String name;
    employee(int id,String name){
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return id+" "+name;
    }

}

public class ex61{
    public static void main(String[] args) {
        employee emp1=new employee(101, "jack");
        employee emp2=new employee(102, "sparrow");
        employee emp3=emp2;
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        emp3.name="vini";
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
       // System.out.println(emp3.toString());
    }
}
