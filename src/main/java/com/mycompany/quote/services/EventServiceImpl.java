package com.mycompany.quote.services;

import com.mycompany.quote.models.dto.EventDTO;
import com.mycompany.quote.models.entity.Event;
import com.mycompany.quote.repositories.EventRepository;
import com.mycompany.quote.utils.EventMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService{

    @Autowired
    EventRepository eventRepository;

    //EventDTO collects info with the help from controller and save them in the database
    @Override
    public EventDTO savedEventDetails(EventDTO eventRequest){
      Event event =  EventMapper.INSTANCE.eventDTOToEvent(eventRequest);
           /*
           event.setEventTitle(eventRequest.getEventTitle());
           event.setDescription(eventRequest.getDescription());
           */
           Event eventResponse = eventRepository.save(event);

           EventDTO eventDTO = new EventDTO();
           eventDTO.setId(eventResponse.getId());
           eventDTO.setEventTitle(eventResponse.getEventTitle());
           eventDTO.setDescription(eventResponse.getDescription());
           eventDTO.setDate(eventResponse.getDate());
           eventDTO.setCreatedAt(eventResponse.getCreatedAt());
           eventDTO.setUpdatedAt(eventResponse.getUpdatedAt());
           return eventDTO;
    }







}
