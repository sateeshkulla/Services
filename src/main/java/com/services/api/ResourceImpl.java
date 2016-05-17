package com.services.api;

import java.util.List;

import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

import org.springframework.beans.factory.annotation.Autowired;

import com.services.VehicleService;
import com.services.model.Vehicle;

/**
 */
@Path("api/V1")
public class ResourceImpl implements Resource {

	/* Give Info about the URI */
	@Context
	private UriInfo uriInfo;
		
	@Autowired
	private VehicleService vehicleService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.services.api.Resource#getVehicles()
	 */
	@Override
	public List<Vehicle> getVehicles() {
		System.out.println("From Interface Impl : " + uriInfo.getPath());
		System.out.println(vehicleService.message());
		return vehicleService.addVehicles();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.services.api.Resource#getVehicle(java.lang.Long)
	 */
	@Override
	public Vehicle getVehicle(Long vehicleId) {
		return vehicleService.addVehicle(vehicleId);
	}

	@Override
	public Vehicle vehicles(Vehicle vehicle) {
		vehicle.setVehicleId(System.nanoTime());
		return vehicle;
	}
	
	@Override
	public String vehicle(Long vehicleId) {
		System.out.println("DELETE RESOURCE GOT CALLED.");
		return "Vehicle is removed :" + vehicleId;
	}

}
