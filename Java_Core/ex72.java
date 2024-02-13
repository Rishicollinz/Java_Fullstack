class Parent{
    void display(){
        System.out.println("In parent");
    }
    void display2(){
        System.out.println("Hello mouli");
    }
}
public class ex72 {
    public static void main(String[] args) {
        Parent p=new Parent(){
            //this place is known as anonymous inner class.
            //it supports one overriden method for parent;
            void display(){
                System.out.println("In anonymous inner class");
                //super.display();
            }
            void display2(){
                System.out.println("This is display 2 anonymous inner class");
            }
        };
        Parent p1=new Parent();
        p.display2();
        p1.display();//prints in parent
        p.display();//prints in anonymous inner class

    }
}
