package org.iesfm.aerolinea.api.controllers.pojos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.iesfm.aerolinea.pojos.Maleta;
import org.iesfm.aerolinea.pojos.PasajeroId;

import java.util.List;
import java.util.Objects;

public class PasajeroApi {

    private PasajeroId pasajeroId;
    private String email;
    private String nombre;
    private String apellidos;
    private int asiento;
    private List<Maleta> maletas;

    @JsonCreator
    public PasajeroApi(

            @JsonProperty(value = "maleta", required = true) Maleta maleta) {
        this.pasajeroId = pasajeroId;
        this.email = email;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.asiento = asiento;
        this.maletas = maletas;
    }

    public PasajeroApi(
            @JsonProperty(value = "pasajeroId", required = true) PasajeroId pasajeroId,
            @JsonProperty(value = "email", required = true) String email,
            @JsonProperty(value = "nombre", required = true) String nombre,
            @JsonProperty(value = "apellidos", required = true) String apellidos,
            @JsonProperty(value = "asiento", required = true) int asiento,
            @JsonProperty(value = "maletas", required = true) List<Maleta> maletas) {
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
        PasajeroApi that = (PasajeroApi) o;
        return asiento == that.asiento && Objects.equals(pasajeroId, that.pasajeroId) && Objects.equals(email, that.email) && Objects.equals(nombre, that.nombre) && Objects.equals(apellidos, that.apellidos) && Objects.equals(maletas, that.maletas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pasajeroId, email, nombre, apellidos, asiento, maletas);
    }

    @Override
    public String toString() {
        return "PasajeroApi{" +
                "pasajeroId=" + pasajeroId +
                ", email='" + email + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", asiento=" + asiento +
                ", maletas=" + maletas +
                '}';
    }
}