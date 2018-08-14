package com.carcaret;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@ApplicationScoped
@Produces(MediaType.TEXT_PLAIN)
@Path("/")
public class HelloController {

    /*
    Construction injection does not work unless a public no-arg constructor is provided as well for proxying purposes.
    https://stackoverflow.com/questions/48410451/why-do-i-need-a-no-args-constructor-to-use-applicationscoped-beans-with-construc
     */
    @Inject
    private HelloService service;

    @GET
    @Path("/hello")
    public String sayHello() {
        return service.message();
    }
}
