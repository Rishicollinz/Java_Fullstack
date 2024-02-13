import java.io.*;
import java.util.*;
public class ex7 {
    public static void main(String[] args) {
        String str="one two\n three four\n five six\n hello diojodi";
        Scanner sc=new Scanner(str);
        System.out.println("first :"+sc.next());
        System.out.println("second "+sc.next());
        System.out.println("Third: "+sc.next());//one two three
        System.out.println(sc.nextLine());
        System.out.println(sc.nextLine());
        System.out.println(sc.nextLine());//print upto \n
    }
}
