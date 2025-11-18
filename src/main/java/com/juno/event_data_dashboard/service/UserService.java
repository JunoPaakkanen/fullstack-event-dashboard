package com.juno.event_data_dashboard.service;

import com.juno.event_data_dashboard.model.User;
import com.juno.event_data_dashboard.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    // Dependency field
    private final UserRepository userRepository;

    // Constructor
    public UserService(UserRepository userRepository) { 
        this.userRepository = userRepository;
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }
}
