package com.juno.event_data_dashboard.service;

import com.juno.event_data_dashboard.model.User;
import com.juno.event_data_dashboard.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    // Dependency fields
    private final UserRepository userRepository;
    private final EventLogService eventLogService;

    // Constructor
    public UserService(UserRepository userRepository, EventLogService eventLogService) { 
        this.userRepository = userRepository;
        this.eventLogService = eventLogService;
    }

    public User saveUser(User user){
        User savedUser = userRepository.save(user);
        // Send an event log to Elasticsearch
        eventLogService.logEvent("USER_CREATED", savedUser.getId());
        return savedUser;
    }
}
