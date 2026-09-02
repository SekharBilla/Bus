package com.bus.reservation.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bus.reservation.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Used for login and checking existing users
    Optional<User> findByUsername(String username);
    
    // Check if user exists before registration
    Boolean existsByUsername(String username);
}
