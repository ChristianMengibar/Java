package org.iesfm.vehiculo;

public class Vehiculo {

    private String tipo;
    private int velocidad;
    private String color;
    private String matricula;

    public Vehiculo(String modelo, int velocidad, String color, String matricula) {
        this.tipo = tipo;
        this.velocidad = velocidad;
        this.color = color;
        this.matricula = matricula;
    }

    public String getTipo() {
        return tipo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public String getColor() {
        return color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void info() {
        System.out.println("El vehiculo es " + tipo + " tiene un color " + color + " con una velocidad de " + velocidad + " y su matricula es " + matricula);
    }
}
