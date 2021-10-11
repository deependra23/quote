package com.mycompany.quote.services;

import com.mycompany.quote.models.dto.EventDTO;


public interface EventService{


    EventDTO saveEventDetails(EventDTO eventDTO);

    EventDTO findFirstEventById(Long id);

}
