package com.example.task_management_system.service;

import com.example.task_management_system.models.response.health.CheckHealthResponse;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class HealthService {
    public CheckHealthResponse checkHealthService(){
        return CheckHealthResponse.builder()
                .status("SUCCESSFULL")
                .message("Connection Establised")
                .build();
    }
}
