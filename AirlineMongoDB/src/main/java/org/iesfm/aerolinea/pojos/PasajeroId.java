package org.iesfm.aerolinea.pojos;


import java.util.Objects;

public class PasajeroId {

    private String nif;
    private int numeroVuelo;

    public PasajeroId(String nif, int numeroVuelo) {
        this.nif = nif;
        this.numeroVuelo = numeroVuelo;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PasajeroId that = (PasajeroId) o;
        return numeroVuelo == that.numeroVuelo && Objects.equals(nif, that.nif);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, numeroVuelo);
    }

    @Override
    public String toString() {
        return "PasajeroId{" +
                "nif='" + nif + '\'' +
                ", numeroVuelo=" + numeroVuelo +
                '}';
    }
}