package com.nc.memberProjects.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.nc.memberProjects.MemberProjectApplication;

@WebAppConfiguration
@ContextConfiguration( classes = MemberProjectApplication.class)
@AutoConfigureMockMvc
public class RestApiTests {
	
	@Autowired
	private MockMvc mockmvc;
	
	private MockHttpServletResponse lastGetResponse;
	private MockHttpServletResponse lastPostResponse;
	private MockHttpServletResponse lastPutResponse;
	private MockHttpServletResponse lastDeleteResponse;
	
	public void performGet( String url, Object... urlVariable) throws Exception {
		mockmvc.perform(MockMvcRequestBuilders.get(url, urlVariable)
				.accept(MediaType.APPLICATION_JSON)
			)
			.andDo(result -> {
				lastGetResponse = result.getResponse();
			});
	}

	public MockHttpServletResponse getLastGetResponse() {
		return lastGetResponse;
	}

	public MockHttpServletResponse getLastPostResponse() {
		return lastPostResponse;
	}

	public MockHttpServletResponse getLastPutResponse() {
		return lastPutResponse;
	}

	public MockHttpServletResponse getLastDeleteResponse() {
		return lastDeleteResponse;
	}
}
