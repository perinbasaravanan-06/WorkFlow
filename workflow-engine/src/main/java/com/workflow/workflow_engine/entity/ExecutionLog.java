package com.workflow.workflow_engine.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="execution_logs")
@Data
public class ExecutionLog {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String executionId;

    private String stepName;

    private String status;

    private String approverId;

    private LocalDateTime startedAt;

    private LocalDateTime endedAt;

}