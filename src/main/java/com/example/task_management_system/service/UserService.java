package com.example.task_management_system.service;

import com.example.task_management_system.models.request.CreateUserRequest;
import com.example.task_management_system.models.response.user.CreateUserResponse;
import com.example.task_management_system.repository.postgres.rw.UserRepositoryRW;
import com.example.task_management_system.repository.postgres.schema.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
//TODO: Work pending start from scratch.
public class UserService {

    @Autowired
    UserRepositoryRW userRepositoryRW;
    public CreateUserResponse createUser(CreateUserRequest userRequest){
        User user = User.builder()
                .firstName(userRequest.getFirstName())
                .lastName(userRequest.getLastName())
                .email(userRequest.getEmail())
                .roleId(userRequest.getRoleId())
                .build();
        user.create(); // Set createdAt and updatedAt timestamps

        //JPA Save method
        userRepositoryRW.save(user);

        return CreateUserResponse.builder()
                .user(user)
                .message("Connection Establised")
                .build();
    }
}
