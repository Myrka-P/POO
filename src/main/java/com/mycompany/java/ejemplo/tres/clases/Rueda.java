/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.ejemplo.tres.clases;

/**
 *
 * @author Myrka
 */
public class Rueda {
    private String marca;
    private String diametro;

    public Rueda() {
    }

    public Rueda(String marca, String diametro) {
        this.marca = marca;
        this.diametro = diametro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDiametro() {
        return diametro;
    }

    public void setDiametro(String diametro) {
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "marca=" + marca + ", diametro=" + diametro ;
    }
    
    
    
    
}
