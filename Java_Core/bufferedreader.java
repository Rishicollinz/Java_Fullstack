import java.io.*;
public class bufferedreader {
    public static void main(String args[]){
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            int id=Integer.parseInt(br.readLine());
            String name=br.readLine();
            Float salary=Float.parseFloat(br.readLine());
            //char gen=br.read();//It throws IO Exception which is due to bottle neck problem
            //where id,name,salary are big\multiple char whereas gen is a single char;
            char gen=br.readLine().charAt(0);
            boolean bz=Boolean.valueOf(br.readLine());
            System.out.println("Id: "+id);
            System.out.println("Name: "+name);
            System.out.println("Salary: "+salary);
            System.out.println("Gender: "+gen);
            System.out.println(bz);//boolean default value false, so bz=is not true/false it is false
        }
        catch(Exception e){
            System.out.println("Error: "+e);
        }
    }
}
