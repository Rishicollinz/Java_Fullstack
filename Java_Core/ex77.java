

public class ex77 {
    public void firstFun(){
        System.out.println("In the first function");
        try{
            int a=10/10;
            System.out.println("After 10/10:");
            int b=10/0;
            System.out.println("After 10/0:");
            int[] arr={0,1,2};
            arr[3]=20;
            System.out.println("After array index out of bound:");
        }//exception handling
        catch(Exception e){
            System.out.println("The exception is "+e);
        }
    }

    public void secondFun(){
        System.out.println("In the second function");
        firstFun();
    }
    
    public static void main(String[] args) {
        ex77 obj=new ex77();
        obj.secondFun();
    }
}
