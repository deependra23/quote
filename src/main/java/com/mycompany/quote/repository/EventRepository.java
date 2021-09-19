package com.mycompany.quote.repository;

import com.mycompany.quote.models.dto.EventDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<EventDTO, Integer> {

}
