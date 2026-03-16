package com.workflow.workflow_engine.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workflow.workflow_engine.entity.Step;
import com.workflow.workflow_engine.repository.StepRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/steps")
@RequiredArgsConstructor
public class StepController {

private final StepRepository stepRepository;

@PostMapping
public Step create(@RequestBody Step step){

return stepRepository.save(step);

}

}
