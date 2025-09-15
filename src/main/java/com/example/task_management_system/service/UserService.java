package com.example.task_management_system.service;

import com.example.task_management_system.models.response.health.CheckHealthResponse;
import com.example.task_management_system.repository.postgres.enums.UserRole;
import com.example.task_management_system.repository.postgres.ro.HealthRepositoryRO;
import com.example.task_management_system.repository.postgres.schema.User;
import org.springframework.beans.factory.annotation.Autowired;


//TODO: Work pending start from scratch.
public class UserService {

    @Autowired
    HealthRepositoryRO healthRepositoryRO;
    public CheckHealthResponse createUser(){
        User user = User.builder()
                .roleId(UserRole.USER)
                .email("lkdjalfkj")
                .firstName("djnalg")
                .lastName("lkdajg")
                .build();

        healthRepositoryRO.save(user);

        return CheckHealthResponse.builder()
                .status("SUCCESSFULL")
                .message("Connection Establised")
                .build();
    }
}
