package com.workflow.workflow_engine.service;

import org.springframework.stereotype.Service;

import com.workflow.workflow_engine.entity.Execution;
import com.workflow.workflow_engine.repository.ExecutionRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ExecutionService {

    private final ExecutionRepository executionRepository;

    public Execution startExecution(Execution execution){
        execution.setStatus("IN_PROGRESS");
        return executionRepository.save(execution);
    }

}
