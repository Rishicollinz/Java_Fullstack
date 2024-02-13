import java.io.*;
import java.util.*;
class Student {
    int id;
    String skill;
    float sal;
    char bands;
    int raise=1000;
    public Student(){
        System.out.println("hii");
    }
    public Student(float sal){
        this.sal=sal;
    }
    float cal_pay(float sal){
        return sal+raise;
    }
    float cal_pay(float sal,char band){
        if(band=='a'){
            sal=sal+raise+1000;
        }else if(band=='b'){
            sal=sal+raise+500;
        }else{
            sal=sal+raise+100;
        }
        return sal;
    }
    void display(){
        System.out.println(sal);
    }

}
class Manager extends Student{
    
    
}
public class ex59 {
    public static void main(String[] args) {
        Student a=new Student(100.50f);
        a.sal=a.cal_pay(a.sal);
        a.display();
        a.sal=a.cal_pay(a.sal,'a');
        a.display();
        a.sal=a.cal_pay(a.sal,'b');
        a.display();
        a.sal=a.cal_pay(a.sal,'c');
        a.display();

        Manager mgr=new Manager();
        mgr.id=110;
        mgr.skill="Spring";
        System.out.println(mgr.id+" "+mgr.skill);
    }
}
