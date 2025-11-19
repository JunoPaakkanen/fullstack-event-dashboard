package com.juno.event_data_dashboard.controller;

import com.juno.event_data_dashboard.model.User;
import com.juno.event_data_dashboard.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController // Tells Spring this controller class handles HTTP requests
@RequestMapping("/api/users") // Sets the base URL for all methods here
public class UserController {
    
    private final UserService userService;

    // Constructor injection
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Defines the POST endpoint to create a new user
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // Returns HTTP 201 on success
    public User createUser(@RequestBody User user) {

        // Calls the service to save user to PostgreSQL
        User savedUser = userService.saveUser(user);
        return savedUser;
    }
}
