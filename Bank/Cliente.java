package org.iesfm.banco;

import java.util.Arrays;
import java.util.Objects;

public class Cliente {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String NIF;
    private Cuenta[] cuentas;

    public Cliente(String nombre, String apellido1, String apellido2, String NIF, Cuenta[] cuentas) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.NIF = NIF;
        this.cuentas = cuentas;
    }

    public void info() {
        System.out.println("el cliente" + nombre + " " + apellido1 + " " + apellido2 + " con NIF " + NIF);
    }

    public void imprimeCuentas(){
        for (int i = 0; i < cuentas.length; i++) {
            Cuenta cuenta = cuentas[i];
            cuenta.info();
        }
    }
    public Cuenta encuentraCuenta (String number){
        Cuenta cuenta = null;
        for(Cuenta c : cuentas){
            if( c.getNumber().equals(number)){
                cuenta = c;
            }
        }
        return cuenta;
    }

    public void ingresar(String number, double dinero) {
        Cuenta cuenta = encuentraCuenta(number);

        if (cuenta != null){
            cuenta.ingresar(dinero);
        }else{
            System.out.println("hay un error, no se encuentra la cuenta");
        }
    }

    public void sacar(String number, double saldo) {
        Cuenta cuenta = encuentraCuenta(number);
        if (cuenta != null){
            cuenta.sacar(saldo);
        }else{
            System.out.println("no existe la cuenta");
        }
    }

    public void traspasoDinero(String cuentaOrigen, String cuentaDestino, double dinero) {
        Cuenta cuentaEmisora = encuentraCuenta(cuentaOrigen);
        Cuenta cuentaReceptora = encuentraCuenta(cuentaDestino);

        if (cuentaEmisora != null && cuentaReceptora != null){
            if (cuentaEmisora.retirarDinero(dinero)){
                cuentaReceptora.ingresar(dinero);
            }
            cuentaEmisora.info();
            cuentaReceptora.info();
        }else{
            System.out.println("no se ha encontrado una o las dos cuentas seleccionadas");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(nombre, cliente.nombre) &&
                Objects.equals(apellido1, cliente.apellido1) &&
                Objects.equals(apellido2, cliente.apellido2) &&
                Objects.equals(NIF, cliente.NIF) &&
                Arrays.equals(cuentas, cliente.cuentas);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nombre, apellido1, apellido2, NIF);
        result = 31 * result + Arrays.hashCode(cuentas);
        return result;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", NIF='" + NIF + '\'' +
                ", cuentas=" + Arrays.toString(cuentas) +
                '}';
    }



}
