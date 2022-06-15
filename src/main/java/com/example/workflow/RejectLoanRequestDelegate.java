package com.example.workflow;

import lombok.extern.log4j.Log4j2;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.Random;

@Log4j2
public class RejectLoanRequestDelegate implements JavaDelegate {
	@Override
	public void execute(DelegateExecution delegateExecution) throws Exception {

		String reason = (String)delegateExecution.getVariable("reason");
		log.info("############ Request rejeted for motif :"+ reason);

	}
}
