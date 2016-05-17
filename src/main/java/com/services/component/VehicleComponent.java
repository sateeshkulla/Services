package com.services.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.services.VehicleService;
import com.services.VehicleServiceImpl;

@Configuration
public class VehicleComponent {
	
	@Bean(name = "vehicleService")
	public VehicleService getVehicleService(){
		System.out.println("COMPOENT SCAN CALLED");
		return new VehicleServiceImpl();
	}
	
}
