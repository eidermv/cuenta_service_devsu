package org.example.cuenta_service_devsu.cuenta.domain.model;

public class Cuenta {

    private int numero_cuenta;
    private int clienteid;
    private String tipo;
    private int saldo_inicial;
    private boolean estado;


    public int getNumeroCuenta() {
        return numero_cuenta;
    }

    public void setNumeroCuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public int getClienteid() {
        return clienteid;
    }

    public void setClienteid(int clienteid) {
        this.clienteid = clienteid;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getSaldoInicial() {
        return saldo_inicial;
    }

    public void setSaldoInicial(int saldo_inicial) {
        this.saldo_inicial = saldo_inicial;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
