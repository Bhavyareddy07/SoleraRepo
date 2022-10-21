package com.solera.collegeservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solera.collegeservice.entities.College;
import com.solera.collegeservice.entities.Student;
import com.solera.collegeservice.exceptions.CollegeNotFoundException;
import com.solera.collegeservice.exceptions.StudentNotFoundException;
import com.solera.collegeservice.repositories.CollegeRepositories;
import com.solera.collegeservice.repositories.StudentRepositories;

@Service
public class CollegeServiceImpl implements CollegeService {
	@Autowired
	private CollegeRepositories collegeRepo;
	@Autowired
	private StudentRepositories studentRepo;

	@Override
	public College insertCollege(College college) {
		return collegeRepo.save(college);
	}

	@Override
	public College retrieveCollegeById(Integer collegeId) throws CollegeNotFoundException{
		Optional<College> colleges = collegeRepo.findById(collegeId);
		if(colleges.isPresent()) {
			return colleges.get();
		}else {
			throw new CollegeNotFoundException();
		}
		
	}

	@Override
	public Student retrieveStudentById(Integer studentId)  throws StudentNotFoundException{
		Optional<Student> student = studentRepo.findById(studentId);
		if(student.isPresent()) {
			return student.get();
		}else {
			throw new StudentNotFoundException();
		}
	}

	@Override
	public List<Student> retrieveStudentsByCollegeId(Integer collegeId) throws StudentNotFoundException{
		Optional<College> colleges = collegeRepo.findById(collegeId);
		if(colleges.isPresent()) {
			return colleges.get().getStudent();
		}else {
			throw new StudentNotFoundException();
		}
	}

	@Override
	public Student insertStudent(Student student) {
		return studentRepo.save(student);
	}

}
