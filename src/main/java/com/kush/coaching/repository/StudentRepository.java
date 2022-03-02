package com.kush.coaching.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kush.coaching.entity.StudentDetail;

public interface StudentRepository extends JpaRepository<StudentDetail, Integer> {

}
