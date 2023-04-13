/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.ejemplo.tres.clases;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Myrka
 */
public class Auto {
    private String placa;
    private String modelo;
    private String marca;
    
    // atributo de la relacion de composicion
    private List < Rueda> ruedas;
        

    public Auto() {
        this.ruedas = new ArrayList<>();
    }

    public Auto(String placa, String modelo, String marca) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.ruedas = new ArrayList<>();
        
        
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public List <Rueda> getRuedas(){
        return ruedas;
        
    }
    public void agregarRueda(String  marca, String diametro){
        Rueda rueda = new Rueda(marca , diametro);
        ruedas.add(rueda);
        
        //ruedas.(new Rueda (marca ,diametro));
        
    }
    

    @Override
    public String toString() {
        return  "placa=" + placa + ", modelo=" + modelo + ", marca=" + marca;
    }
    
    
    
}
