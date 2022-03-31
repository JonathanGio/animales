/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animaleschino;

/**
 *
 * @author chino
 */
public class Gato extends Animal {

    String raza;

    public Gato(String nombre, String tipo_alimentacion, int Day, int Month, int Year, String raza) {
        super(nombre, tipo_alimentacion, Day, Month, Year);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void mostrar(){
        System.out.println(getNombre() + "-"+getTipo_alimentacion()+", Mi fecha de nacimiento es :"+getDayBirth()+"/"+getMonthBirth()+"/"+getYearBirth()+"-"+getRaza());
    }
    
    public void maulla() {
        System.out.println("MIAU");
    }
}