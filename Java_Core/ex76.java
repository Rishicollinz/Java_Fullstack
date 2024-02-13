public class ex76 {
    void second(){
        first();
    }
    void first(){
        System.out.println("Hello");
        try{
            int a=10;
        }
        finally{
            System.out.println("helo");
        }
    }
    public static void main(String[] args) {
        ex76 obj=new ex76();
        obj.second();
    }
}
