package com.nc.memberProjects.rest.response;

import org.springframework.http.HttpStatus;

public abstract class APIResponse {
	private String requestId;
	private HttpStatus status;
	private String[] errors;
	
	protected APIResponse(String requestId, HttpStatus status, String[] errors) {
		super();
		this.requestId = requestId;
		this.status = status;
		this.errors = errors;
	}
	
	public String getRequestId() {
		return requestId;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public String[] getErrors() {
		return errors;
	}
	
}
