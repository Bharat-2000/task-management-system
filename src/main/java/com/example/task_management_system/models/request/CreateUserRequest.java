package com.example.task_management_system.models.request;

import com.example.task_management_system.repository.postgres.enums.UserRole;
import lombok.Data;

@Data
public class CreateUserRequest {
    private String firstName;
    private String lastName;
    private String email;
    private UserRole roleId;
}
