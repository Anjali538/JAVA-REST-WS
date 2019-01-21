package com.test;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//import javax.ws.rs.core.Response;
import com.java.list.term.pojo.RMSList;
import com.java.list.term.pojo.RMSListJersey;
import com.java.connection.sql.ConnectionSQL;

@Path("/hello")
public class Hello {
	 @GET
	 @Produces(MediaType.TEXT_PLAIN)
     public String sayHello() {
         String output = "Hello" ;
         return output;
     }
	
	  @GET
	  @Path("/{id}")  
	  @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	  public ArrayList<RMSList> getCustomerInXML(@PathParam("id") int pin)
	  { 
       ConnectionSQL lConnectionSQL = new ConnectionSQL(); 
       ArrayList<RMSList> lList = lConnectionSQL.getDBConnection();
	   return lList; 
	  }
	 
	 
	/*
	 * @GET
	 * 
	 * @Path("/{id}")
	 * 
	 * @Produces(MediaType.APPLICATION_JSON) public ArrayList<RMSListJersey>
	 * getCustomerInXML(@PathParam("id") int pin) { ConnectionSQL lConnectionSQL =
	 * new ConnectionSQL(); ArrayList<RMSListJersey> lList =
	 * lConnectionSQL.getDBConnection(); return lList; }
	 */
	
	/*
	 * @GET
	 * 
	 * @Path("/get")
	 * 
	 * @Produces(MediaType.APPLICATION_JSON) public Track getTrackInJSON() {
	 * 
	 * Track track = new Track(); track.setTitle("Enter Sandman");
	 * track.setSinger("Metallica");
	 * 
	 * return track;
	 * 
	 * }
	 */
	        
//	        public Response verifyRESTService(InputStream incomingData) {
//	    		String result = "CrunchifyRESTService Successfully started..";
//	     
//	    		// return HTTP response 200 in case of success
//	    		return Response.status(200).entity(result).build();
//	    	}
	 
	 
	 

}
