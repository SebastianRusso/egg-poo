/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LIBRO;

import java.util.Scanner;

/**
 *
 * @author vluce
 * 1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, 
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un 
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y 
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
numero de páginas.
 */


public class LIBROSej1 {

public String ISBN;  
public String Titulo; 
public String Autor; 
public int    CntPag; 

    public LIBROSej1(String ISBN, String Titulo, String Autor, int CntPag) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.CntPag = CntPag;
    }

    public LIBROSej1() {
    }
    
    public void Alta(){
        Scanner   leer  = new Scanner(System.in);
        System.out.println("Ingrese el ISBM del libro: ");
        this.ISBN = leer.next();
        System.out.println("Ingrese el Titulo del  libro: ");
        this.Titulo = leer.next();
        System.out.println("Ingrese el Autor del  libro: ");
        this.Autor = leer.next();
          System.out.println("Ingrese la cantidad de paginas del  libro: ");
        this.CntPag = leer.nextInt();
    }

    @Override
    public String toString() {
        return "LA INFORMACION DEL LIBRO ES  {" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", Cantidad de Paginas=" + CntPag + '}';
    }

     }
