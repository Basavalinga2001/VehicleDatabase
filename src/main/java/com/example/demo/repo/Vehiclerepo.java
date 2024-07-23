package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.module.Vehicle;

public interface Vehiclerepo extends JpaRepository<Vehicle,Integer>{
	
	@Query(value="select * from Vehicle where color=?1",nativeQuery = true)
	List<Vehicle> findByColor(String designation);
    
	@Query(value="select * from Vehicle order by price",nativeQuery = true)
	List<Vehicle> Sortbyprice();
    
	@Query(value="select * from Vehicle where price>1000000 order by price ",nativeQuery = true)
	List<Vehicle> Highprice();
    
	@Query(value="select * from Vehicle  order by price,color ",nativeQuery = true)
	List<Vehicle> SortonNameandColor();
	

}
