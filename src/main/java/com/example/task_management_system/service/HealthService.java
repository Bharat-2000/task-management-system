package com.example.task_management_system.service;

import com.example.task_management_system.models.response.health.CheckHealthResponse;
import com.example.task_management_system.repository.postgres.ro.HealthRepositoryRO;
import com.example.task_management_system.repository.postgres.schema.User;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Service
public class HealthService {
    private static final Logger logger = LoggerFactory.getLogger(HealthService.class);

    @Autowired
    HealthRepositoryRO healthRepositoryRO;
    public CheckHealthResponse checkHealthService(){
        try{
            User userResponse = healthRepositoryRO.findFirstBy();
            logger.info("HealthService::checkHealthService: userResponse - {}", userResponse);
            return CheckHealthResponse.builder()
                    .status("SUCCESSFUL")
                    .message("Connection established successfully")
                    .build();
        }
        catch(Exception e){
            throw new RuntimeException("Connection to DB was interrupted!", e);
        }
    }
}
