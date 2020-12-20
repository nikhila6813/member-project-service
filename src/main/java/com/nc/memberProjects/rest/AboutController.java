package com.nc.memberProjects.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/about", produces = "application/json")
public class AboutController {
	
	@RequestMapping("/version")
	public @ResponseBody String version() {
		return "1.0";
	}
}
