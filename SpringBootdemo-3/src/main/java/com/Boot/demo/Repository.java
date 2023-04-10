package com.Boot.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<bikedetails, Integer> {

	

	Optional<bikedetails> findByCost(long cost);

	

	Optional<bikedetails> findByIdOrCost(int id, long cost);



	List<bikedetails> findByIdLessThan(int id);



	

	


	

	

	

	

	

	

	

}
