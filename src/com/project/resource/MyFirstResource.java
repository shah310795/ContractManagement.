package com.project.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/resources")
public class MyFirstResource {
	@GET
	public String getOutput() {
		return "Hello";
	}
}
