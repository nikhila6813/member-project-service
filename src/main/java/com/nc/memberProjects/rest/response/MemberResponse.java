package com.nc.memberProjects.rest.response;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.nc.memberProjects.model.Member;

public class MemberResponse extends APIResponse {
	
	private List<Member> members;
	
	protected MemberResponse(String requestId, HttpStatus status, String[] errors, List<Member> members) {
		super(requestId, status, errors);
		this.members=members;
	}
	
	public List<Member> getMembers(){
		return members;
	}
	
	public static class ResponseBuilder {
		
		private List<Member> members;
		protected String requestId;
		protected HttpStatus status;
		protected String[] errors;
		
		public ResponseBuilder( HttpStatus status) {
			this.status = status;
		}
		
		public ResponseBuilder forRequestId(String requestId) {
			this.requestId = requestId;
			return this;
		}
		
		public ResponseBuilder withErrors(String[] errors) {
			this.errors = errors;
			return this;
		}
		
		public ResponseBuilder withMembers( List<Member> volunteers) {
			this.members = volunteers;
			return this;
		}

		public MemberResponse build() {
			MemberResponse response = new MemberResponse(requestId, status, errors, members);
			return response;
		}
	}
}
