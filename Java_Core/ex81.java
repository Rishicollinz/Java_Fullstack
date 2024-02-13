import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.*;

public class ex81 {
    public static void main(String[] args) throws ClassNotFoundException {
        ArrayList<Field> priv=new ArrayList<>();
        ArrayList<Field> prot=new ArrayList<>();
        ArrayList<Field> pub=new ArrayList<>();
        ArrayList<Field> def=new ArrayList<>();
        Class c=Class.forName("Employee");
        Field[] f=c.getDeclaredFields();

        for (Field a : f) {
            if(Modifier.isPrivate(a.getModifiers())){
                priv.add(a);
            }
            else if(Modifier.isProtected(a.getModifiers())){
                prot.add(a);
            }
            else if(Modifier.isPublic(a.getModifiers())){
                pub.add(a);
            }else{
                def.add(a);
            }
        }
        System.out.println(priv);
        System.out.println(prot);
        System.out.println(pub);
        System.out.println(def);
    }
}
class Employee{
    public int id;
    private String name;
    protected double salary;
    String roll;
    String hi;
    int ad=2;
    private String av="helo";
    void fun(){
        System.out.println("hello");
    }
    void hello(){
        System.out.println("hii");
    }
}
