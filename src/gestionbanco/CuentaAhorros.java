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
public class CuentaAhorros extends Cuenta{
    
    private Integer maxGiro;
    private Integer interes;

    public CuentaAhorros() {
    }

    public CuentaAhorros(Integer maxGiro, Integer interes, Integer numero, Integer monto, Integer saldo) {
        super(numero, monto, saldo);
        this.maxGiro = maxGiro;
        this.interes = interes;
    }

    public Integer getMaxGiro() {
        return maxGiro;
    }

    public void setMaxGiro(Integer maxGiro) {
        this.maxGiro = maxGiro;
    }

    public Integer getInteres() {
        return interes;
    }

    public void setInteres(Integer interes) {
        this.interes = interes;
    }

    
    
    
    
}
