package org.iesfm.aerolinea.pojos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.Objects;

@Document(collection = "vuelos")
public class Vuelo {

    @Id
    private int numeroVuelo;
    private String origen;
    private String destino;
    private Date fecha;

    public Vuelo(int numeroVuelo, String origen, String destino, Date fecha) {
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
        Vuelo vuelo = (Vuelo) o;
        return numeroVuelo == vuelo.numeroVuelo && Objects.equals(origen, vuelo.origen) && Objects.equals(destino, vuelo.destino) && Objects.equals(fecha, vuelo.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroVuelo, origen, destino, fecha);
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "numeroVuelo=" + numeroVuelo +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}