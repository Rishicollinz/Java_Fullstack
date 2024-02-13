@FunctionalInterface
interface I{
    int fun(int a,int b);
}
public class ex115 {
    public static void main(String[] args) {
        I obj=new I(){
            public int fun(int a,int b){
                return a+b;
            }
        };
        //This is the same for the lamda function;
        //I obj=(int a,int b)->a+b;// there is no return bcoz lambda is already a return.
        int c=obj.fun(1,2);
        System.out.println(c);
    }
}
