/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuaci�n, se deben crear los siguientes m�todos:
a) M�todo constructor que inicialice el radio pasado como par�metro.
b) M�todos get y set para el atributo radio de la clase Circunferencia.
c) M�todo para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) M�todo area(): para calcular el �rea de la circunferencia (Area = PI * radio al cuadrado).
e) M�todo perimetro(): para calcular el per�metro (Perimetro = 2 * PI * radio).
 */
package Servicios;

import Entidades.Circunferencia;
import java.util.Scanner;

public class CircunferenciaServicio {
   
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las � y los tilde

    Circunferencia circu = new Circunferencia();
    
    double PI = 3.1416;
    /*
     c) M�todo para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
    objeto.
    */
    public void ingresarRadio(){
        
        System.out.print("Ingrese el Radio de la Circunferencia en metros: ");
        circu.setRadio(leer.nextDouble());
    }
    
    // d) M�todo area(): para calcular el �rea de la circunferencia (Area = PI * radio al cuadrado).
    public double area(){
        
        return PI * (circu.getRadio() * circu.getRadio());
    }
    
    // e) M�todo perimetro(): para calcular el per�metro (Perimetro = 2 * PI * radio).
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