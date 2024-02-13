public class ex82{
    public static void main(String[] args) {
        Employee emp1=new Employee(101, "Jack");
        Employee emp2=new Employee(101, "Jack");
        Employee emp3=emp2;
        System.out.println(emp1.hashCode()+" "+emp2.hashCode()+" "+emp3.hashCode());
        System.out.println(emp1.equals(emp2));
        System.out.println(emp1.equals(emp3));
        System.out.println(emp2.equals(emp3));
       /*Nullpointer 
        try{
        System.out.println(emp1.equals(null));
        }
        catch(NullPointerException e){
            System.out.println("The value is null");
        }*/
        /*ClasscastException  
        try{
        System.out.println(emp1.equals("Jack"));
        }
        catch(ClassCastException e){
            System.out.println(e);
        }*/
    }
}
class Employee{
    int id;
    String name;
    Employee(int id,String name){
        this.id=id;
        this.name=name;
    }
    public boolean equals(Object obj) {
        Employee emp=(Employee) obj;
        if(this.id==emp.id && this.name.equals(emp.name)){
            return true;
        }
        return false;
    }
}