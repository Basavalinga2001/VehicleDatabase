package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Exception.VehicleNotFoundException;
import com.example.demo.module.Vehicle;
import com.example.demo.service.VehicleService;

@RestController
public class VehicleController {
	@Autowired
	VehicleService ser;

	@PostMapping("/addVehicle")
	ResponseEntity<Vehicle> addVehicle(@RequestBody Vehicle v)
	{
		return new ResponseEntity<Vehicle>(ser.addVehicle(v),HttpStatus.CREATED);
	}
	@DeleteMapping("deleteVehicle")
	ResponseEntity<Vehicle> deleteVehicle(@RequestParam Integer id){
		return new ResponseEntity<Vehicle>(ser.deleteVehicle(id),HttpStatus.OK);
    }
	@GetMapping("getVehiclebyID")
	ResponseEntity<Vehicle> getVehiclebyID(@RequestHeader Integer id)
	{
		
		return new ResponseEntity<Vehicle>(ser.getVehiclebyID(id),HttpStatus.CREATED);
	}
	@GetMapping("/vehicleBycolor")
	ResponseEntity <List<Vehicle>> vehicleBycolor(@RequestHeader String color){
		return new ResponseEntity<List<Vehicle>> (ser.vehicleBycolor(color), HttpStatus.FOUND);
	}
	@GetMapping("/getAlldata")
	ResponseEntity <List<Vehicle>> getAlldata(){
		return new ResponseEntity<List<Vehicle>> (ser.getAlldata(), HttpStatus.FOUND);
	}
	@GetMapping("/getVehiclesbyprice")
	ResponseEntity <List<Vehicle>> getVehiclesbyprice(){
		return new ResponseEntity<List<Vehicle>> (ser.getVehiclesbyprice(), HttpStatus.FOUND);
	}
	@GetMapping("/getVehicleshighprice")
	ResponseEntity <List<Vehicle>> getVehicleshighprice(){
		return new ResponseEntity<List<Vehicle>> (ser.getVehicleshighprice(), HttpStatus.FOUND);
	}
	@PutMapping("/updateVehicle")
    ResponseEntity<Vehicle> updateVehicle(@RequestBody Vehicle v){
      return new ResponseEntity<Vehicle>(ser.updateVehicle(v), HttpStatus.OK);
    } 
	@GetMapping("/sortbypriceandcolor")
	ResponseEntity <List<Vehicle>> sortbypriceandcolor(){
		return new ResponseEntity<List<Vehicle>> (ser.sortbypriceandcolor(), HttpStatus.FOUND);
	} 

}
