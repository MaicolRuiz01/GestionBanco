/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionbanco;

/**
 *
 * @author Usuario
 */
public class Cuenta {
    protected Integer numero;
    protected Integer monto;
    protected Integer saldo;
    private static int cantidad;

    public Cuenta() {
        cantidad++;
    }

    public Cuenta(Integer numero, Integer monto, Integer saldo) {
        this.numero = numero;
        this.monto = monto;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getMonto() {
        return monto;
    }

    public void setMonto(Integer monto) {
        this.monto = monto;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public static int getCantidad() {
        return cantidad;
    }

    public static void setCantidad(int cantidad) {
        Cuenta.cantidad = cantidad;
    }
    
    
   
    
    
}
