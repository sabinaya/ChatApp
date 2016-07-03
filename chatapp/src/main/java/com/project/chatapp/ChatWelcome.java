package com.project.chatapp;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
 
@Path("/")
public class ChatWelcome { 
	
	@GET
	@Produces("text/html")
	public Response getStartingPage()
	{
		String output = "<h1>Chat Application<h1>" +
				"<p>Create a profile <br>Ping @ " + new Date().toString() + "</p<br>";
		return Response.status(200).entity(output).build();
	}
}
