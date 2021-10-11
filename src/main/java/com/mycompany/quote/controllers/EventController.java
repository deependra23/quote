package com.mycompany.quote.controllers;

import com.mycompany.quote.models.dto.EventDTO;
import com.mycompany.quote.models.entity.Event;
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
    //saveEventDetails method is being called from EventServiceImpl with the help of EventService Interface

       public ResponseEntity <EventDTO> saveEventDetails(@RequestBody EventDTO eventDTO){

        return new ResponseEntity(eventService.saveEventDetails(eventDTO),HttpStatus.CREATED);
    }


    /*
    ResponseEntity<EventDTO> savedEventDetails(@Valid @RequestBody EventDTO eventDTO){
        EventDTO response = new EventDTO();
        response = eventService.savedEventDetails(eventDTO);

        return new ResponseEntity(response, HttpStatus.OK);
    }
    */


    @GetMapping(value = "/{id}", produces = "application/json")
    public  ResponseEntity<Event> getEvent (@PathVariable Long id){

        EventDTO getEventDetail = new EventDTO();
        try {
            System.out.println("I am in controller");
            getEventDetail = eventService.findFirstEventById(id);
            System.out.println("I am done");
        }catch(Exception e)
        {
            System.out.println("error while fetching data ");
        }
        return new ResponseEntity(getEventDetail, HttpStatus.OK);
    }


}
