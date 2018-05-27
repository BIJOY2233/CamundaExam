package org.camunda.bpm.getstarted.interviewapproval;

import org.camunda.bpm.application.PostDeploy;
import org.camunda.bpm.application.ProcessApplication;
import org.camunda.bpm.application.impl.ServletProcessApplication;
import org.camunda.bpm.engine.ProcessEngine;

@ProcessApplication("interview")
public class InterviewApprovalApplication extends ServletProcessApplication {
	private static final String PROCESS_DEFINITION_KEY = "interview";

	  @PostDeploy
	  public void onDeploymentFinished(ProcessEngine processEngine) {

	  }
}