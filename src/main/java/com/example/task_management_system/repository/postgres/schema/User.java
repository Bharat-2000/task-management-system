package com.example.task_management_system.repository.postgres.schema;

import com.example.task_management_system.repository.postgres.enums.UserRole;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Entity
@Table(name = "user", schema = "task-management-system")
@NoArgsConstructor
@Data
@AllArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
//@Typedef  //Pending might be helpful later
public class User extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", updatable = false, nullable = false, columnDefinition = "uuid")
    private UUID id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(name = "role_id", nullable = false)
    private UserRole roleId;
}
