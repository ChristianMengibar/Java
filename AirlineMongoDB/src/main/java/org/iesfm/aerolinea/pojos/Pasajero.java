package org.iesfm.aerolinea.pojos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Objects;

@Document(collection = "pasajeros")
public class Pasajero {

    @Id
    private PasajeroId pasajeroId;
    private String email;
    private String nombre;
    private String apellidos;
    private int asiento;
    private List<Maleta> maletas;

    public Pasajero(PasajeroId pasajeroId, String email, String nombre, String apellidos, int asiento, List<Maleta> maletas) {
        this.pasajeroId = pasajeroId;
        this.email = email;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.asiento = asiento;
        this.maletas = maletas;
    }

    public PasajeroId getPasajeroId() {
        return pasajeroId;
    }

    public void setPasajeroId(PasajeroId pasajeroId) {
        this.pasajeroId = pasajeroId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public List<Maleta> getMaletas() {
        return maletas;
    }

    public void setMaletas(List<Maleta> maletas) {
        this.maletas = maletas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pasajero pasajero = (Pasajero) o;
        return asiento == pasajero.asiento && Objects.equals(pasajeroId, pasajero.pasajeroId) && Objects.equals(email, pasajero.email) && Objects.equals(nombre, pasajero.nombre) && Objects.equals(apellidos, pasajero.apellidos) && Objects.equals(maletas, pasajero.maletas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pasajeroId, email, nombre, apellidos, asiento, maletas);
    }

    @Override
    public String toString() {
        return "Pasajero{" +
                "pasajeroId=" + pasajeroId +
                ", email='" + email + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", asiento=" + asiento +
                ", maletas=" + maletas +
                '}';
    }
}