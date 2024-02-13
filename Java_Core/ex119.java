package Java_Core;
import java.time.*;//from java 8;
//calender
public class ex119 {
    public static void main(String[] args) {
        //dates
        LocalDate ld=LocalDate.now();//current date;
        //manually assigning date
        LocalDate ld1=LocalDate.of(2021, 1, 13);
        System.out.println(ld+" "+ld1);
        
        //times
        LocalTime lt=LocalTime.now();
        LocalTime lt1=LocalTime.of(22,15);
        System.out.println(lt+" "+lt1);

        //date and time;
        LocalDateTime ldt=LocalDateTime.now();
        LocalDateTime ldt1=LocalDateTime.of(ld,lt);
        System.out.println(ldt+" "+ldt1);

        //zoned date and time;
        ZonedDateTime zdt1=ZonedDateTime.of(ldt, ZoneId.of("Asia/Tokyo"));
        ZonedDateTime zdt=ZonedDateTime.of(ldt,ZoneId.of("Asia/Tokyo"));
        System.out.println(zdt+" "+zdt1);
    }
}
