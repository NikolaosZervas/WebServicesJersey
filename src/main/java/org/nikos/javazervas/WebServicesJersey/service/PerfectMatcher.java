package org.nikos.javazervas.WebServicesJersey.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;



@Path("names")
public class PerfectMatcher {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	//@Consumes(MediaType.TEXT_PLAIN)
	public String nameFromHtml(@QueryParam("name") String name)
	{
	//	if (name==null || name.isEmpty()){
		
		Client client=Client.create();
		//
		WebResource service=client.resource("http://localhost:8080/WebServicesJersey/webapi/asciinumbers?token="+name);
		ClientResponse response=service.accept(MediaType.TEXT_PLAIN).get(ClientResponse.class);
		String uname=response.getEntity(String.class);
		
		WebResource service2=client.resource("http://localhost:8080/WebServicesJersey/webapi/womennames?token2="+uname);
		ClientResponse response2=service2.accept(MediaType.TEXT_PLAIN).get(ClientResponse.class);
		String wname=response2.getEntity(String.class);
		
		System.out.println(" From HTML: "+name+ "\n"+ " From Numberizer: "+uname+ "\n" + "From NumMatcher: "+wname);
		
		
		
		return wname;
	
	}
	
  }
