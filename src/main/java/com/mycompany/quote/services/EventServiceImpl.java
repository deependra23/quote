package com.mycompany.quote.services;

import com.mycompany.quote.models.dto.EventDTO;
import com.mycompany.quote.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService{

    @Autowired
    EventRepository eventRepository;

    //referencing EventDTO class from DTO package to get request and save it
    @Override
    public EventDTO savedEventDetails(EventDTO eventRequest){
           EventDTO eventDTO =  new EventDTO();
           eventDTO.setEventTitle(eventRequest.getEventTitle());
           eventDTO.setDescription(eventRequest.getDescription());

           return eventRepository.save(eventDTO);

    }







}
