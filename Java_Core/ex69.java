class Company{
    int a=10;
    void display(){
        System.out.println("Display at company");
    }
    //inner class
    class Department{
        void display1(){
            System.out.println("I am a Department");
        }
    }
}
public class ex69 {
    public static void main(String[] args) {
        Company cmp=new Company();
        System.out.println(cmp.a);
        cmp.display();
        //to access inner class
        Company.Department dep=cmp.new Department();
        dep.display1();
        //cmp.dep.display1(); we can't access a obj;
    }
}
