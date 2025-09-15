package com.example.task_management_system.repository.postgres.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UserRole {
    SUPERADMIN("SUPERADMIN"),
    ADMIN("ADMIN"),
    USER("USER");

    private String value;
}
