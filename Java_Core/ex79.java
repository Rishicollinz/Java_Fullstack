

public class ex79 {
    public void firstFun(){
        System.out.println("In the first function");
        try{
            int a=10/10;
            System.out.println("After 10/10:");

            try{
                int b=10/0;
            }
            catch(ArithmeticException e){
                System.out.println("The exception is "+e.getMessage());
            }
            
            System.out.println("After 10/0:");
            try{
                int[] arr={0,1,2};
                arr[3]=20;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("The exception is"+e.getMessage());
            }
            
            System.out.println("After array index out of bound:");
        }//exception handling
        catch(Exception e){
            System.out.println("The exception is "+e);
        }
    }

    public void secondFun(){
        System.out.println("In the second function");
        try{
            int a=210/0;
            System.out.println("After a");
        }
        catch(ArithmeticException e){
            System.out.println("Catch block:"+e.getMessage());
        }
        finally{
            System.out.println("Inside Finally");
        }
    }
    
    public static void main(String[] args) {
        ex79 obj=new ex79();
        obj.secondFun();
    }
}
