package com.example.task_management_system.models.response.health;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@EqualsAndHashCode
@Builder
//@JsonIgnoreProperties(ignoreUnknown = true)
public class CheckHealthResponse {
    private String status;
    private String message;
}
