package org.iesfm.banco;

import java.util.Arrays;
import java.util.Objects;

public class Banco implements IBanco {
    private String nombre;
    private Cliente[] clientes;

    public Banco(String nombre, Cliente[] clientes) {
        this.nombre = nombre;
        this.clientes = clientes;
    }

    public void infoClientes(){
        for (Cliente cliente : clientes){
            cliente.info();
        }
    }

    @Override
    public void imprimirClientes(String NIF) {
        boolean encontrado = false;
        for (int i = 0; i < clientes.length; i++) {
            Cliente cliente = clientes[i];

            if(cliente.getNIF().equals(NIF)){
                encontrado = true;
                cliente.imprimeCuentas();
            }
        }
        if(!encontrado){
            System.out.println("no se ha encontrado al cliente");
        }
    }

    @Override
    public void imprimeCuentaCliente(String NIF, String number) {
        Cliente cliente = encuentraCliente(NIF);

        if (cliente != null){
            cliente.imprimeCuentas();
        }
    }


    private Cliente encuentraCliente(String NIF){
        Cliente result = null;
        for (Cliente cliente:clientes){
            if(cliente.getNIF().equals(NIF)){
                result = cliente;
            }
        }
        return result;
    }

    @Override
    public void ingresaDinero(String number, String NIF, double dinero) {
        Cliente cliente = encuentraCliente(NIF);

        if (cliente != null){
            cliente.ingresar(number, dinero);
        }else{
            System.out.println("error, nose puede ingresara por que no existe el cliente");
        }
    }

    @Override
    public void sacarDinero(String NIF, String number, double saldo) {
        Cliente cliente = encuentraCliente(NIF);
        if (cliente != null){
            cliente.sacar(number, saldo);
        }else{
            System.out.println("hay un error");
        }
    }

    @Override
    public void traspasoDiner(String cuentaOrigen, String cuentaDestino, String NIF, double dinero) {
        Cliente cliente = encuentraCliente(NIF);
        if (cliente != null){
            cliente.traspasoDinero(cuentaOrigen, cuentaDestino, dinero);
        }else{
            System.out.println("el traspaso no puede efectuarse ya que el cliente no se ha encontrado");
        }
    }

    @Override
    public void transferenciaDinero(String NIFOrigen, String numeroOrigen, String NIFDestino, String numeroDestino, double dinero) {
        Cliente clienteOrigen = encuentraCliente(NIFOrigen);
        Cliente clienteDestino = encuentraCliente(NIFDestino);

        if (clienteOrigen != null && clienteDestino != null){
           Cuenta cuentaOrigen = clienteOrigen.encuentraCuenta(numeroOrigen);
           Cuenta cuentaDestino = clienteDestino.encuentraCuenta(numeroDestino);

           if (cuentaOrigen != null && cuentaDestino != null){
               if (dinero <= cuentaOrigen.getSaldo()){
                   cuentaOrigen.sacar(dinero);
                   cuentaDestino.ingresar(dinero);

               }else{
                   System.out.println("no se puede sacar dinero, dinero insuficiente");
               }
           }

        }else{
            System.out.println("no se encontro uno o ningun cliente");
        }
    }

    @Override
    public void printInfoClienteyCuenta(String number) {
        for (Cliente cliente : clientes){
           Cuenta cuenta = cliente.encuentraCuenta(number);

            if (cuenta != null){
                cuenta.info();
            }
        }
    }

    @Override
    public void tranferenciaCuentas(String numberOrigen, String numberDestino, double dinero) {
        Cuenta Origen = buscarCuenta(numberOrigen);
        Cuenta Destino = buscarCuenta(numberDestino);

        if (Origen != null && Destino != null){
            if (Origen.haySaldo(dinero)){
                Origen.sacar(dinero);
                Destino.ingresar(dinero);
            }else{
                System.out.println("no hay saldo suficiente en la cuenta origen");
            }
        }else
            System.out.println("no se encontro cuenta");
    }

    public Cuenta buscarCuenta(String number){
        Cuenta result = null;

        for (Cliente cliente : clientes){
            Cuenta cuenta = cliente.encuentraCuenta(number);

            if (cuenta != null){
                result = cuenta;
            }
        }
        return result;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Banco banco = (Banco) o;
        return Objects.equals(nombre, banco.nombre) &&
                Arrays.equals(clientes, banco.clientes);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nombre);
        result = 31 * result + Arrays.hashCode(clientes);
        return result;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nombre='" + nombre + '\'' +
                ", clientes=" + Arrays.toString(clientes) +
                '}';
    }
}
