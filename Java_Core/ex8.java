import java.io.*;
import java.util.*;

public class ex8 {
/*    public static void main(String[] args) {
        Scanner h=new Scanner(System.in);
        String str="";
        str+=h.nextLine();
        h.close();
        Scanner sc=new Scanner(str).useDelimiter(",");
        int id=0;
        String name="";
        Float salary=(float)0;
        char gen='a';
        while(sc.hasNext()){
            id=sc.nextInt();
            name=sc.nextLine();//for getting multiple words
            salary=sc.nextFloat();
            gen=sc.next().charAt(0);
        }
        
        //2ndsc.nextLine();
        
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("Salary:"+salary);
        System.out.println("Gender:"+gen);
    
    }*/ 
    public static void main(String[] args) throws IOException {

        //Scanner sc=new Scanner(System.in);
        //String str=sc.nextLine();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        StringTokenizer st=new StringTokenizer(str, ", ");
        String name=st.nextToken();
        int id=Integer.parseInt(st.nextToken());
        float sal=Float.parseFloat(st.nextToken());
        System.out.println(name+" "+id+" "+sal);
    }
}
