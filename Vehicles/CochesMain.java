package org.iesfm.vehiculo;

import java.util.Scanner;

public class CochesMain {
    static Scanner scan = new Scanner(System.in);

    static Vehiculo[] listaVehiculo(){
        System.out.println("Introduce el tamaño de la lista de vehiculos: ");
        int tamaño = scan.nextInt();
        Vehiculo[] listaVehiculos = new Vehiculo[tamaño];
        for (int i = 0; i < listaVehiculos.length; i++) {
            listaVehiculos[i] = datosVehiculo();
        }
        return listaVehiculos;
    }

    public static Vehiculo datosVehiculo() {
        System.out.println("¿Que tipo de vehiculo quiere?");
        String tipo = scan.next();
        System.out.println("¿Cual sera su velocidad maxima?");
        int velocidad = scan.nextInt();
        System.out.println("¿De que color lo quiere?");
        String color = scan.next();
        System.out.println("¿Que matricula tendra?");
        String matricula = scan.next();
        Vehiculo vehiculo = new Vehiculo(tipo, velocidad, color, matricula);
        return vehiculo;
    }

    static void imprimir(Vehiculo[] vehiculos){
        for (int i = 0; i < vehiculos.length; i++) {
            vehiculos[i].info();
        }
    }

    public static void main(String[] args) {
        Vehiculo vehiculo = datosVehiculo();
        Vehiculo[] vehiculos = listaVehiculo();
        imprimir(vehiculos);
    }
}