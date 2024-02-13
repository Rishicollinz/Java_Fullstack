import java.io.*;
import java.util.*;
public class ex11 {
    public static void main(String[] args) {
        System.out.println("a.Just Browsing\nb.Connect to support\nc.Enquiry");
        Scanner sc=new Scanner(System.in);
        char ctr=sc.next().charAt(0);
        //max use case 35;
        final char dd='k';
        switch(ctr){
            case dd://can't use variable here but can use final variable;
                System.out.println("Enjoy your time");
                break;
            case 'b':
                System.out.println("our rep will contact");
                break;
            case 'c':
                System.out.println("Our team will join with you now");
                break;
            default:
                System.out.println("Give the possible options");
                break;
        }
    }
}
