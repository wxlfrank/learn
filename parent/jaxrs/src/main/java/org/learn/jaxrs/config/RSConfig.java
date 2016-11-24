package org.learn.jaxrs.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/")
public class RSConfig extends ResourceConfig{
	public RSConfig(){
		packages("org.learn.jaxrs.resources");
	}
}
