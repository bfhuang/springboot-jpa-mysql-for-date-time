package com.jpaexample.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;


@Entity
@Table(name="my_utildate")
public class UtilDate {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;


    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd 'T' HH:mm:ssZ")
    private Date utildateToDate;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd 'T' HH:mm:ssZ")
    private Date utildateToDatetime;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd 'T' HH:mm:ssZ")
    private Date utildateToTimestamp;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd 'T' HH:mm:ssZ")
    private Date utildateToTime;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getUtildateToDate() {
        return utildateToDate;
    }

    public void setUtildateToDate(Date utildateToDate) {
        this.utildateToDate = utildateToDate;
    }

    public Date getUtildateToDatetime() {
        return utildateToDatetime;
    }

    public void setUtildateToDatetime(Date utildateToDatetime) {
        this.utildateToDatetime = utildateToDatetime;
    }

    public Date getUtildateToTimestamp() {
        return utildateToTimestamp;
    }

    public void setUtildateToTimestamp(Date utildateToTimestamp) {
        this.utildateToTimestamp = utildateToTimestamp;
    }

    public Date getUtildateToTime() {
        return utildateToTime;
    }

    public void setUtildateToTime(Date utildateToTime) {
        this.utildateToTime = utildateToTime;
    }

}
