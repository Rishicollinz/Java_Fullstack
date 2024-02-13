interface Parent{
    void display();
    void display2();
}
public class ex73 {
    public static void main(String[] args) {
        Parent p=new Parent(){//we can create an obj for an interface
            public void display(){
                System.out.println("In anonymous inner class");
                
            }
            public void display2(){
                System.out.println("This is display 2 anonymous inner class");
            }
        };
        p.display2();
        p.display();

    }
}
