package Iberia;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Passenger {

    private String nif;
    @JsonProperty("class")
    private String flightClass;
    private int seat;

    @JsonCreator
    public Passenger(
            @JsonProperty("nif") String nif,
            @JsonProperty("class") String flightClass,
            @JsonProperty("seat") int seat) {
        this.nif = nif;
        this.flightClass = flightClass;
        this.seat = seat;
    }

    public Passenger(){


    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getFlightClass() {
        return flightClass;
    }

    public void setFlightClass(String flightClass) {
        this.flightClass = flightClass;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passenger passenger = (Passenger) o;
        return Objects.equals(nif, passenger.nif) && Objects.equals(flightClass, passenger.flightClass) && Objects.equals(seat, passenger.seat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, flightClass, seat);
    }

    @Override
    public String toString() {
        return "Iberia.Passenger{" +
                "nif='" + nif + '\'' +
                ", flightClass='" + flightClass + '\'' +
                ", seat='" + seat + '\'' +
                '}';
    }
}

