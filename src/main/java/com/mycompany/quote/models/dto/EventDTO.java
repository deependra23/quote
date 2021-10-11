package com.mycompany.quote.models.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.ZonedDateTime;

//entity annotation create table in the database
@Setter @Getter
public class EventDTO {
    //id creates primary key and generated value is to create id automatically

    private Long id;
    private String eventTitle;
    private String description;
    @JsonFormat(pattern="yyyy/MM/dd")
    private LocalDate eventDate;

    private ZonedDateTime createdAt;

    private ZonedDateTime updatedAt;

    public EventDTO(){

    }

}
