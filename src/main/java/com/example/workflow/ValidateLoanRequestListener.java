package com.example.workflow;

import lombok.extern.log4j.Log4j2;
import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;

@Log4j2
public class ValidateLoanRequestListener implements TaskListener {
	@Override
	public void notify(DelegateTask delegateTask) {
		log.info("######## Manual validation");
	}
}
