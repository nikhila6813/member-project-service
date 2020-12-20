package com.nc.memberProjects.rest.bdd;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MemberSteps extends CucumberSpringContextConfig{

	@When( "^User requests list of all members$")
	public void whenUserRequestsAllMembers() throws Exception {
		performGet("/members");
	}
	
	@Then("user recieves a status of {int}")
	public void user_recieves_a_status_of(Integer int1) {
	    throw new PendingException();
	}
}
