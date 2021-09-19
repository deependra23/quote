package com.mycompany.quote.models.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.Date;

@Entity
//table annotation is used to change the name of the table if required
@Table(name = "event")
@Setter @Getter
public class Event {
    //id creates primary key and generated value is to create id automatically
    @Id
    @GeneratedValue
    private
    int id;

    @Column(name = "event_title")
    private  String eventTitle;

    @Column(name ="event_description")
    private String description;

    @Column(name = "event_date")
    private Date date;

    @Column(name = "created_at")
    private ZonedDateTime createdAt;

    @Column(name = "updated_date")
    private Date updatedAt;

    public Event(){

    }


}
