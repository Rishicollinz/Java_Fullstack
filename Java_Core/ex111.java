interface A{
    void fun();
    default void dis(){
        System.out.println("Dis in interface");
    }
}
class B implements A{
  public void fun(){
      System.out.println("function in B");
  }
  public void dis(){
    System.out.println("Dis in B");
  }

}


public class ex111 {
  public static void main(String[] args) {
      
      B bobj=new B();
      bobj.fun();
      bobj.dis();

      A obj=new B();
      obj.fun();
      obj.dis();

      //o.p:
    // function in B
    // Dis in B
    // function in B
    // Dis in B
  }
}
