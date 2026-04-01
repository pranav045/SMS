package com.lpu.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.lpu.DTO.ResponseStructure;

@ControllerAdvice
public class StudentExceptionHandler {
	@ExceptionHandler(IdDoesNotPresentException.class)
	public ResponseEntity<ResponseStructure<String>> catchException(IdDoesNotPresentException exception) {
		ResponseStructure<String> rs = new ResponseStructure<String>();
		rs.setStatusCode(HttpStatus.NOT_FOUND.value());
		rs.setMessage("Not found");
		rs.setData(exception.getMessage());
		return new ResponseEntity<ResponseStructure<String>>(rs, HttpStatus.NOT_FOUND);
	}
}
