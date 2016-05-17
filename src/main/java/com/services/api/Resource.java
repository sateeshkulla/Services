package com.services.api;

import java.util.List;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.services.model.Vehicle;
@PermitAll
public interface Resource {

	/**
	 * Method handling HTTP GET requests. The returned object will be sent
	 * to the client as "text/plain" media type.
	 *
	 * @return String that will be returned as a text/plain response.
	 */
	@GET
	@Path("/vehicles")
	@Produces(MediaType.APPLICATION_JSON)
	List<Vehicle> getVehicles();
	
	@GET
	@Path("/vehicles/{vehicleId}")
	@Produces(MediaType.APPLICATION_JSON)
	Vehicle getVehicle(@PathParam("vehicleId") Long vehicleId);
	
	@POST
	@Path("/vehicles")
	@Consumes(MediaType.APPLICATION_JSON)
	Vehicle vehicles(Vehicle vehicle);
	
	@RolesAllowed("REST")
    @DELETE
    @Path("/vehicles/{vehicleId}")
	String vehicle(@PathParam("vehicleId") Long vehicleId);

}