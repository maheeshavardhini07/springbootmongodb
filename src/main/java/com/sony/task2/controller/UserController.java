package com.sony.task2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sony.task2.model.User;
import com.sony.task2.service.UserService;


@RestController
@RequestMapping(value = "/users")
public class UserController {
    @Autowired
	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

    @GetMapping(value = "")
    public List<User> getAllUsers() {
	System.out.println("Getting all users.");
	return userService.getAllUsers();
}
@GetMapping(value = "/get/{id}")
public Optional<User> getUser(@PathVariable String id) {
    System.out.println("Getting user with ID");
	return userService.getById(id);
}

@PostMapping(value = "/create")
public User addNewUsers(@RequestBody User user) {
    System.out.println("Saving user.");
	return userService.save(user);
}

@PutMapping(value="/update/{id}")
public User updateUser(@RequestBody User user, @PathVariable("id") String id){
    System.out.println("Update User");
    return userService.save(user);
}

@DeleteMapping(value="/delete/{id}")
public void deleteUser(@PathVariable("id") String id){
    System.out.println("User Deleted");
    userService.delete(id);
}

}
