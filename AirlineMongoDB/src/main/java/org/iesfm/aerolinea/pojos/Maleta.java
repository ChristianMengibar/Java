package org.iesfm.aerolinea.pojos;

import java.util.Objects;

public class Maleta {

    private int codigoMaleta;
    private String descripcion;

    public Maleta(int codigoMaleta, String descripcion) {
        this.codigoMaleta = codigoMaleta;
        this.descripcion = descripcion;
    }

    public int getCodigoMaleta() {
        return codigoMaleta;
    }

    public void setCodigoMaleta(int codigoMaleta) {
        this.codigoMaleta = codigoMaleta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Maleta maleta = (Maleta) o;
        return codigoMaleta == maleta.codigoMaleta && Objects.equals(descripcion, maleta.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoMaleta, descripcion);
    }

    @Override
    public String toString() {
        return "Maleta{" +
                "codigoMaleta=" + codigoMaleta +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}