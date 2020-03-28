package programms;

import java.time.Duration;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class JPP3_DateTime {
    public static void main(String[] args) {
        //DateTime
        int day, month, year;
        int second, minute, hour;

        GregorianCalendar date = new GregorianCalendar();
        day  = date.get(Calendar.DAY_OF_MONTH);
        month = date.get(Calendar.MONTH);
        year = date.get(Calendar.YEAR);

        second = date.get(Calendar.SECOND);
        minute = date.get(Calendar.MINUTE);
        hour = date.get(Calendar.YEAR);

        System.out.println("Date is " + day + "/" + (month+1)  + "/" + year); // Date is 8/3/2020

//------------------------------------------------------------------------------------------------------------------------------

        //Current timestamp
        Instant timestamp = Instant.now();
        System.out.println("Current Timestamp = "+timestamp);

        //Instant from timestamp
        Instant specificTime = Instant.ofEpochMilli(timestamp.toEpochMilli());
        System.out.println("Specific Time = "+specificTime);

        //Duration example
        Duration thirtyDay = Duration.ofDays(30);
        System.out.println(thirtyDay);

    }
}
