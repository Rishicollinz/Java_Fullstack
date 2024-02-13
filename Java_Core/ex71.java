class Company{
    int a=10;
    void getData(int a,int b){
        class Department{
            void add(int x,int y){
                System.out.println(x+y);
            }
        }
        Department dep=new Department();
        dep.add(a,b);
    }
}
public class ex71 {
    public static void main(String[] args) {
        Company cmp=new Company();
        cmp.getData(10, 20);
        
    }
    
}

