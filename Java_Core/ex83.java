public class ex83{
    public static void main(String[] args) {
        Employee emp1=new Employee(101, "Jack");
        Employee emp2=new Employee(101, "Jack");
        Employee emp3=emp2;
        Employee emp4=new Employee(104,"Sparrow");
        Employee emp5=new Employee(101, "Vini");
        System.out.println(emp1.hashCode()+" "+emp2.hashCode()+" "+emp3.hashCode());
        System.out.println(emp1.equals(emp2));
        System.out.println(emp1.equals(emp3));
        System.out.println(emp2.equals(emp3)); 
        System.out.println(emp1.equals(emp4));
        System.out.println(emp1.equals(emp5));
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
        if(this==obj)//checks hashcode
            return true;
        if(obj instanceof Employee){//checks whether obj is class of employee
            Employee emp=(Employee) obj;
            if(this.id==emp.id && this.name.equals(emp.name)){
                return true;
            }
        }
        
        return false;
    }
}