package com.mycompany.quote.models.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;
import java.util.Date;
//entity annotation create table in the database
@Setter @Getter
public class EventDTO {
    //id creates primary key and generated value is to create id automatically

    private int id;
    private String eventTitle;
    private String description;
    private Date date;
    private ZonedDateTime createdAt;
    private Date updatedAt;

    public EventDTO(){

    }

}
