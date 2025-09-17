package com.example.task_management_system.apis;

import com.example.task_management_system.models.request.CreateUserRequest;
import com.example.task_management_system.models.response.user.CreateUserResponse;
import com.example.task_management_system.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/taskmanagement/v1")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public ResponseEntity<CreateUserResponse> createUser (@RequestBody CreateUserRequest userRequest){
        logger.info("UserController::createUser: Method Triggered!");
        try{
            CreateUserResponse createUserResponse = userService.createUser(userRequest);
            logger.info("UserController::createUser: User create successfully with info - {}", createUserResponse);
            return ResponseEntity.status(HttpStatus.CREATED).body(createUserResponse);
        }catch (Exception e) {
            logger.error("UserController::createUser: Exception occurred - {}", e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
}
