package com.kush.coaching.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kush.coaching.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	/* pre-defined methods by jpa are:
	 * 	List<User> findAll();
	 * 	Optional<User> findById(id);
	 * 	... */
}