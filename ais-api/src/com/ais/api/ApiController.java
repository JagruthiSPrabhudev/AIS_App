package com.ais.api;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author Mukesh Poptani
 * 
 */
@Path("/v1")
@Produces(MediaType.APPLICATION_JSON)
public class ApiController {

	@GET
	@Path("/student")
	public Response getMoviesByGenre(@QueryParam("usc_id") String usc_id) throws CustomException {
		List<String> errorMessages = new ArrayList<String>();
		
		System.out.println("hi :" + usc_id);
		
		if(usc_id.isEmpty()) {
			errorMessages.add("USC ID is mandatory field");
		}
		
		Student student = new ApiService().getStudentRecord(usc_id);
		
		if(student == null){
			errorMessages.add("Record not found");
		}
		if(!errorMessages.isEmpty()) {
			throw new CustomException(errorMessages);
		}

		return Response.status(Response.Status.OK).entity(student).build();
	}


}
