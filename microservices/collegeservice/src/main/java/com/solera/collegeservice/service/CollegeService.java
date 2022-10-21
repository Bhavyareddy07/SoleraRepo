package com.solera.collegeservice.service;

import java.util.List;

import com.solera.collegeservice.entities.College;
import com.solera.collegeservice.entities.Student;
import com.solera.collegeservice.exceptions.CollegeNotFoundException;
import com.solera.collegeservice.exceptions.StudentNotFoundException;

public interface CollegeService {
	
	public College insertCollege(College college);
	public College retrieveCollegeById(Integer collegeId) throws CollegeNotFoundException;
	public Student retrieveStudentById(Integer studentId) throws StudentNotFoundException;
	public List<Student> retrieveStudentsByCollegeId(Integer collegeId) throws StudentNotFoundException;
	public Student insertStudent(Student student);
}
