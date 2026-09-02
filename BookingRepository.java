package com.bus.reservation.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bus.reservation.entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    
    // For Requirement #3: HR checking all current/previous bookings
    // JPA's findAll() handles "All Bookings"
    
    // For Requirement #5: Find all bookings for a specific user
    List<Booking> findByUserUsername(String username);

    // Find bookings by status (e.g., CONFIRMED vs CANCELLED)
    List<Booking> findByStatus(String status);
    
    // HR Requirement: Check bookings by a specific date range
    List<Booking> findByTravelDateBetween(LocalDate start, LocalDate end);
}
