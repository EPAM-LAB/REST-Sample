package com.epam.controller;

import javax.ws.rs.*;

@Path("/api")
public class SimpleController {

    @GET
    public String getSimple() {
        return "OK";
    }

    @GET
    @Path("{num}")
    public String getNum(@PathParam("num") int num) {
        return "Your num is " + num;
    }
    
}
