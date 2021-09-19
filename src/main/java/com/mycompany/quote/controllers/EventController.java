package com.mycompany.quote.controllers;

import com.mycompany.quote.models.dto.EventDTO;
import com.mycompany.quote.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/event")
public class EventController {

    @Autowired
    EventService eventService;

    @GetMapping("/api/v1/messages")
    public String getMessage(){
        return "Hi there";
    }
    @PostMapping("/api/v1/events")
    //savedEventDetails method is being called from EventServiceImpl with the help of EventService Interface
    public EventDTO savedEventDetails(@RequestBody EventDTO eventDTO){
        return eventService.savedEventDetails(eventDTO);
    }

}
