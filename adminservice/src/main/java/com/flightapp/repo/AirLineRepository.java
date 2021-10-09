package com.flightapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightapp.entities.AirLine;

@Repository
public interface AirLineRepository extends JpaRepository<AirLine, Integer> {

	AirLine findByIdOrAirlineName(Integer id, String airlineName);


}
