package Day2.memberInnerClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class WorkingWithDateTime {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        LocalTime time=LocalTime.now();
        LocalDateTime dateTime=LocalDateTime.now();
        System.out.println("Date: "+date);
        System.out.println("Time: "+time);
        System.out.println("Date & Time: "+dateTime);
        /*
        Display the day of the month
        Display the day of the year
        Display the Week Name, Month Name, Month Number
        E - Name of the day:(mon - sun)
        D - Day of the year( 1- 366)
        dd - Day of the month(1 - 31)
        M - month Number ( 1 -12)
        MMM - Month name (jan - dec)
        yyyy - Year
         */
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("E, MM dd yyyy");
        String formattedDateTime=dateTime.format(formatter);
        System.out.println("formatted date: "+formattedDateTime);
    }
}
