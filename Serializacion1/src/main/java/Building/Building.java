package Building;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Building {

    private String address;
    private String municipality;
    private List<Apartment> apartments;

    @JsonCreator
    public Building(
            @JsonProperty("address") String address,
            @JsonProperty("municipality") String municipality,
            @JsonProperty("apartments") List<Apartment> apartments) {
        this.address = address;
        this.municipality = municipality;
        this.apartments = apartments;
    }
    public Building(){


    }

    public List<Apartment> getApartments(int floorNumber){

        List<Apartment> apartmentList = new ArrayList<>();

        for (Apartment apartment : apartments) {
            if(apartment.getFloorNumber() == floorNumber){

                apartmentList.add(apartment);
            }
        }

        return apartmentList;



    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public List<Apartment> getApartments() {
        return apartments;
    }

    public void setApartments(List<Apartment> apartments) {
        this.apartments = apartments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return Objects.equals(address, building.address) && Objects.equals(municipality, building.municipality) && Objects.equals(apartments, building.apartments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, municipality, apartments);
    }

    @Override
    public String toString() {
        return "Building.Building{" +
                "address='" + address + '\'' +
                ", municipality='" + municipality + '\'' +
                ", apartments=" + apartments +
                '}';
    }
}
