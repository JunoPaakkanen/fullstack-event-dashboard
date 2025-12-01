package com.juno.event_data_dashboard.service;

import java.time.LocalDateTime;
import com.juno.event_data_dashboard.model.EventLog;
import com.juno.event_data_dashboard.repository.EventLogRepository;
import org.springframework.stereotype.Service;

@Service
public class EventLogService {
    
    // Dependency field for Elasticsearch communication
    private final EventLogRepository eventLogRepository;

    // Constructor injection to receive the eventLogRepository
    public EventLogService(EventLogRepository eventLogRepository){
        this.eventLogRepository = eventLogRepository;
    }

    public void logEvent(String action, Long userId){
        // Create the event log object
        EventLog eventLog = new EventLog(action, userId, LocalDateTime.now());

        eventLogRepository.save(eventLog);
    }
}