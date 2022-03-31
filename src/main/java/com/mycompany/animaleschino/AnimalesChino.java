/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.animaleschino;

/**
 *
 * @author chino
 */
public class AnimalesChino {
    
     public static void main(String[] args) {

        Perro perro = new Perro("Teddy","Croquetas",05,10,1993,"Chihuahua");     
        Gato gato = new Gato("Pelusa","Especial",25,8,2001,"Siames");
        Caballo caballo = new Caballo("Jhonny","Pasto",01,2,1890,"Fino");        
                                
        perro.mostrar();
        perro.morir();
        perro.ladrar();
        System.out.println("--------------------------------------------------");
        gato.mostrar();
        gato.morir();        
        gato.maulla();
        System.out.println("--------------------------------------------------");
        caballo.mostrar();
        caballo.morir();        
        caballo.relincha();
        System.out.println("--------------------------------------------------");
        

    }
}
