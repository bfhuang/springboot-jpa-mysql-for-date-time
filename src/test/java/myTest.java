import com.fasterxml.jackson.annotation.JsonFormat;
import com.jpaexample.model.UtilDate;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.junit.Test;

import java.sql.Timestamp;
import java.time.*;
import java.util.Date;

public class myTest {

    @Test
    public void name() {
        LocalDateTime now1 = LocalDateTime.now(ZoneId.of("Australia/Sydney"));

        System.out.println(now1);
//        Timestamp timestamp = Timestamp.valueOf(now1);


//
        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime of = ZonedDateTime.of(2018, 10, 7, 1, 59, 58, 00, ZoneId.of("Australia/Sydney"));
        System.out.println(of);
        of = of.plusSeconds(1);
        System.out.println(of);
        of = of.plusSeconds(1);
        System.out.println(of);

        of = of.plusSeconds(1);
        System.out.println(of);

        of = of.plusSeconds(1);
        System.out.println(of);
        of = of.plusSeconds(1);
        System.out.println(of);
        of = of.plusSeconds(1);
        System.out.println(of);


        ZonedDateTime of1 = ZonedDateTime.of(2016, 12, 31, 23, 59, 58, 00, ZoneId.of("Greenwich"));

        System.out.println(of1);
        of1 = of1.plusSeconds(1);
        System.out.println(of1);
        of1 = of1.plusSeconds(1);
        System.out.println(of1);
        of1 = of1.plusSeconds(1);
        System.out.println(of1);
        of1 = of1.plusSeconds(1);
        System.out.println(of1);
        of1 = of1.plusSeconds(1);
        System.out.println(of1);
        of1 = of1.plusSeconds(1);


        System.out.println("---------------}|");
        org.joda.time.DateTime jodaDateTime;
        org.joda.time.LocalDateTime jodaLocalDateTime;
        org.joda.time.DateTimeZone jodaDateTimeZone;

        DateTime now2 = DateTime.now(DateTimeZone.UTC);
        DateTime now3 = DateTime.now();
        System.out.println(now2);
        System.out.println(now3);


    }


    @Test
    public void name3() {
        Date x = new Date();
        System.out.println(x);
        System.out.println(new java.sql.Date(x.getTime()));
        System.out.println(new java.sql.Time(x.getTime()));
        System.out.println(new java.sql.Timestamp(x.getTime()));
        System.out.println( java.time.ZonedDateTime.now());
        System.out.println( java.time.LocalDateTime.now());
        System.out.println( java.time.LocalDate.now());
        System.out.println( java.time.LocalTime.now());

        System.out.println("-------------");
        System.out.println( org.joda.time.LocalTime.now());
        System.out.println( org.joda.time.DateTime.now());
        System.out.println( org.joda.time.LocalDate.now());
    }


    @Test
    public void name5() {
        System.out.println(ZoneId.getAvailableZoneIds());
        System.out.println(ZonedDateTime.now(ZoneId.of("-12")));
        System.out.println(ZonedDateTime.now());
        System.out.println(ZonedDateTime.now(ZoneId.of("GMT+11")));

    }

    public void change(UtilDate utilDate) {
        System.out.println(utilDate);
        utilDate.setId(2);
    }


}
