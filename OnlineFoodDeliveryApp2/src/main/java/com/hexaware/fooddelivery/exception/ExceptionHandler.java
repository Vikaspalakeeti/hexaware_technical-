package com.hexaware.fooddelivery.exception;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {
	@org.springframework.web.bind.annotation.ExceptionHandler({Exception.class})
	public ResponseEntity<String> handleAnyExp(Exception e) {
		
		return new ResponseEntity<String>(e.toString(),HttpStatus.BAD_REQUEST);
	}
}