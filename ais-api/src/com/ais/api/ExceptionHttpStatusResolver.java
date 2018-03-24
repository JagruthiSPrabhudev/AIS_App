package com.ais.api;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * @author Mukesh Poptani
 * 
 */
@Provider
public class ExceptionHttpStatusResolver implements
		ExceptionMapper<CustomException> {

	@Override
	public Response toResponse(CustomException exception) {
		Response.Status httpStatus = Response.Status.INTERNAL_SERVER_ERROR;

		if (exception instanceof CustomException)
			httpStatus = Response.Status.BAD_REQUEST;

		return Response.status(httpStatus).entity(exception.getMessages())
				.build();
	}

}
