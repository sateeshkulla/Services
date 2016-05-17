package com.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.services.model.Vehicle;

@Service
public class VehicleServiceImpl implements VehicleService {
	
	/* (non-Javadoc)
	 * @see com.services.VehicleService#addVehicle(java.lang.Long)
	 */
	@Override
	public Vehicle addVehicle(Long vehicleId) {
		Vehicle vehicle = new Vehicle();
		vehicle.setMakeName("Toyota");
		vehicle.setVehicleId(vehicleId);
		vehicle.setMakeId(new Long(2099));
		vehicle.setModelYear(2005);
		vehicle.setModelName("Prius");
		return vehicle;
	}

	/* (non-Javadoc)
	 * @see com.services.VehicleService#addVehicles()
	 */
	@Override
	public List<Vehicle> addVehicles() {
		List<Vehicle> vehicles = new ArrayList<>();
		Vehicle vehicle = new Vehicle();
		vehicle.setMakeName("Audi");
		vehicle.setMakeId(new Long(333));
		vehicle.setModelYear(2009);
		vehicle.setModelName("AXS");
		vehicles.add(vehicle);
		vehicle = new Vehicle();
		vehicle.setMakeName("BMW");
		vehicle.setMakeId(new Long(2011));
		vehicle.setModelYear(2016);
		vehicle.setModelName("X5");
		vehicles.add(vehicle);
		return vehicles;
	}
	
	/* (non-Javadoc)
	 * @see com.services.VehicleService#message()
	 */
	@Override
	public String message(){
		return "Message from VehicleService.";
	}

}
