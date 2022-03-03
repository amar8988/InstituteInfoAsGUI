package com.kush.coaching.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kush.coaching.entity.StudentDetail;

public interface StudentRepository extends CrudRepository<StudentDetail, Integer> {
	List<StudentDetail> findAllByStatus(String status);
}
