package com.nc.memberProjects.rest.bdd;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AboutSteps extends CucumberSpringContextConfig{
	
	@When( "^User requests version info$")
	public void whenUserRequestsAllMembers() throws Exception {
		performGet("/about/version");
	}
	
	@Then("Version request returns a status of {int}")
	public void user_recieves_a_status_of(int int1) {
	    int lastStatus = getLastGetResponse().getStatus();
	    Assert.assertEquals(int1, lastStatus);
	}
	
	@And("^user receives version (.+)$")
    public void the_client_receives_server_version_body(String version) throws Throwable {
        String contentAsString = getLastGetResponse().getContentAsString();
        Assert.assertEquals(version, contentAsString);
    }
	
}
