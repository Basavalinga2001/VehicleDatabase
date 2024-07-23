package com.example.demo.service;

import java.util.List;

import com.example.demo.Exception.VehicleNotFoundException;
import com.example.demo.module.Vehicle;

public interface VehicleService {

	Vehicle addVehicle(Vehicle v);

	Vehicle deleteVehicle(Integer id);

	Vehicle getVehiclebyID(Integer id);

	List<Vehicle> vehicleBycolor(String color);

	List<Vehicle> getAlldata();

	List<Vehicle> getVehiclesbyprice();

	List<Vehicle> getVehicleshighprice();

	Vehicle updateVehicle(Vehicle v);

	List<Vehicle> sortbypriceandcolor();
	
	VehicleNotFoundException getVehicleby(Integer id);

}
