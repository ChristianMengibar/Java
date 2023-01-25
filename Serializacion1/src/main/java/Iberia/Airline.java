package Iberia;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Airline {
    private String name;
    private List<Flight>flights;

    @JsonCreator
    public Airline(
            @JsonProperty("name")String name,
            @JsonProperty("flights")List<Flight> flights) {
        this.name = name;
        this.flights = flights;
    }

    public Airline(){


    }

    public List<Passenger> getPassengers(int number){

       List<Passenger> passengerList = new ArrayList<>();

        for (Flight flight : flights) {

            if (flight.getNumber() == number){

                passengerList = flight.getPassengers();

            }
        }

        return passengerList;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return Objects.equals(name, airline.name) && Objects.equals(flights, airline.flights);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, flights);
    }

    @Override
    public String toString() {
        return "Iberia.Airline{" +
                "name='" + name + '\'' +
                ", flights=" + flights +
                '}';
    }
}
