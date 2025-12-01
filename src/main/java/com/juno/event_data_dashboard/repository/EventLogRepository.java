package com.juno.event_data_dashboard.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import com.juno.event_data_dashboard.model.EventLog;

@Repository // Marks the interface as a data repository component
public interface EventLogRepository extends ElasticsearchRepository<EventLog, String> {
    // The interface automatically inherits basic database methods
}
