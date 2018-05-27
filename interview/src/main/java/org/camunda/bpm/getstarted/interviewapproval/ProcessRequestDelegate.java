package org.camunda.bpm.getstarted.interviewapproval;

import org.camunda.bpm.engine.delegate.DelegateExecution;

import org.camunda.bpm.engine.delegate.JavaDelegate;


import java.util.logging.Logger;

public class ProcessRequestDelegate implements JavaDelegate {

  private final static Logger LOGGER = Logger.getLogger("INTERVIEW-REQUESTS");
  
  public void execute(DelegateExecution execution) throws Exception {
  	boolean flag = false;
  	//Integer TECHNOLOGY = (Integer) execution.getVariable("TECHNOLOGY");
  	Integer TECHNOLOGY= (Integer)execution.getVariable("TECHNOLOGY");
  	if (TECHNOLOGY == 1)
  	{
  		flag = true;
  	}
  	else { 
  		
  		flag = false;
  	}
		
		execution.setVariable("interviewApproved", flag);
		
		LOGGER.info("\n-----------------------------------------------");
		LOGGER.info("\nTesting " + 
					"\nEnrollment No : " + execution.getVariable("enrollmentNo")+ 
					"\nTECHNOLOGY : " + execution.getVariable("TECHNOLOGY") + 
						"\nCondition : " + flag);
		LOGGER.info("\n-----------------------------------------------\n");
		if(TECHNOLOGY==1)
			LOGGER.info("\n ***********CALL FOR INTERVIEW****************");
			else
				LOGGER.info("\n ***********REJECTED****************");
  }
}