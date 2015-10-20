package org.nikos.javazervas.WebServicesJersey.check;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


@Path("/womennames")
public class NumMatcher {
	
@GET
@Produces(MediaType.TEXT_PLAIN)
public String nameToWomanNumber(@QueryParam("token2") String token2){
   	
	int num=Integer.parseInt(token2);
	String wname=getWoman(num);
	
	
	
	return wname;

 }

public String getWoman(int num)
{
	if (num<800)
	{
		String m="Maria";                
		return m;                     
		
	}
	else if(num>=800 && num<1200){
		String e="Elena";
		return e;
	
	}
	
	else if(num>=1200 && num<1600)
	{
		String M="Marina";
		return M;
	}
	else if(num>=1600)
	{
		String n="Nancy";
	return n;
	}
	else
	
		return "Cant find accepted Matches!!!";
	
}

}
