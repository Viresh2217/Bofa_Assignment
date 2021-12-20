package com.Spring.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
 import com.Spring.Entity.*;
 import com.Spring.Services.*;

@RestController
public class MyController {
	
	@Autowired
	private UserServices userServices;
	
	@GetMapping("/users")
	public List<User> getUsers() {
		return this.userServices.getUsers();
	}
	
	@GetMapping("/user/{id}")
	   public User getUser(@PathVariable String id)
	   {
			return this.userServices.getUser(Integer.parseInt(id));
	   }
	
	@PostMapping("/users")
	public User addUser(@RequestBody User user) {
		return this.userServices.addUser(user);
	}
	
	@PutMapping("/users")
	public User updateUser(@RequestBody  User user) {
		
		return this.userServices.updateUser(user);
	}
	
	@DeleteMapping("/users/{id}")
	public ResponseEntity<HttpStatus> deleteUser(@PathVariable String id){
		
		
		try {
			this.userServices.deleteUser(Integer.parseInt(id));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
		

}
