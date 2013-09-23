/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author alumno
 */
public class Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List <Coche> coches = new ArrayList <Coche>();
        
        //Parte List
        
        coches.add(0, new Coche(Marca.FORD, "Ka", 300, "18273645-O"));
        coches.add(1, new Coche(Marca.RENAULT, "Clio", 225, "12345678-T"));
        coches.add(2, new Coche(Marca.SEAT, "Leon", 120, "13576385-W"));
        coches.add(3, new Coche(Marca.FORD, "Fiesta", 222, "18462184-J"));
        coches.add(4, new Coche(Marca.CITROEN, "C2", 180, "66291103-V"));
        
        
        System.out.println(coches.get(1).getCocheCompleto());
        System.out.println("");
        
        for(Coche listaCoches :coches){
            System.out.println(listaCoches.getCocheCompleto());
        }
        
        System.out.println("Introduce un DNI :");
        Scanner sc = new Scanner (System.in);
        String dniCom = sc.nextLine();
        
        System.out.println("");
        
        for (Coche listaCoches :coches) {
            if (listaCoches.getDniPropietario().equals(dniCom)) {
                System.out.println(listaCoches.getCocheCompleto());
            }
        }
        
        
        
        //Parte Map
        
        Map <String, Coche> mapCoches = new HashMap <String, Coche>();
        
        mapCoches.put("12345678-T", new Coche(Marca.CITROEN, "C2", 3000, "12345678-T"));
        mapCoches.put("77110039-Y", new Coche(Marca.RENAULT, "Megane", 2400, "77110039-Y"));
        mapCoches.put("48164950-E", new Coche(Marca.FORD, "C2", 3200, "48164950-E"));
        mapCoches.put("12345678-Z", new Coche(Marca.RENAULT, "F3", 2500, "12345678-Z"));
        mapCoches.put("56882421-Q", new Coche(Marca.FORD, "Sport Ka", 3500, "56882421-Q"));
        
        String dniMap = "12345678-Z";
        
        Set <String> propDni = mapCoches.keySet();
        
        
        
        
    }
}
