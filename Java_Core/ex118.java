package Java_Core;

import java.text.SimpleDateFormat;

public class ex118 {
    public static void main(String[] args) {
        String dateString="2022-05-31";
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        try{
            java.util.Date date=format.parse(dateString);
            System.out.println("Date: "+date);

        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
