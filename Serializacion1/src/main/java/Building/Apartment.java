package Building;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

public class Apartment {

    private int floorNumber;
    private String doorLetter;
    private List<Owner> owners;

    @JsonCreator
    public Apartment(
            @JsonProperty("floorNumber") int floorNumber,
            @JsonProperty("doorLetter") String doorLetter,
            @JsonProperty("owners") List<Owner> owners) {
        this.floorNumber = floorNumber;
        this.doorLetter = doorLetter;
        this.owners = owners;
    }

    public Apartment(){


    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public String getDoorLetter() {
        return doorLetter;
    }

    public void setDoorLetter(String doorLetter) {
        this.doorLetter = doorLetter;
    }

    public List<Owner> getOwners() {
        return owners;
    }

    public void setOwners(List<Owner> owners) {
        this.owners = owners;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apartment apartment = (Apartment) o;
        return Objects.equals(floorNumber, apartment.floorNumber) && Objects.equals(doorLetter, apartment.doorLetter) && Objects.equals(owners, apartment.owners);
    }

    @Override
    public int hashCode() {
        return Objects.hash(floorNumber, doorLetter, owners);
    }

    @Override
    public String toString() {
        return "Building.Apartment{" +
                "floorNumber='" + floorNumber + '\'' +
                ", doorLetter='" + doorLetter + '\'' +
                ", owners=" + owners +
                '}';
    }





}
