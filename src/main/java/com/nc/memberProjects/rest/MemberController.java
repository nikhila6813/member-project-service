package com.nc.memberProjects.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nc.memberProjects.model.Member;
import com.nc.memberProjects.rest.response.MemberResponse;

@RestController
@RequestMapping(value = "/members", produces = "application/json")
public class MemberController {
	
	@RequestMapping(method = RequestMethod.GET)
	public MemberResponse getAll() {
		List<Member> members = new ArrayList<Member>();
		
		MemberResponse response = new MemberResponse.ResponseBuilder(HttpStatus.OK)
				.withMembers(members)
				.build();
		return response;
	}
}
