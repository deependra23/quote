package com.mycompany.quote.models.dto;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.Date;
//entity annotation create table in the database
@Entity
//table annotation is used to change the name of the table if required
@Table(name = "event")
public class EventDTO {
    //id creates primary key and generated value is to create id automatically
    @Id
    @GeneratedValue
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
    private Date updatedDate;

    public EventDTO(){

    }

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}
