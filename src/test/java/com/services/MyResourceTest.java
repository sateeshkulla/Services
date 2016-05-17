package com.services;

import javax.ws.rs.core.Application;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Ignore;
import org.junit.Test;

import com.services.api.ResourceImpl;

import static org.junit.Assert.assertEquals;

public class MyResourceTest extends JerseyTest {

    @Override
    protected Application configure() {
        return new ResourceConfig(ResourceImpl.class);
    }

    /**
     * Test to see that the message "Got it!" is sent in the response.
     */
    @Test
    @Ignore
    public void testGetIt() {
        final String responseMsg = target().path("myresource").request().get(String.class);

        assertEquals("Hello, Heroku!", responseMsg);
    }
}
