package com.example.task_management_system.repository.postgres.schema;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.Instant;
import java.util.Objects;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@MappedSuperclass
public class AbstractEntity {
    @Column(name = "created_at")
    private long createdAt;

    @Column(name = "created_by")
    private UUID createdBy;

    @Column(name = "updated_at")
    private long updatedAt;

    @Column(name = "updated_by")
    private UUID updatedBy;

    public void create(){
        setCreatedAt(Instant.now().toEpochMilli());
        setUpdatedAt(Instant.now().toEpochMilli());
        // TODO: Updating the following columns (created_by and updated_by) functionality missing
    }

    public void update(){
        setUpdatedAt(Instant.now().toEpochMilli());
        // TODO: Updating the following columns (created_by and updated_by) functionality missing
    }
}
