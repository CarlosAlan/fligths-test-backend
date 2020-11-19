package mx.com.rappi.travel.flight.rest.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FLIGHT")
public class FlightEntity {

	@Id
	private String itineraryId;
	
	@Column(name = "DEPARTURE_DATE")
	private LocalDate departureDate;
	
	@Column(name = "ARRIVAL_DATE")
	private LocalDate arrivalDate;
	
	@Column(name = "ORIGIN_CITY")
	private String originCity;
	
	@Column(name = "DESTINATION_CITY")
	private String destinationCity;
	
	@Column(name = "PASSENGER_NAME")
	private String passangerName;
	
	@Column(name = "PASSENGER_AGE")
	private Integer passengerAge; 
	
	@Column(name = "LUGGAGE_HOLD")
	private Boolean luggageHold;
	
	@Column(name = "PRICE")
	private BigDecimal price;
	
	@Column(name = "DEPARTURE_TIME")
	private LocalTime departureTime;
	
	@Column(name = "ARRIVAL_TIME")
	private LocalTime arrivalTime;

	public String getItineraryId() {
		return itineraryId;
	}

	public void setItineraryId(String itineraryId) {
		this.itineraryId = itineraryId;
	}

	public LocalDate getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}

	public LocalDate getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public String getOriginCity() {
		return originCity;
	}

	public void setOriginCity(String originCity) {
		this.originCity = originCity;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public String getPassangerName() {
		return passangerName;
	}

	public void setPassangerName(String passangerName) {
		this.passangerName = passangerName;
	}

	public Integer getPassengerAge() {
		return passengerAge;
	}

	public void setPassengerAge(Integer passengerAge) {
		this.passengerAge = passengerAge;
	}

	public Boolean getLuggageHold() {
		return luggageHold;
	}

	public void setLuggageHold(Boolean luggageHold) {
		this.luggageHold = luggageHold;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}

	public LocalTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FlightEntity [itineraryId=");
		builder.append(itineraryId);
		builder.append(", departureDate=");
		builder.append(departureDate);
		builder.append(", arrivalDate=");
		builder.append(arrivalDate);
		builder.append(", originCity=");
		builder.append(originCity);
		builder.append(", destinationCity=");
		builder.append(destinationCity);
		builder.append(", passangerName=");
		builder.append(passangerName);
		builder.append(", passengerAge=");
		builder.append(passengerAge);
		builder.append(", luggageHold=");
		builder.append(luggageHold);
		builder.append(", price=");
		builder.append(price);
		builder.append(", departureTime=");
		builder.append(departureTime);
		builder.append(", arrivalTime=");
		builder.append(arrivalTime);
		builder.append("]");
		return builder.toString();
	}
	
}
