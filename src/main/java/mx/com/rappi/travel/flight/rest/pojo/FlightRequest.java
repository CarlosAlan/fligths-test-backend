package mx.com.rappi.travel.flight.rest.pojo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class FlightRequest {
	
	protected LocalDate departureDate;
	protected LocalDate arrivalDate;
	protected String originCity;
	protected String destinationCity;
	protected String passangerName;
	protected Integer passengerAge; 
	protected Boolean luggageHold;
	protected BigDecimal price;
	protected LocalTime departureTime;
	protected LocalTime arrivalTime;
	
	public LocalDate getDepartureDate() {
		return departureDate;
	}
	public LocalDate getArrivalDate() {
		return arrivalDate;
	}
	public String getOriginCity() {
		return originCity;
	}
	public String getDestinationCity() {
		return destinationCity;
	}
	public String getPassangerName() {
		return passangerName;
	}
	public Integer getPassengerAge() {
		return passengerAge;
	}
	public Boolean getLuggageHold() {
		return luggageHold;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public LocalTime getDepartureTime() {
		return departureTime;
	}
	public LocalTime getArrivalTime() {
		return arrivalTime;
	}
	
	public static class BuilderRequest {
		LocalDate departureDate;
		LocalDate arrivalDate;
		String originCity;
		String destinationCity;
		String passangerName;
		Integer passengerAge; 
		Boolean luggageHold;
		BigDecimal price;
		LocalTime departureTime;
		LocalTime arrivalTime;
		
		public BuilderRequest setDepartureDate(LocalDate departureDate) {
			this.departureDate = departureDate;
			return this;
		}
		public BuilderRequest setArrivalDate(LocalDate arrivalDate) {
			this.arrivalDate = arrivalDate;
			return this;
		}
		public BuilderRequest setOriginCity(String originCity) {
			this.originCity = originCity;
			return this;
		}
		public BuilderRequest setDestinationCity(String destinationCity) {
			this.destinationCity = destinationCity;
			return this;
		}
		public BuilderRequest setPassangerName(String passangerName) {
			this.passangerName = passangerName;
			return this;
		}
		public BuilderRequest setPassengerAge(Integer passengerAge) {
			this.passengerAge = passengerAge;
			return this;
		}
		public BuilderRequest setLuggageHold(Boolean luggageHold) {
			this.luggageHold = luggageHold;
			return this;
		}
		public BuilderRequest setPrice(BigDecimal price) {
			this.price = price;
			return this;
		}
		public BuilderRequest setDepartureTime(LocalTime departureTime) {
			this.departureTime = departureTime;
			return this;
		}
		public BuilderRequest setArrivalTime(LocalTime arrivalTime) {
			this.arrivalTime = arrivalTime;
			return this;
		}
		
		public FlightRequest build() {
			FlightRequest request = new FlightRequest();
			request.departureDate = this.departureDate;
			request.arrivalDate = this.arrivalDate;
			request.originCity = this.originCity;
			request.destinationCity = this.destinationCity;
			request.passangerName = this.passangerName;
			request.passengerAge = this.passengerAge;
			request.luggageHold = this.luggageHold;
			request.price = this.price;
			request.departureTime = this.departureTime;
			request.arrivalTime = this.arrivalTime;
			return request;
		}
	}
	
}
