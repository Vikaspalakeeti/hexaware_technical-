package com.hexaware.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.service.IUserService;
import com.hexaware.user.User;

@RestController
@RequestMapping("/user")
public class UserRestController {
	@Autowired
	private IUserService service; // Has - a
	
	// 1. save user data in database
	@PostMapping("/save")
	public ResponseEntity<String> saveUser(@RequestBody User user)
	
	{
		Integer id = service.saveUser(user);
		String body = "User '"+id+"' saved";
		//return new ResponseEntity.<String>(body, HttpStatus.OK);
		return ResponseEntity.ok(body);
	}
	

}
