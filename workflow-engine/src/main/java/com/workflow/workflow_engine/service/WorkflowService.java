package com.workflow.workflow_engine.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.workflow.workflow_engine.entity.Workflow;
import com.workflow.workflow_engine.repository.WorkflowRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class WorkflowService {

    private final WorkflowRepository workflowRepository;

    public Workflow createWorkflow(Workflow workflow){
        return workflowRepository.save(workflow);
    }

    public List<Workflow> getAll(){
        return workflowRepository.findAll();
    }

}
