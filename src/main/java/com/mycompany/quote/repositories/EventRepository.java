package com.mycompany.quote.repositories;

import com.mycompany.quote.models.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//this class communicates with our database
@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {

}
