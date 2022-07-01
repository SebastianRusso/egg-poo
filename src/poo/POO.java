/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import LIBRO.LIBROSej1;
import java.util.Scanner;

/**
 *
 * @author serus
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        LIBROSej1 tomo1 = new LIBROSej1();
        tomo1.Alta();
        System.out.println(tomo1.toString());
        
        System.out.println("------------------");
        System.out.println("Ingrese el siguiente libro");
        
        LIBROSej1 tomo2 = new LIBROSej1();
        tomo2.Alta();
        System.out.println(tomo2.toString());
    }
    
}
