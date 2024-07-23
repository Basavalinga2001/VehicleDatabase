package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.Exception.VehicleNotFoundException;
import com.example.demo.module.Vehicle;
import com.example.demo.repo.Vehiclerepo;
import com.example.demo.service.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService{
	@Autowired
	Vehiclerepo repo;

	@Override
	public Vehicle addVehicle(Vehicle v) {
		// TODO Auto-generated method stub
		
		return repo.save(v);
	

}

	@Override
	public Vehicle deleteVehicle(Integer id) {
		Vehicle v=repo.findById(id).orElse(null);
		
		if(v!=null)
		{
			repo.deleteById(id);
			return v;
		}
		else {
			throw new VehicleNotFoundException("Vehicle", "id", id);
		}
	}

	@Override
	public Vehicle getVehiclebyID(Integer id) {
		// TODO Auto-generated method stub
		return  repo.findById(id).orElseThrow(()->new VehicleNotFoundException("Vehicle", "id", id));
	}

	@Override
	public List<Vehicle> vehicleBycolor(String color) {
		// TODO Auto-generated method stub
		 return repo.findByColor(color);
	}

	@Override
	public List<Vehicle> getAlldata() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<Vehicle> getVehiclesbyprice() {
		// TODO Auto-generated method stub
		return repo.Sortbyprice();
	}

	@Override
	public List<Vehicle> getVehicleshighprice() {
		// TODO Auto-generated method stub
		return repo.Highprice();
	}
	@Override
	  public Vehicle updateVehicle(Vehicle v) {
	    Vehicle v1=repo.findById(v.getId()).orElse(null);
	    if(v1!=null) {
	      v1.setName(v.getName());
	      v1.setColor(v.getColor()); 
	      v1.setModule(v.getModule());
	      v1.setPrice(v.getPrice());
	      return repo.save(v1);
	    }
	    else {
	      throw new VehicleNotFoundException("Vehicle", "vid", v.getId());
	    }
	  }

	@Override
	public List<Vehicle> sortbypriceandcolor() {
		// TODO Auto-generated method stub
		return repo.SortonNameandColor();
	}

	@Override
	public VehicleNotFoundException getVehicleby(Integer id) {
		
		return new VehicleNotFoundException("Vehicle", "id", id) ;
	}
}
