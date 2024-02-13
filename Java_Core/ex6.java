import java.io.*;
public class ex6 {
    public static void main(String[] args){
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
        int a=Integer.parseInt(br.readLine());
        System.out.println(a); 
        }
        
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("mouli");
        }
    }
}
//we can use throws ioexception in main method also for handling io exception without try and catch block

