package com.mycompany.quote.services;

import com.mycompany.quote.models.dto.EventDTO;
import com.mycompany.quote.models.entity.Event;
import com.mycompany.quote.repositories.EventRepository;
import com.mycompany.quote.utils.EventMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Optional;


@Service
public class EventServiceImpl implements EventService{

    @Autowired
    EventRepository eventRepository;

    //EventDTO collects info with the help from controller and save them in the database
    @Override
    public  EventDTO saveEventDetails(EventDTO eventRequest) {
        System.out.println("Event Date ......" + eventRequest.getEventDate());
        Event event = EventMapper.INSTANCE.eventDTOToEvent(eventRequest);


        //Converting local time into UTC
        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime eventZonedTimeDate = now.atZone(ZoneId.systemDefault());
        ZonedDateTime eventDateUTC = eventZonedTimeDate.withZoneSameInstant(ZoneId.of("UTC"));


        event.setCreatedAt(eventDateUTC);
        event.setUpdatedAt(eventDateUTC);
        event.setDate(eventDateUTC);

        Event eventDBReturn = eventRepository.save(event); //saving in the database
        EventDTO eventDTO = EventMapper.INSTANCE.eventToEventDTO(eventDBReturn); //getting data from database




           /* MAPPER HAS BEEN USED ABOVE TO OPTIMISE THE CODE
           event.setEventTitle(eventRequest.getEventTitle());
           event.setDescription(eventRequest.getDescription());
           */

           /*Event eventResponse = eventRepository.save(event);
           EventDTO eventDTO = new EventDTO();
           eventDTO.setId(eventResponse.getId());
           eventDTO.setEventTitle(eventResponse.getEventTitle());
           eventDTO.setDescription(eventResponse.getDescription());
           eventDTO.setDate(eventResponse.getDate());
           eventDTO.setCreatedAt(eventResponse.getCreatedAt());
           eventDTO.setUpdatedAt(eventResponse.getUpdatedAt());
           */
        return eventDTO;
    }

    @Override
    public EventDTO findFirstEventById( Long id) {

       Optional <Event> eventEntity = eventRepository.findById(id);
       Event event = eventEntity.orElse(new Event());
        EventDTO eventDTO = EventMapper.INSTANCE.eventToEventDTO(event);

        return eventDTO;
    }


    }

