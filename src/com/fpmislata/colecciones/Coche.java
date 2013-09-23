/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.colecciones;

/**
 *
 * @author alumno
 */
public class Coche {

    private String modelo;
    private int cilindrada;
    private String dniPropietario;
    private Marca marca;
    
    
    
    public Coche(Marca marca, String modelo, int cilindrada, String dniPropietario) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.dniPropietario = dniPropietario;
    }
    
    public Coche() {
        
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getDniPropietario() {
        return dniPropietario;
    }

    public void setDniPropietario(String dniPropietario) {
        this.dniPropietario = dniPropietario;
    }
    
    public String getCocheCompleto() {
        String cocheCompleto;
        cocheCompleto = marca + " "  + modelo ;
        return cocheCompleto;
    }
    
    
}
