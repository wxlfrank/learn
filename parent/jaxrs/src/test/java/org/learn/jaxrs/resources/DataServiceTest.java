package org.learn.jaxrs.resources;

import static org.junit.Assert.*;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;
import org.learn.jaxrs.config.RSConfig;

public class DataServiceTest extends JerseyTest{
	@Override
    protected Application configure() {
        return new RSConfig();
    }
	
	@Test
    public void test() {
        final Response response =  target("data").request().get();
        assertEquals(response.getStatus(), 200);
        assertEquals(response.getMediaType(), MediaType.APPLICATION_XML_TYPE);
    }
}
