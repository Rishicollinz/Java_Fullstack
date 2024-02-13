import java.io.*;
//reading from a file
public class br2 {
    public static void main(String args[]) throws FileNotFoundException{
        FileReader fr=new FileReader("d.txt");
        BufferedReader br=new BufferedReader(fr);
        try{
            int id=Integer.parseInt(br.readLine());
            String name=br.readLine();
            Float salary=Float.parseFloat(br.readLine());
            //char gen=br.read();//It throws IO Exception which is due to bottle neck problem
            //where id,name,salary are big\multiple char whereas gen is a single char;
            char gen=br.readLine().charAt(0);
            System.out.println("Id: "+id);
            System.out.println("Name: "+name);
            System.out.println("Salary: "+salary);
            System.out.println("Gender: "+gen);
        }
        catch(Exception e){
            System.out.println("Error: "+e);
        }
    }
}
