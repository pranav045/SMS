package com.lpu.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.lpu.DAO.StudentDAO;
import com.lpu.DTO.ResponseStructure;
import com.lpu.Entity.Student;
import com.lpu.Exception.IdDoesNotPresentException;

@Service
public class StudentService {
	@Autowired
	private StudentDAO studentDAO;

	public ResponseEntity<ResponseStructure<Student>> saveStudent(Student student) {
		Student receivedStudent = studentDAO.saveStudent(student);
		ResponseStructure<Student> rs = new ResponseStructure<Student>();
		rs.setStatusCode(HttpStatus.CREATED.value());
		rs.setMessage("Success");
		rs.setData(receivedStudent);
		return new ResponseEntity<ResponseStructure<Student>>(rs, HttpStatus.CREATED);
	}

	public ResponseEntity<ResponseStructure<Student>> getById(int id) {
		Student receivedStudent = studentDAO.getById(id);
		if (receivedStudent != null) {
			ResponseStructure<Student> rs = new ResponseStructure<Student>();
			rs.setStatusCode(HttpStatus.OK.value());
			rs.setMessage("Found Successfully");
			rs.setData(receivedStudent);
			return new ResponseEntity<ResponseStructure<Student>>(rs, HttpStatus.OK);
		} else {
			throw new IdDoesNotPresentException("Id: " + id + " not found");
		}
	}
}
