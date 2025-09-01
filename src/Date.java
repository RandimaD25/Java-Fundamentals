import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main (String[] args) {
//        How to work with DATES & TIMES using Java
//        (LocalDate, LocalTime, LocalDateTime, UTC timestamp)

//        Current date
        LocalDate date = LocalDate.now();
        System.out.println(date);

//        Current time
        LocalTime time = LocalTime.now();
        System.out.println(time);

//        Current date and time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

//        Current date and time in UTC
        Instant instant = Instant.now();
        System.out.println(instant);

//        Custom format to display the date time
        LocalDateTime currentDate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String newDateTime = currentDate.format(formatter);
        System.out.println(newDateTime);

//        Instead of getting time and date right now, we can get custom date and time
        LocalDate date1 = LocalDate.of(2025, 9, 1);
        System.out.println(date1);

        LocalDateTime date2 = LocalDateTime.of(2025, 9, 1, 17, 22, 30);
        LocalDateTime date3 = LocalDateTime.of(2025, 1, 1, 0, 0, 0);

        if (date2.isBefore(date3)) {
            System.out.println(date2 + " is earlier than " + date3);
        } else if (date2.isAfter(date3)) {
            System.out.println(date2 + " is later than " + date3);
        } else if (date2.isEqual(date3)) {
            System.out.println(date2 + " is equal " + date3);
        }
    }
}
