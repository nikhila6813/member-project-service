package com.nc.memberProjects.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nc.memberProjects.rest.response.MemberResponse;

@RestController
@RequestMapping(value = "/members", produces = "application/json")
public class MemberController {
	
	@RequestMapping(method = RequestMethod.GET)
	public MemberResponse getAll() {
		throw new UnsupportedOperationException();
	}
}
