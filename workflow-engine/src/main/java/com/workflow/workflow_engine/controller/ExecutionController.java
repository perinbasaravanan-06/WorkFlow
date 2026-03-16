package com.workflow.workflow_engine.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workflow.workflow_engine.entity.Execution;
import com.workflow.workflow_engine.service.ExecutionService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/executions")
@RequiredArgsConstructor
public class ExecutionController {

private final ExecutionService executionService;

@PostMapping
public Execution start(@RequestBody Execution execution){

return executionService.startExecution(execution);

}

}
