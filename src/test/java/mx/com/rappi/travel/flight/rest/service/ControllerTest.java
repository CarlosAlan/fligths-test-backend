package mx.com.rappi.travel.flight.rest.service;

import static org.assertj.core.api.Assertions.assertThatCode;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import mx.com.rappi.travel.flight.rest.controller.FlightController;
import mx.com.rappi.travel.flight.rest.pojo.FlightRequest;
import mx.com.rappi.travel.flight.rest.pojo.FlightResponse;
import mx.com.rappi.travel.flight.rest.pojo.GeneralResponse;

@SpringBootTest
public class ControllerTest {

	@Mock private FlightService flightService; 
	
	@InjectMocks private FlightController controller = new FlightController();
	
	private static final LocalDate DEPARTURE_DATE = LocalDate.now();
	
	private static final  LocalDate ARRIVAL_DATE = LocalDate.now().plusDays(1L);
	
	private static final String ORIGIN = "Mexico City";
	
	private static final String DESTINATION = "Cancun";
	
	private static final String NAME = "Juanito Lopez";
	
	private static final BigDecimal PRICE = new BigDecimal("1350.57"); 
	
	private static final LocalTime DEPARTURE_TIME = LocalTime.now();
	
	private static final LocalTime ARRIVAL_TIME = LocalTime.now().plusHours(5L);
	
	@Test
	public void addFlightTest() {
		FlightRequest request = new FlightRequest.BuilderRequest()
				.setDepartureDate(DEPARTURE_DATE)
				.setArrivalDate(ARRIVAL_DATE)
				.setOriginCity(ORIGIN)
				.setDestinationCity(DESTINATION)
				.setPassangerName(NAME)
				.setLuggageHold(false)
				.setPrice(PRICE)
				.setDepartureTime(DEPARTURE_TIME)
				.setArrivalTime(ARRIVAL_TIME)
				.build();
		
		GeneralResponse response = new GeneralResponse("OK", "The flight with identifier ".concat(UUID.randomUUID().toString()).concat(" has been successfully generated"));
		
		Mockito.when(flightService.addFlight(request)).thenReturn(response);
		
		assertThatCode(() -> {
			controller.addFlight(request);
		}).doesNotThrowAnyException();
	}
	
	@Test
	public void finByIdTest() {
		
		String itineraryId = UUID.randomUUID().toString();
		
		FlightResponse response = new FlightResponse.BuilderResponse()
				.setDepartureDate(DEPARTURE_DATE)
				.setArrivalDate(ARRIVAL_DATE)
				.setOriginCity(ORIGIN)
				.setDestinationCity(DESTINATION)
				.setPassangerName(NAME)
				.setLuggageHold(false)
				.setPrice(PRICE)
				.setDepartureTime(DEPARTURE_TIME)
				.setArrivalTime(ARRIVAL_TIME)
				.setItineraryId(itineraryId)
				.build();
		
		Mockito.when(flightService.findFlight(itineraryId)).thenReturn(response);
		
		assertThatCode(() -> {
			controller.findFlightById(itineraryId);
		}).doesNotThrowAnyException();
		
	}
	
}
