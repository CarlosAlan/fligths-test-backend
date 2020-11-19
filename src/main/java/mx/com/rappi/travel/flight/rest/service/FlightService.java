package mx.com.rappi.travel.flight.rest.service;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import mx.com.rappi.travel.flight.rest.dto.FlightEntity;
import mx.com.rappi.travel.flight.rest.pojo.FlightRequest;
import mx.com.rappi.travel.flight.rest.pojo.FlightResponse;
import mx.com.rappi.travel.flight.rest.pojo.GeneralResponse;
import mx.com.rappi.travel.flight.rest.repository.FlightRepository;

@Service
public class FlightService {

	private static final Logger logger = LoggerFactory.getLogger(FlightService.class);
	
	@Autowired
	private FlightRepository repository;
	
	public GeneralResponse addFlight(FlightRequest request) {
		logger.info("FlightService.addFlight()");
		try {
			
			String itineraryId = UUID.randomUUID().toString();
			
			FlightEntity entity = new FlightEntity();
			entity.setItineraryId(itineraryId);
			entity.setDepartureDate(request.getDepartureDate());
			entity.setArrivalDate(request.getArrivalDate());
			entity.setOriginCity(request.getOriginCity());
			entity.setDestinationCity(request.getDestinationCity());
			entity.setPassangerName(request.getPassangerName());
			entity.setPassengerAge(request.getPassengerAge());
			entity.setLuggageHold(request.getLuggageHold());
			entity.setPrice(request.getPrice());
			entity.setDepartureTime(request.getDepartureTime());
			entity.setArrivalTime(request.getArrivalTime());
			repository.save(entity);
			
			return new GeneralResponse("OK", "The flight with identifier ".concat(itineraryId)
					.concat(" has been successfully generated"));
			
		} catch(Exception e){
			logger.error("Failed to save entity", e);
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Failed to save entity");
		}
	
	}
	
	public FlightResponse findFlight(String itineraryId) {
		logger.info("FlightService.addFlight()");
		try {
			FlightEntity entity = repository.findById(itineraryId).get();
			return new FlightResponse.BuilderResponse()
					.setItineraryId(entity.getItineraryId())
					.setDepartureDate(entity.getDepartureDate())
					.setArrivalDate(entity.getArrivalDate())
					.setOriginCity(entity.getOriginCity())
					.setDestinationCity(entity.getDestinationCity())
					.setPassangerName(entity.getPassangerName())
					.setPassengerAge(entity.getPassengerAge())
					.setLuggageHold(entity.getLuggageHold())
					.setPrice(entity.getPrice())
					.setDepartureTime(entity.getDepartureTime())
					.setArrivalTime(entity.getArrivalTime())
					.build();
		}catch(Exception e){
			logger.error("Failed to find the requested entity", e);
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Failed to find the requested entity");
		}
	}
	
}
