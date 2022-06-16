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
public class CuentaCorriente extends Cuenta{
    
    private Integer lineaCredito;
    private Integer saldoDisp;
    private Integer saldoContable;

    public CuentaCorriente() {
    }


    public CuentaCorriente(Integer lineaCredito, Integer saldoDisp, Integer saldoContable, Integer numero, Integer monto, Integer saldo) {
        super(numero, monto, saldo);
        this.lineaCredito = lineaCredito;
        this.saldoDisp = saldoDisp;
        this.saldoContable = saldoContable;
    }

    public Integer getLineaCredito() {
        return lineaCredito;
    }

    public void setLineaCredito(Integer lineaCredito) {
        this.lineaCredito = lineaCredito;
    }

    public Integer getSaldoDisp() {
        return saldoDisp;
    }

    public void setSaldoDisp(Integer saldoDisp) {
        this.saldoDisp = saldoDisp;
    }

    public Integer getSaldoContable() {
        return saldoContable;
    }

    public void setSaldoContable(Integer saldoContable) {
        this.saldoContable = saldoContable;
    }

    
    
    
    
}
