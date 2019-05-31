package com.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {
@GetMapping("/show")
public ResponseEntity<String> showMsgA(){
	String body ="Welcome to Get Rest App";
	HttpStatus status=HttpStatus.OK;
	ResponseEntity<String> entity=new ResponseEntity<String>(body,status);
	return entity;
}
@PostMapping("/show")

public ResponseEntity<String> showMsgB(){
	String body="Welcome to POst Mapping";
	HttpStatus status=HttpStatus.OK;
	ResponseEntity<String> entity=new ResponseEntity<String>(body,status);
	return entity;
}
@PutMapping("/show")
public ResponseEntity<String> showMsgC(){
	String body="Welcome to Put Mapping rest ";
	HttpStatus status=HttpStatus.OK;
	ResponseEntity<String> entity=new ResponseEntity<String>(body,status);
	return entity;
}
@DeleteMapping("/show")
public ResponseEntity<String> showMsgD(){
	String body="welcome to delete Mapping rest";
	HttpStatus status=HttpStatus.OK;
	ResponseEntity<String> entity=new ResponseEntity<String>(body,status);
	return entity;
}
}
