package com.workflow.workflow_engine.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workflow.workflow_engine.entity.Workflow;
import com.workflow.workflow_engine.service.WorkflowService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/workflows")
@RequiredArgsConstructor
public class WorkflowController {

private final WorkflowService workflowService;

@PostMapping
public Workflow create(@RequestBody Workflow workflow){

return workflowService.createWorkflow(workflow);
}

@GetMapping
public List<Workflow> getAll(){

return workflowService.getAll();
}

}
