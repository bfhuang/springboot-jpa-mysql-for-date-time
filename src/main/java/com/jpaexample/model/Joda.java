package com.jpaexample.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.Date;


@Entity
@Table(name="my_joda")
public class Joda {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;


    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ssZ")
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    private DateTime jodaDateTime ;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss")
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDateTime")
    private org.joda.time.LocalDateTime jodaLocalDateTime ;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public DateTime getJodaDateTime() {
        return jodaDateTime;
    }

    public void setJodaDateTime(DateTime jodaDateTime) {
        this.jodaDateTime = jodaDateTime;
    }

    public LocalDateTime getJodaLocalDateTime() {
        return jodaLocalDateTime;
    }

    public void setJodaLocalDateTime(LocalDateTime jodaLocalDateTime) {
        this.jodaLocalDateTime = jodaLocalDateTime;
    }
}
