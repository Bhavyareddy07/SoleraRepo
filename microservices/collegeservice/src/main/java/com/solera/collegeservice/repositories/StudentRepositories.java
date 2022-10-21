package com.solera.collegeservice.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.solera.collegeservice.entities.Student;

@Repository
public interface StudentRepositories extends CrudRepository<Student, Integer> {

}
