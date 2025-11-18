package com.juno.event_data_dashboard.repository;

import com.juno.event_data_dashboard.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Marks the interface as a data repository component
public interface UserRepository extends JpaRepository<User, Long> {
    // The interface automatically inherits basic database methods
}
