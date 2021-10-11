package com.mycompany.quote.models.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.ZonedDateTime;

@Entity
//table annotation is used to change the name of the table if required
@Table(name = "event")
@Setter @Getter
public class Event {
    //id creates primary key and generated value is to create id automatically
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @NotBlank(message = "Event Title must be provided")
    @Column(name = "event_title")
    private  String eventTitle;

    @Column(name ="event_description")
    private String description;

    @Column(name = "event_date")
    private ZonedDateTime date;

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd 'T' HH:mm:ssZ")
    @Column(name = "created_at")
    private ZonedDateTime createdAt;

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd 'T' HH:mm:ssZ")
    @Column(name = "updated_date")
    private ZonedDateTime updatedAt;

    public Event(){

    }


}
