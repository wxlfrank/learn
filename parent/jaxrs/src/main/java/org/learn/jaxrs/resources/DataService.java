package org.learn.jaxrs.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.learn.jaxb.Data;

@Path("data")
public class DataService {

	@Produces(MediaType.APPLICATION_XML)
	@GET
	public Data getData(){
		Data data = new Data();
		data.setUri("myuri");
		return data;
	}
}
