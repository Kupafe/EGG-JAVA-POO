/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = PI * radio al cuadrado).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 * PI * radio).
 */
package Servicios;

import Entidades.Circunferencia;
import java.util.Scanner;

public class CircunferenciaServicio {
   
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde

    Circunferencia circu = new Circunferencia();
    
    double PI = 3.1416;
    /*
     c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
    objeto.
    */
    public void ingresarRadio(){
        
        System.out.print("Ingrese el Radio de la Circunferencia en metros: ");
        circu.setRadio(leer.nextDouble());
    }
    
    // d) Método area(): para calcular el área de la circunferencia (Area = PI * radio al cuadrado).
    public double area(){
        
        return PI * (circu.getRadio() * circu.getRadio());
    }
    
    // e) Método perimetro(): para calcular el perímetro (Perimetro = 2 * PI * radio).
    public double perimetro(){
        
        return 2 * PI * circu.getRadio();
    }
    
    public void mostrarArea(double resultadoArea){
        
        System.out.println("El Area de la Circunferencia con un Radio de "+ circu.getRadio() +" es de "+ resultadoArea +" metros.");
    }
    
    public void mostrarPerimetro(double resultadoPerimetro){
        
        System.out.println("El Perimetro de la Circunferencia con un Radio de "+ circu.getRadio() +" es de "+ resultadoPerimetro +" metros.");
    }
}