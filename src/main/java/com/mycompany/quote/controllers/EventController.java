package com.mycompany.quote.controllers;

import com.mycompany.quote.models.dto.EventDTO;
import com.mycompany.quote.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/event")
public class EventController {

    @Autowired
    EventService eventService;

    @PostMapping(produces = "application/json")
    //savedEventDetails method is being called from EventServiceImpl with the help of EventService Interface

       public ResponseEntity <EventDTO> savedEventDetails(@RequestBody EventDTO eventDTO){

        return new ResponseEntity(eventService.savedEventDetails(eventDTO),HttpStatus.CREATED);
    }


    /*
    ResponseEntity<EventDTO> savedEventDetails(@Valid @RequestBody EventDTO eventDTO){
        EventDTO response = new EventDTO();
        response = eventService.savedEventDetails(eventDTO);

        return new ResponseEntity(response, HttpStatus.OK);
    }
    */


}
