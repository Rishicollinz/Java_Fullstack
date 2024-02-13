

public class ex74 {
    public void firstFun(){
        System.out.println("In the first function");
        int a=10/0;        
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
