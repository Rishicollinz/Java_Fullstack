class Company{
    int a=10;
    void display(){
        System.out.println("Display at company");
    }
    //inner class
    static class Department{
        void display1(){
            System.out.println("I am a Department");
        }
        static void display2(){
            System.out.println("At static department");
        }
    }
}
public class ex70 {
    public static void main(String[] args) {
        Company cmp=new Company();
        Company.Department dep=new Company.Department();
        Company.Department.display2();//static inner class
        dep.display1();
    }
}
