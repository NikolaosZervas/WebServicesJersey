package org.nikos.javazervas.WebServicesJersey.convertor;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/asciinumbers")
public class Numberizer {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	
	public String nameToNumber(@QueryParam("token") String token){
		
		int num=namesToInt(token);
		
		System.out.println("Inside Numberizer :" + token +" Ascii number is :"+num);
		String name=num + "";
		return name;
	}
	
	
	public int namesToInt(String token)
	{
		int sum=0;
		for(int i=0; i<token.length(); i++){
			
			sum+=token.charAt(i);
		}
		return sum;
	}

}
