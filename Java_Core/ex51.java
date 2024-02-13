import java.io.*;
import java.util.*;
class Employee{
    int id;
    String name;
    float sal;
    public Employee(String empd){
        String a[]=empd.split(",");
        id=Integer.parseInt(a[0]);
        name=a[1];
        sal=Float.parseFloat(a[2]);
    }
}
public class ex51 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        int id=0;
        String name=null;
        String arr[]=new String[3];
        StringTokenizer st=new StringTokenizer(input, "|");
        int i=0;
        while (st.hasMoreTokens()) {  
            arr[i]=st.nextToken();
            i++;
        }
        System.out.println(Arrays.toString(arr));
        Employee a=new Employee(arr[0]);
        
        Employee b=new Employee(arr[1]);
        Employee c=new Employee(arr[2]);
        System.out.println(a.id);
        System.out.println(a.name);
        System.out.println(a.sal);
        
}
}
