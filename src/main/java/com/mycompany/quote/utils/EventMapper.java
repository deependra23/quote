package com.mycompany.quote.utils;


import com.mycompany.quote.models.dto.EventDTO;
import com.mycompany.quote.models.entity.Event;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel="spring")
public interface EventMapper {
    EventMapper INSTANCE = Mappers.getMapper(EventMapper.class);

    Event eventDTOToEvent(EventDTO eventDTO);
    EventDTO eventToEventDTO(Event event);
}
