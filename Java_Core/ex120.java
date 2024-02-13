package Java_Core;
import java.time.*;//from java 8;
import java.time.format.DateTimeFormatter;
//calender,resource bundle
public class ex120 {
    public static void main(String[] args) {
        //dates
        LocalDate ld=LocalDate.now();//current date;
        //manually assigning date
        LocalDate ld1=LocalDate.of(2021, 1, 31);
        System.out.println(ld.getDayOfWeek());

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy.MM.dd");
        System.out.println(ld.format(dtf));
        
        //times
        LocalTime lt=LocalTime.now();
        LocalTime lt1=LocalTime.of(22,15);

        //date and time;
        LocalDateTime ldt=LocalDateTime.now();
        LocalDateTime ldt1=LocalDateTime.of(ld,lt);

        //zoned date and time;
        ZonedDateTime zdt1=ZonedDateTime.of(ldt, ZoneId.of("Asia/Tokyo"));
        ZonedDateTime zdt=ZonedDateTime.of(ldt,ZoneId.of("Asia/Tokyo"));
    }
}
