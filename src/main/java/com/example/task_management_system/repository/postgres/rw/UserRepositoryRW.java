package com.example.task_management_system.repository.postgres.rw;

import com.example.task_management_system.repository.postgres.schema.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoryRW extends JpaRepository<User, Long> {
}
