package com.jpaexample.model;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name="my_sqldate")
public class SqlDate {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;


    private Date sqldateToDate;
    private Date sqldateToDatetime;
    private Date sqldateToTimestamp;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getSqldateToDate() {
        return sqldateToDate;
    }

    public void setSqldateToDate(Date sqldateToDate) {
        this.sqldateToDate = sqldateToDate;
    }

    public Date getSqldateToDatetime() {
        return sqldateToDatetime;
    }

    public void setSqldateToDatetime(Date sqldateToDatetime) {
        this.sqldateToDatetime = sqldateToDatetime;
    }

    public Date getSqldateToTimestamp() {
        return sqldateToTimestamp;
    }

    public void setSqldateToTimestamp(Date sqldateToTimestamp) {
        this.sqldateToTimestamp = sqldateToTimestamp;
    }
}
