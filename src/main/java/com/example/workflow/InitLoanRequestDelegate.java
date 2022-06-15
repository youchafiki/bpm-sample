package com.example.workflow;

import lombok.extern.log4j.Log4j2;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.UUID;

@Log4j2
public class InitLoanRequestDelegate implements JavaDelegate {
	@Override
	public void execute(DelegateExecution delegateExecution) {

		log.info("######## this is an automatic task");
		UUID uuid = UUID.randomUUID();
		delegateExecution.setVariable("requestId",uuid.toString());
	}
}
