package com.bus.reservation.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bus.reservation.entity.Bus;

@Repository
public interface BusRepository extends JpaRepository<Bus, Long> {
    
    // Find buses based on user input: from location, to location
    List<Bus> findBySourceAndDestination(String source, String destination);
    
    // Optional: Find buses by specific date (if travel_date is in Bus entity)
    List<Bus> findBySourceAndDestinationAndDepartureTimeBetween(
        String source, 
        String destination, 
        LocalDateTime startOfDay, 
        LocalDateTime endOfDay
    );
}
