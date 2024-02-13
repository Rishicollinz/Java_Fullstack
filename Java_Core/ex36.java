import java.io.*;
import java.util.*;
public class ex36 {
    public static void main(String[] args) {
        String s1="This is Java Java Programming";
        String s2="Java";
        String s3=" Java";
        String s4="java";
        String s5=new String("Java");

        System.out.println(s1.charAt(2));//o/p:i == thi=012
        System.out.println(s1.indexOf(s2));//op:prints index where it starts from:8
        System.out.println(s1.lastIndexOf(s2));//op:prints last index 
        System.out.println(s1.replace(s2, "Python"));//replaces all but we don't give explicitly;
        System.out.println(s1.substring(8,11));
        System.out.println(s2.startsWith(s3.trim()));//returns true if satisfied//true;
        System.out.println(s1.endsWith("ing"));//true
        System.out.println(s2.equals(s3));//false because s3 contains a space;
        System.out.println(s2.equals(s3.trim()));//trim unnecessary white spaces;
        System.out.println(s2.equalsIgnoreCase(s4));//true;
        System.out.println(s2.compareTo(s4));//0 if true; any value if neg=2nd string is greater;
        System.out.println(s2.compareToIgnoreCase(s4));//0 if true;
        System.out.println(s1.contains("Java"));//true if exists;

        //format:
        String name="sonoo";
        String sf1=String.format("name is %s",name);
        String sf2=String.format("value is %.2f",32.3444);
        System.out.println(sf2);
        //%x is hexa decimal %c is char
        //%.2f decimal is two digits
        //%32.2f decimal before and after;

        //isEmpty();

        String emp="";
        String emp1=" ";
        String emp2=null;//cannot check because it is null;
        System.out.println(emp.isEmpty());//true
        System.out.println(emp1.isEmpty());//false bcoz of blankspace

        int val=25;
        String vals=String.valueOf(val);
        int val2=Integer.parseInt(vals);//str to int it can be parseInt or value of;
        System.out.println(vals+10);//2510 meaning 25+10(concat)



    }
}
