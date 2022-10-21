package com.solera.collegeservice.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.solera.collegeservice.entities.College;
@Repository
public interface CollegeRepositories extends CrudRepository<College, Integer> {

}
