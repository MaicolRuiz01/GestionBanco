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
public class GestionBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Cliente cl =new Cliente("11519-v", "Andres", "Blanco");
      CuentaCorriente cc1=new CuentaCorriente(2000000, 1000000, 3000000, 5454, 100000, 800000);
      CuentaAhorros ca=new CuentaAhorros(5, 3, 9083, 50000, 700000);
      cl.agregarCuenta(cc1);
      cl.agregarCuenta(ca);
      cl.mostrarCuenta();
      cl.cantidad();
      cl.saldo();
        System.out.println("------------------------------------------------");
        
      Cliente cl2=new Cliente("2345-N","Camila","Rodriguez");
     CuentaCorriente cc2=new CuentaCorriente(3500000, 1320000, 2900000, 9865, 100000, 1234590);
     CuentaAhorros ca2=new CuentaAhorros(5, 3, 7665, 650000, 7300000);
     CuentaAhorros ca3=new CuentaAhorros(5, 3, 7666, 1050000, 2300000);
     cl2.agregarCuenta(cc2);
     cl2.agregarCuenta(ca2);
     cl2.agregarCuenta(ca3);
     cl2.mostrarCuenta();
     cl2.cantidad();
     cl2.saldo();
    
    } 
}
