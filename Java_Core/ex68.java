import java.io.*;
import java.util.*;

class Third{
    int var3=100;
    void function3(){
        System.out.println("Third class function 3");
    }
    void function(){
        System.out.println("Third class function");
    }
}
class Second extends Third{
    int var2=200;
    void function2(){
        System.out.println("Second class function 2");
    }
    void function(){
        System.out.println("Second class function");
    }
}
public class ex68 {
    public static void main(String[] args) {
        //Third objs=new Third(); //all members and functions of class third;
        Second obj=new Second();//all second and third class members and functions;
        obj.function();//overriden function means it priorites the current class;
        //implementation of overriden of second class only.
        //objs.function();


        //upcasting
        Third t=new Second();//object reference is third //space is for second
        //parent reference , child space;
        t.function();
        //here it takes all functions from third(parent),
        //takes overriden function from second(child);

        //we convert from big to small in typecasting;but cannot from small to big. so 
        //we use typecasting;
        //Second st=(Second)new Third(); we didnot call third obj here...so below
        Second st=(Second) t;
        st.function();
        
        
    }
    
}
