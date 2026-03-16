package com.workflow.workflow_engine.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="steps")
@Data
public class Step {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String workflowId;

    private String name;

    private String stepType;

    private Integer stepOrder;

    @Column(columnDefinition = "json")
    private String metadata;

}