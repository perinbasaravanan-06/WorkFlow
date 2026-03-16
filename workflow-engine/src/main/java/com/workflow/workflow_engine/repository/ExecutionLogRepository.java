package com.workflow.workflow_engine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workflow.workflow_engine.entity.ExecutionLog;

public interface ExecutionLogRepository extends JpaRepository<ExecutionLog, String>{

}
