package com.services;

import java.util.List;

import com.services.model.Vehicle;

public interface VehicleService {

	Vehicle addVehicle(Long vehicleId);

	List<Vehicle> addVehicles();

	String message();

}