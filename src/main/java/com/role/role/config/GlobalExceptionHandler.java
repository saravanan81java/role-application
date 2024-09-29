package com.role.role.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler({ Exception.class })
	public ResponseEntity<Object> handelGlobalExceptionHandeler(Exception exp){
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exp.getLocalizedMessage());
	}
}
