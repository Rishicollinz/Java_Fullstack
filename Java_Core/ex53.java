import java.io.*;
import java.util.*;
class Employee{
    int id;
    String name;
    float sal;
    public Employee(int id,String name,float sal){
        this.id=id;
        this.name=name;
        this.sal=sal;
    }
    void display(){
        System.out.println("ID:"+id+" Name: "+name+" Sal: "+sal);
    }
}
public class ex53 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int id;
        String name;
        float sal;
        id=sc.nextInt();
        sc.nextLine();
        name=sc.nextLine();
        sal=sc.nextFloat();
        Employee emp1=new Employee(id, name, sal);
        id=sc.nextInt();
        sc.nextLine();
        name=sc.nextLine();
        sal=sc.nextFloat();
        Employee emp2=new Employee(id, name, sal);
        id=sc.nextInt();
        sc.nextLine();
        name=sc.nextLine();
        sal=sc.nextFloat();
        Employee emp3=new Employee(id, name, sal);

        emp1.display();
        emp2.display();
        emp3.display();
    }
}
