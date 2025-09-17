package com.example.task_management_system.models.response.user;

import com.example.task_management_system.repository.postgres.schema.User;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@EqualsAndHashCode
@Builder
public class CreateUserResponse {
    private User user;
    private String message;
}
