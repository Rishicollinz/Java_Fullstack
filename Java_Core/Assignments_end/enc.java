
class Encapsulation{
    int age;
    String name;
    int rollno;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    
}
public class enc {
    public static void main(String[] args) {
        Encapsulation a=new Encapsulation();
        a.setAge(10);
        a.setName("Aravind");
        a.setRollno(20084);

        System.out.println(a.getAge()+" "+a.getName()+" "+a.getRollno());
        //we can directly access the variable
    }
}
