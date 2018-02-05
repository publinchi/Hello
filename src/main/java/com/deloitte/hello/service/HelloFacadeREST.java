/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deloitte.hello.service;

import com.deloitte.hello.entity.Hello;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author pestupinan
 */
@Stateless
@Path("hello")
public class HelloFacadeREST extends AbstractFacade {

    @GET
    @Path("{name}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Override
    public Response greet(@PathParam("name") String name) {
        Hello hello = new Hello();
        hello.setMessage(name);
        return Response.status(201).entity(hello).build();
    }

}
