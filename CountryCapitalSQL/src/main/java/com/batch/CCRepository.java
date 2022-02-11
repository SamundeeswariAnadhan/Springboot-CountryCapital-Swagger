package com.batch;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface CCRepository extends JpaRepository<Countrycapital, Long>{
	
	@Query(value="Select * from Countrycapital", nativeQuery = true)
	List<Countrycapital> getAllCountriesAndCapitals();
}
