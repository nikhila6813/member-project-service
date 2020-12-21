package com.nc.memberProjects.rest.bdd;

import java.io.UnsupportedEncodingException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MemberSteps extends CucumberSpringContextConfig{

	@Given("{int} member exists")
	public void membersExist(int numMembers) {
		
	}

	@When( "^User requests list of all members$")
	public void whenUserRequestsAllMembers() throws Exception {
		performGet("/members");
	}
	
	@Then("user recieves a status of {int}")
	public void user_recieves_a_status_of(int reqStat) {
	    int status = getLastGetResponse().getStatus();
	    Assert.assertEquals( reqStat, status);
	}
	
	@And("MemberResponse object is returned with {int} member info")
	public void returnsAMemberResponse(int expectedMembers) throws UnsupportedEncodingException {
		String responseBody = getLastGetResponse().getContentAsString();
		Assert.assertNotNull("Expecting response body in get response", responseBody);
		Assert.assertFalse("Response body is empty", responseBody.isEmpty());
		
		try {
			JSONObject jsonResponse = new JSONObject(responseBody);
			Assert.assertNotNull("Response body not parsed to JSONObject", jsonResponse);
			Assert.assertNotNull("Missing requestId", jsonResponse.get("requestId"));
			Assert.assertNotNull("Missing status",  jsonResponse.get("status"));
			Object object = jsonResponse.get("members");
			Assert.assertNotNull( "Missing members",  object);
			Assert.assertTrue( "Members entry not an array",object instanceof JSONArray);
			Assert.assertTrue("Incorrect array size for members", ((JSONArray)object).length() == expectedMembers);
		} catch (JSONException e) {
			Assert.fail(e.getLocalizedMessage());
		}
		
	}
}
