@FunctionalInterface
interface I{
    void fun(int i);
}
public class ex114 {
    public static void main(String[] args) {
        // I obj=new I(){
        //     public void fun(int i){
        //         System.out.println("Function in B"+i);
        //     }
        // };
        //This is the same for the lamda function;
        I obj=(i)->System.out.println("Function in B"+i);
        obj.fun(1);
    }
}
