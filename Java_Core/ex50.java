import java.io.*;
import java.util.*;
class Employee{
    int id;
    String name;
    public Employee(int id,String name){
        this.id=id;
        this.name=name;
    }
    String display(){
        
        return ("ID:"+id+" "+"Name:"+name);
        
    }

}
public class ex50  {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        /* user defined
        int id=0;
        String name=null;
        String input[]=new String[3];
        for(int i=0;i<3;i++){
            System.out.println("Enter the emp.no:"+(i+1));
            id=sc.nextInt();
            sc.nextLine();
            name=sc.nextLine();
            input[i]=name+" "+id;
        }
        for(int i=0;i<3;i++){
            StringTokenizer st=new StringTokenizer(input[i], " ");
            while (st.hasMoreTokens()) {  
                name=st.nextToken();
                id=Integer.parseInt(st.nextToken());
            }  
            Employee emp=new Employee(id,name);
            emp.display();
        }
         */
        //instaneous
        String input=sc.nextLine();
        String arr[]=new String[3];
        String name=null;
        int id=0;
        StringTokenizer st=new StringTokenizer(input, "|");
        int i=0;
            while (st.hasMoreTokens()) {  
                arr[i]=st.nextToken();
                i++;
            }

            String arr2[]=new String[3];
            String returned="";
        for(i=0;i<3;i++){
            StringTokenizer sst=new StringTokenizer(arr[i], ",");
            while (sst.hasMoreTokens()) {  
                
                id=Integer.parseInt(sst.nextToken());
                name=sst.nextToken();
            }  
            Employee emp=new Employee(id,name);
            returned=emp.display();

            
                arr2[i]=returned;
        //instaneous
    }
    System.out.println(Arrays.toString(arr2));
}
}
