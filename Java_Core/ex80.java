import java.lang.reflect.Method;

public class ex80 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c=Class.forName("Employee");
        Method[] m=c.getDeclaredMethods();
        for (Method a : m) {
            System.out.println(a);
        }
    }
    

}
class Employee{
    int id;
    String name;
    void fun(){
        System.out.println("hello");
    }
    void hello(){
        System.out.println("hii");
    }
}
