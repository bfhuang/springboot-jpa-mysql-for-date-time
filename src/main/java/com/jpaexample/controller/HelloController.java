package com.jpaexample.controller;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;

import com.jpaexample.model.*;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Dinesh.Rajput
 */
@RestController
public class HelloController {

    @Autowired
    UtilDateRepository utildateRepository;


    @Autowired
    SqlDateRepository sqldateRepository;

    @Autowired
    SqlTimeRepository sqltimeRepository;


    @Autowired
    SqlTimestampRepository sqltimestampRepository;

    @Autowired
    Java8DatetimeRepository java8DatetimeRepository;

    @Autowired
    JodaRepository jodaRepository;


    @RequestMapping("/add-utildate")
    public UtilDate hello() {

        Date date = new Date();
        UtilDate utilDate = new UtilDate();

        utilDate.setUtildateToTimestamp(date);
        utilDate.setUtildateToDate(date);
        utilDate.setUtildateToDatetime(date);
        utilDate.setUtildateToTime(date);
        UtilDate save = utildateRepository.save(utilDate);
        return save;
    }


    @RequestMapping("/add-joda")
    public Joda hello2() {

        Joda joda = new Joda();
        joda.setJodaDateTime(DateTime.now(DateTimeZone.UTC));
        joda.setJodaLocalDateTime(org.joda.time.LocalDateTime.now(DateTimeZone.UTC));

        Joda save = jodaRepository.save(joda);

        return save;


    }

    @PostMapping("/add-joda")
    public Joda joda(@RequestBody Joda joda) {

//        joda.setJodaLocalDateTime(org.joda.time.LocalDateTime.now(DateTimeZone.UTC));

        Joda save = jodaRepository.save(joda);

        return save;


    }

    @PostMapping("/add-utildate")
    public UtilDate hello1(@RequestBody UtilDate utilDate) {
        System.out.println(utilDate.getUtildateToDate());
        UtilDate save = utildateRepository.save(utilDate);
        return save;
    }

    @RequestMapping("/add-utildates")
    public List<UtilDate> hello1() {

        List<UtilDate> save = (List<UtilDate>) utildateRepository.findAll();
        return save;
    }


    @RequestMapping("/add-sqldate")
    public SqlDate sqldate() {
        java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
        SqlDate sqlDate = new SqlDate();

        sqlDate.setSqldateToDate(date);
        sqlDate.setSqldateToDatetime(date);
        sqlDate.setSqldateToTimestamp(date);
        SqlDate save = sqldateRepository.save(sqlDate);
        return save;
    }



    @RequestMapping("/add-sqltimestamp")
    public SqlTimestamp sqltime() {
//        Timestamp time = new Timestamp(System.currentTimeMillis());
        System.out.println(LocalDateTime.now(ZoneId.of("Australia/Sydney")));

        LocalDateTime now = LocalDateTime.now(ZoneId.of("Australia/Sydney"));
        Timestamp time = Timestamp.valueOf(now);

        System.out.println(time);
        SqlTimestamp timestamp = new SqlTimestamp();

        timestamp.setTimestampToDate(time);
        timestamp.setTimestampToDatetime(time);
        timestamp.setTimestampToTime(time);
        timestamp.setTimestampToTimestamp(time);


        SqlTimestamp save = sqltimestampRepository.save(timestamp);
        return save;
    }



    @RequestMapping("/add-java8datetime")
    public Java8DateTime localdatetime() {
        LocalDateTime now = LocalDateTime.now(ZoneId.of("Australia/Sydney"));
        Java8DateTime localDatetime = new Java8DateTime();

        localDatetime.setLocalDateTime(LocalDateTime.now());
        localDatetime.setZonedDateTime(ZonedDateTime.now());

        Java8DateTime save = java8DatetimeRepository.save(localDatetime);
        return save;
    }


    @PostMapping("/add-java8datetime")
    public Java8DateTime localdatetime1(@RequestBody Java8DateTime localDatetime) {
        Java8DateTime save = java8DatetimeRepository.save(localDatetime);
        return save;
    }


}