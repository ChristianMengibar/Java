package org.iesfm.aerolinea.api.controllers.pojos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.Objects;

public class VueloApi {
    private int numeroVuelo;
    private String origen;
    private String destino;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date fecha;

    @JsonCreator
    public VueloApi(
            @JsonProperty(value = "numeroVuelo", required = true) int numeroVuelo,
            @JsonProperty(value = "origen", required = true) String origen,
            @JsonProperty(value = "destino", required = true) String destino,
            @JsonProperty(value = "fecha", required = true) Date fecha) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VueloApi vuelosApi = (VueloApi) o;
        return numeroVuelo == vuelosApi.numeroVuelo && Objects.equals(origen, vuelosApi.origen) && Objects.equals(destino, vuelosApi.destino) && Objects.equals(fecha, vuelosApi.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroVuelo, origen, destino, fecha);
    }

    @Override
    public String toString() {
        return "VuelosApi{" +
                "numeroVuelo=" + numeroVuelo +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
