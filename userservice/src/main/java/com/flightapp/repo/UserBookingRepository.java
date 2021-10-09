package com.flightapp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightapp.entities.UserBookings;

@Repository
public interface UserBookingRepository extends JpaRepository<UserBookings, Integer> {

	List<UserBookings> findByEmailid(String emailId);

}
