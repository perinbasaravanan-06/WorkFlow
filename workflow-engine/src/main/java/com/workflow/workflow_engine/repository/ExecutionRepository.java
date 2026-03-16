package com.workflow.workflow_engine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workflow.workflow_engine.entity.Execution;

public interface ExecutionRepository  extends JpaRepository<Execution, String>{

}
