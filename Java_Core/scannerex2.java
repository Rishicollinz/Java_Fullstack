//reading from a file using scanner
import java.io.*;
import java.util.*;
public class scannerex2 {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr=new FileReader("d.txt");
        Scanner sc=new Scanner(fr);
        while(sc.hasNext()){
            int id=sc.nextInt();
            String name=sc.next();
            Float salary=sc.nextFloat();
            char gen=sc.next().charAt(0);
            System.out.println("ID:"+id);
            System.out.println("Name:"+name);
            System.out.println("Salary:"+salary);
            System.out.println("Gender:"+gen);
        }
    
    }
}
