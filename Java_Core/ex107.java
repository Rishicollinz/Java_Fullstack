import java.util.*;
public class ex107 {
    public static void main(String[] args) {
        ArrayList<Employee> l=new ArrayList<>();
        l.add(new Employee(2, "jammer"));
        l.add(new Employee(4, "mouli"));
        l.add(new Employee(1, "aslam"));
        Comparator<Employee> com=new Comparator<Employee>() {
            @Override
            public int compare(Employee i,Employee j){
                if(i.exp>j.exp){
                    return 1;
                }else{
                    return -1;
                }
            }
        };
        Collections.sort(l,com);
        System.out.println(l.toString());
    }
}
/**
 * Innerex107
 */
class Employee {
    int exp;
    String name;
    Employee(){

    }
    Employee(int exp,String name){
        this.exp=exp;
        this.name=name;
    }
    public String toString(){
        return exp+" "+name;
    }
}
