/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animaleschino;

/**
 *
 * @author chino
 */
public class Animal {
    
    private String nombre,tipo_alimentacion;
    private int dN, mN, yN;    

    public Animal(String nombre,String tipo_alimentacion,int dN, int mN, int yN){
        this.nombre = nombre;
        this.tipo_alimentacion = tipo_alimentacion;
        this.dN = dN;       
        this.mN = mN;
        this.yN = yN;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_alimentacion() {
        return tipo_alimentacion;
    }

    public void setTipo_alimentacion(String tipo_alimentacion) {
        this.tipo_alimentacion = tipo_alimentacion;
    }
    
    public void morir() {
        System.out.println("Muero.... Ay");
    }
    public int getDayBirth() {
        return dN;
    }

    public void setDayBirth(int dN) {
        this.dN = dN;
    }  
    
     public int getMonthBirth() {
        return mN;
    }

    public void setMonthBirth(int mN) {
        this.mN = mN;
    }  
     public int getYearBirth() {
        return yN;
    }

    public void setYearBirth(int yN) {
        this.yN = yN;
    }  
}
