package com.example.Employee.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionhandler {

	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<?> EmployeeNotFoundException(EmployeeNotFoundException ex, WebRequest request) {
		ErrorDetails details = new ErrorDetails(HttpStatus.NOT_FOUND.value(), ex.getMessage(),
				request.getDescription(false));
		return new ResponseEntity<>(details, HttpStatus.NOT_FOUND);

	}
}

