import java.io.*;
import java.util.*;
public class ex12 {
    public static void main(String[] args) {
        System.out.println("a.Just Browsing\nb.Connect to support\nc.Enquiry");
        Scanner sc=new Scanner(System.in);
        char ctr=sc.next().charAt(0);
        //max use case 35;
        final char dd='k';
        switch(ctr){
            case dd :
            case 'b':
            case 'c':
            System.out.println("combined switchcase");
            break;
            default:
                System.out.println("default");
                break;
        }
    }
}
