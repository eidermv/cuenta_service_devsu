package org.example.cuenta_service_devsu.cuenta.domain.model;

import java.util.Date;

public class Movimiento extends Cuenta {
    private int movimientoid;
    private Date fecha;
    private String tipo;
    private int valor;
    private int saldo;
    private int numero_cuenta;

    public int getMovimientoid() {
        return movimientoid;
    }

    public void setMovimientoid(int movimientoid) {
        this.movimientoid = movimientoid;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numero_cuenta;
    }

    public void setNumeroCuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }
}
