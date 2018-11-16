package com.jpaexample.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;


@Entity
@Table(name="my_sqltime")
public class SqlTime {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;


    private Time sqltimeToTime;
    private Time sqltimeToDatetime;
    private Time sqltimeToTimestamp;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Time getSqltimeToTime() {
        return sqltimeToTime;
    }

    public void setSqltimeToTime(Time sqltimeToTime) {
        this.sqltimeToTime = sqltimeToTime;
    }

    public Time getSqltimeToDatetime() {
        return sqltimeToDatetime;
    }

    public void setSqltimeToDatetime(Time sqltimeToDatetime) {
        this.sqltimeToDatetime = sqltimeToDatetime;
    }

    public Time getSqltimeToTimestamp() {
        return sqltimeToTimestamp;
    }

    public void setSqltimeToTimestamp(Time sqltimeToTimestamp) {
        this.sqltimeToTimestamp = sqltimeToTimestamp;
    }
}
