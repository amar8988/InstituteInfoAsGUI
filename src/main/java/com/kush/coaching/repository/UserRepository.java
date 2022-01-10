package com.kush.coaching.repository;

import org.springframework.data.repository.CrudRepository;

import com.kush.coaching.entity.User;

public interface UserRepository extends CrudRepository<User, String> {
	 //Optional<User> findById(userName);    is pre-defined by jpa is used
}
