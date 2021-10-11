package com.mycompany.quote.repositories;

import com.mycompany.quote.models.entity.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EventRepository extends CrudRepository<Event, Long> ,PagingAndSortingRepository<Event, Long>{

}

