package com.flightapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightapp.entities.Seats;

@Repository
public interface SeatsRepository extends JpaRepository<Seats, Integer>{

}
