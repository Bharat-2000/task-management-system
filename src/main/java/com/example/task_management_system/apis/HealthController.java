
package com.example.task_management_system.apis;

import com.example.task_management_system.models.response.health.CheckHealthResponse;
import com.example.task_management_system.service.HealthService;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/taskmanagement/v1")
public class HealthController {
    private static final Logger logger = LoggerFactory.getLogger(HealthController.class);

    @Autowired
    private HealthService healthService;

    @GetMapping("/health")
    public ResponseEntity<CheckHealthResponse> checkHealth (){
        logger.info("HealthController::checkHealth: Method Triggered!");
        try{
            CheckHealthResponse checkHealthResponse = healthService.checkHealthService();
            logger.info("HealthController::checkHealth: service response received - {}", checkHealthResponse);
            return new ResponseEntity<>(checkHealthResponse, HttpStatus.OK);
        }catch (Exception e) {
            logger.error("HealthController::checkHealth: Error while triggering health check");
            return new ResponseEntity<>(new CheckHealthResponse(), HttpStatus.BAD_REQUEST);
        }
    }

}
