package org.learn.jaxrs.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("got")
public class FirstResource {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getIt(){
		return "Got it!";
	}
}
