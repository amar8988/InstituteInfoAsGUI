package com.kush.coaching.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.kush.coaching.entity.User;

public interface UserRepository extends JpaRepository<User, String> {
	Optional<User> findByUserName(String userName);
}
