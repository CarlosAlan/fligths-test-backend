package mx.com.rappi.travel.flight.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

import mx.com.rappi.travel.flight.rest.pojo.FlightRequest;
import mx.com.rappi.travel.flight.rest.pojo.FlightResponse;
import mx.com.rappi.travel.flight.rest.pojo.GeneralResponse;
import mx.com.rappi.travel.flight.rest.service.FlightService;

@RestController
@RequestMapping("/api/v1/flight/")
public class FlightController {

	@Autowired
	FlightService flightService;

	@GetMapping("/ping")
	public GeneralResponse ping() throws JsonProcessingException {
	    return new GeneralResponse("OK", "Welcome to Flight Manager API");
	}
	
	@PostMapping("/add")
	public GeneralResponse addFlight(@Validated @RequestBody FlightRequest request) {
		return flightService.addFlight(request);
	}
	
	@GetMapping("/findById/{id}")
	public FlightResponse findFlightById(@PathVariable(value = "id") String id) {
		return flightService.findFlight(id);
	}
	
}
