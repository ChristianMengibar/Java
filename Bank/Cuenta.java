package org.iesfm.banco;

import java.util.Objects;

public class Cuenta {
    private String number;
    private Double saldo;

    public Cuenta(String number, Double saldo) {
        this.number = number;
        this.saldo = saldo;
    }

    public void info(){
        System.out.println("el numero de cuenta es : " + number + " y el saldo es : " + saldo);
    }

    public void ingresar(double dinero) {
        saldo = saldo + dinero;
    }
    public void sacar(double saldo) {
        if (this.saldo >= saldo){
            this.saldo = this.saldo - saldo;
            System.out.println("se han sacado " + saldo);
        }else{
            System.out.println("no hay suficiente saldo en la cuenta");
        }
    }

    public boolean retirarDinero(double dinero){
        boolean confirmacion = false;
        if (dinero > saldo){
            System.out.println("no puede retirar una cantidad superior a su saldo");
        }else{
            saldo = saldo - dinero;
            System.out.println("el dinero ha sido retirado. el saldo de la cuenta " + number + "es de " + saldo);
            confirmacion = true;
        }
        return confirmacion;
    }

    public boolean haySaldo(double dinero){
        return saldo >= dinero;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cuenta cuenta = (Cuenta) o;
        return Objects.equals(number, cuenta.number) &&
                Objects.equals(saldo, cuenta.saldo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, saldo);
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "number='" + number + '\'' +
                ", balance=" + saldo +
                '}';
    }



}
