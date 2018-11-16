package com.jpaexample.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;


@Entity
@Table(name="my_timestamp")
public class SqlTimestamp {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private Timestamp timestampToDate;
    private Timestamp timestampToDatetime;
    private Timestamp timestampToTimestamp;
    private Timestamp timestampToTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Timestamp getTimestampToDate() {
        return timestampToDate;
    }

    public void setTimestampToDate(Timestamp timestampToDate) {
        this.timestampToDate = timestampToDate;
    }

    public Timestamp getTimestampToDatetime() {
        return timestampToDatetime;
    }

    public void setTimestampToDatetime(Timestamp timestampToDatetime) {
        this.timestampToDatetime = timestampToDatetime;
    }

    public Timestamp getTimestampToTimestamp() {
        return timestampToTimestamp;
    }

    public void setTimestampToTimestamp(Timestamp timestampToTimestamp) {
        this.timestampToTimestamp = timestampToTimestamp;
    }

    public Timestamp getTimestampToTime() {
        return timestampToTime;
    }

    public void setTimestampToTime(Timestamp timestampToTime) {
        this.timestampToTime = timestampToTime;
    }
}
