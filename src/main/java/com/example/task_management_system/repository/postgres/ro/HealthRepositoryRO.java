package com.example.task_management_system.repository.postgres.ro;

import com.example.task_management_system.repository.postgres.schema.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HealthRepositoryRO extends JpaRepository<User, Long>  {
    // JPA handle LIMIT 1 automatically
    User findFirstBy();
}
