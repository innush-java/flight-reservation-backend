package com.flightapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightapp.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUserNameAndPassword(String userName, String password);

	User findByUserName(String userName);

	
}
