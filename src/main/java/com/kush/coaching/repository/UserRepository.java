package com.kush.coaching.repository;

import org.springframework.data.repository.CrudRepository;

import com.kush.coaching.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
}