package com.juno.event_data_dashboard.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Document(indexName = "logs-#{T(java.time.LocalDate).now().toString()}")
public class EventLog {
    
    // Id field, unique identifier for the event log document in Elasticsearch
    @Id
    private String id;
    // Attributes for the EventLog
    String action;
    Long userId;
    LocalDateTime time;

    public EventLog(String action, Long userId, LocalDateTime time){
        this.action = action;
        this.userId = userId;
        this.time = time;
    }

    // Necessary no-argument constructor
    public EventLog(){}

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    
}
