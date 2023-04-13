/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java.ejemplo.tres;

import com.mycompany.java.ejemplo.tres.clases.Auto;
import com.mycompany.java.ejemplo.tres.clases.Rueda;

/**
 *
 * @author Myrka
 */
public class Principal {

    public static void main(String[] args) {
        Auto auto = new Auto("asd- 124","camaro", "chevrolet");
        
        Rueda rueda = new Rueda("200", "Toyota");
        
        auto.agregarRueda("michelin","17");
        auto.agregarRueda("michelin", "17");
        auto.agregarRueda("michelin", "17");
        auto.agregarRueda("michelin", "17");
        
        System.out.println("datos"+ auto.toString());
        System.out.println("info de rueda"+ auto.getRuedas());
    }
}
