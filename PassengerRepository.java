package com.bus.reservation.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bus.reservation.entity.Passenger;


@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long> {
   
}
