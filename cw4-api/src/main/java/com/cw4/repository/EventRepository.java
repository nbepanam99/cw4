package com.cw4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cw4.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

}
