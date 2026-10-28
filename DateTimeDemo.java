import java.time.*;
import java.time.format.DateTimeFormatter;
public class DateTimeDemo {
public static void main(String[] args) {
LocalDate date = LocalDate.now();
LocalTime time = LocalTime.now();
LocalDateTime dt = LocalDateTime.now();
System.out.println("Date : " + date);
System.out.println("Time : " + time);
System.out.println("Date-Time : " + dt);


DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
System.out.println("Formatted : " + dt.format(f));

System.out.println("After 10 days: " + date.plusDays(10));

LocalDate birth = LocalDate.of(2005, 5, 15);
Period p = Period.between(birth, date);
System.out.println("Age: " + p.getYears() + " years");
}
}
