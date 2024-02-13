

public class ex75 {
    public void firstFun(){
        System.out.println("In the first function");
        try{
            int a=10/0;
        }//exception handling
        catch(ArithmeticException e){
            System.out.println("The exception is "+e);
        }
    }

    public void secondFun(){
        System.out.println("In the second function");
        firstFun();
    }
    
    public static void main(String[] args) {
        ex74 obj=new ex74();
        obj.secondFun();
    }
}
