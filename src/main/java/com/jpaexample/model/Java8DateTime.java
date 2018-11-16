package com.jpaexample.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;


@Entity
@Table(name="my_java8")
public class Java8DateTime {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;


    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd 'T' HH:mm:ssZ")
    private ZonedDateTime zonedDateTime;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd 'T' HH:mm:ss")
    private LocalDateTime localDateTime;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ZonedDateTime getZonedDateTime() {
        return zonedDateTime;
    }

    public void setZonedDateTime(ZonedDateTime zonedDateTime) {
        this.zonedDateTime = zonedDateTime;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
