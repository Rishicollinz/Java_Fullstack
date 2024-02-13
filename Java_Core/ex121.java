package Java_Core;

import java.util.Locale;  
import java.util.ResourceBundle;  
public class ex121 {  
 public static void main(String[] args) {  
    ResourceBundle messages=ResourceBundle.getBundle("messages");
    String name="John";
    String greeting=messages.getString("greeting");
    String formattedGreeting=String.format(greeting,name);
    System.out.println();  
  ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle", Locale.US);  
  System.out.println("Message in "+Locale.US +":"+bundle.getString("greeting"));  
  
  //changing the default locale to indonasian   
  Locale.setDefault(new Locale("hi", "IN"));  
  bundle = ResourceBundle.getBundle("MessageBundle");  
  System.out.println("Message in "+Locale.getDefault()+":"+bundle.getString("greeting"));  
  
 }  
}  