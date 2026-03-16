package com.workflow.workflow_engine.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="executions")
@Data
public class Execution {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String workflowId;

    private String currentStepId;

    private String status;

    @Column(columnDefinition = "json")
    private String data;

}