package mx.com.rappi.travel.flight.rest.pojo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class FlightResponse extends FlightRequest{

	protected String itineraryId;

	public String getItineraryId() {
		return itineraryId;
	}
	
	public static class BuilderResponse extends BuilderRequest {
		String itineraryId;

		public BuilderResponse setItineraryId(String itineraryId) {
			this.itineraryId = itineraryId;
			return this;
		}
		
		@Override
		public BuilderResponse setDepartureDate(LocalDate departureDate) {
			this.departureDate = departureDate;
			return this;
		}

		@Override
		public BuilderResponse setArrivalDate(LocalDate arrivalDate) {
			this.arrivalDate = arrivalDate;
			return this;
		}

		@Override
		public BuilderResponse setOriginCity(String originCity) {
			this.originCity = originCity;
			return this;
		}

		@Override
		public BuilderResponse setDestinationCity(String destinationCity) {
			this.destinationCity = destinationCity;
			return this;
		}

		@Override
		public BuilderResponse setPassangerName(String passangerName) {
			this.passangerName = passangerName;
			return this;
		}

		@Override
		public BuilderResponse setPassengerAge(Integer passengerAge) {
			this.passengerAge = passengerAge;
			return this;
		}

		@Override
		public BuilderResponse setLuggageHold(Boolean luggageHold) {
			this.luggageHold = luggageHold;
			return this;
		}

		@Override
		public BuilderResponse setPrice(BigDecimal price) {
			this.price = price;
			return this;
		}

		@Override
		public BuilderResponse setDepartureTime(LocalTime departureTime) {
			this.departureTime = departureTime;
			return this;
		}

		@Override
		public BuilderResponse setArrivalTime(LocalTime arrivalTime) {
			this.arrivalTime = arrivalTime;
			return this;
		}
		
		public FlightResponse build() {
			FlightResponse response = new FlightResponse();
			response.itineraryId = this.itineraryId;
			response.departureDate = this.departureDate;
			response.arrivalDate = this.arrivalDate;
			response.originCity = this.originCity;
			response.destinationCity = this.destinationCity;
			response.passangerName = this.passangerName;
			response.passengerAge = this.passengerAge;
			response.luggageHold = this.luggageHold;
			response.price = this.price;
			response.departureTime = this.departureTime;
			response.arrivalTime = this.arrivalTime;
			return response;
		}
		
	}
	
}
