@FunctionalInterface
interface A{
    void fun();
}


public class ex113 {
  public static void main(String[] args) {
   //lambda function
   
    A obj=()->System.out.println("function in B");
            
    obj.fun();

  }
}
