package com.workflow.workflow_engine.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workflow.workflow_engine.entity.Rule;
import com.workflow.workflow_engine.repository.RuleRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/rules")
@RequiredArgsConstructor
public class RuleController {

private final RuleRepository ruleRepository;

@PostMapping
public Rule create(@RequestBody Rule rule){

return ruleRepository.save(rule);

}

}
