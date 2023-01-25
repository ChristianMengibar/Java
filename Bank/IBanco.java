package org.iesfm.banco;

public interface IBanco {
    void infoClientes();

    void imprimirClientes(String NIF);

    void imprimeCuentaCliente(String NIF, String number);

    void ingresaDinero(String number, String NIF, double dinero);

    void sacarDinero(String NIF, String number, double saldo);

    void traspasoDiner(String cuentaOrigen, String cuentaDestino, String NIF, double dinero);

    void transferenciaDinero ( String NIFOrigen, String numeroOrigen, String NIFDestino, String numeroDestino, double dinero);

    void printInfoClienteyCuenta (String number);

    void tranferenciaCuentas(String numberOrigen, String numberDestino, double dinero);
}
