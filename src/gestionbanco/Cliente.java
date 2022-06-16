/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionbanco;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Cliente {
    private String rut;
    private String nombre;
    private String apellido;
    private ArrayList<Cuenta> cuentas;
    private  int cantidad;
    

    public Cliente() {
        
    }

    
    

    public Cliente(String rut, String nombre, String apellido) {
        cuentas=new ArrayList<>();
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    
    public void agregarCuenta(Cuenta cuenta){
    cuentas.add(cuenta);
    
    cantidad++;
    }

    public void mostrarCuenta(){
    for(int i = 0; i < cuentas.size(); i++) {
            System.out.println("El cliente "+getNombre()+" posee la cuenta numero: "+cuentas.get(i).getNumero());
    }
    
    }
    public void cantidad(){
        System.out.println("El señor/a: "+getNombre()+" actualmente tiene "+cantidad+" cuentas");
    }
    public void saldo(){
    
        for(int i=0;i<cuentas.size();i++){
            System.out.println("El saldo de la cuenta es:"+ cuentas.get(i).getSaldo());
        }
        
    }
    
    
}
