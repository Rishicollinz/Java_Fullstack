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
public class ex54 {
    public static void main(String[] args) {
        int i,id;
        String name;
        float sal;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Employee:");
        int size=sc.nextInt();
        
        Employee emp[]=new Employee[size];
        for(i=0;i<emp.length;i++){
            id=sc.nextInt();
            sc.nextLine();
            name=sc.nextLine();
            sal=sc.nextFloat();
            Employee e=new Employee(id, name, sal);
            emp[i]=e;
        }
        for(i=0;i<emp.length;i++){
            emp[i].display();
        }
    }
}

