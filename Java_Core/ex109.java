interface A{
    void fun();
}
//this class is comment for anonymous inner class
/*
class B implements A{
  public void fun(){
      System.out.println("function in B");
  }
}
*/

public class ex109 {
  public static void main(String[] args) {
      /*direct obj method
      B bobj=new B();
      bobj.fun();*/

      /*we can't directly create obj for interface
       * A obj=new A();
       */

       //we use anonymous inner class for that
       /*method 2
       interface var=new interface-implementing class;
       A obj=new B();
       obj.fun();*/

       //Anonymous inner class
       //direct interface obj creation;
       A obj=new A() {
        public void fun(){
            System.out.println("function in B");
        }
       };
       obj.fun();
      
  }
}

// class B is defined just for the implementation of interface abstract method.
// This class declaration can be avoided using Anonymous class .
// Replacing the child class be implementing the interface by anonymous class.