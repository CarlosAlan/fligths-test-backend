package mx.com.rappi.travel.flight.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.com.rappi.travel.flight.rest.dto.FlightEntity;

public interface FlightRepository extends JpaRepository<FlightEntity, String>{
	
}
