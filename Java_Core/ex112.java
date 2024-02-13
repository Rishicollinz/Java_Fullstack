
interface A{
    void fun();
    default void dis(){
         System.out.println("Dis in interface");
     }
}


public class ex112 {
  public static void main(String[] args) {
      A obj=new A(){
        public void fun(){
            System.out.println("function in B");
        }
      };
        
            
      obj.fun();
      obj.dis();

  }
}
