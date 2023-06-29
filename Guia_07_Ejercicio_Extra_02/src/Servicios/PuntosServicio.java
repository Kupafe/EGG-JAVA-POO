/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
 */
package Servicios;

import Entidades.Puntos;
import java.util.Scanner;

public class PuntosServicio {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde
    
    Puntos p = new Puntos();
    
    /*
    Generar un objeto puntos usando un método crearPuntos() que le pide al
    usuario los dos números y los ingresa en los atributos del objeto.
    */
    public void crearPuntos(){
        
        System.out.print("Ingrese el Punto X1: ");
        p.setX1(leer.nextDouble());
        
        System.out.print("Ingrese el Punto X2: ");
        p.setX2(leer.nextDouble());
        
        System.out.print("Ingrese el Punto Y1: ");
        p.setY1(leer.nextDouble());
        
        System.out.print("Ingrese el Punto Y2: ");
        p.setY2(leer.nextDouble());
        
        System.out.println("\nPunto 1 = P1("+ p.getX1() +", "+ p.getY1() +").\n"
                         + "Punto 2 = P2("+ p.getX2() +", "+ p.getY2() +").");
        
        calcularMostrarDistancia();
    }
    
    /*
    a través de otro método calcular y devolver la distancia que existe entre
    los dos puntos que existen en la clase Puntos
    */
    public void calcularMostrarDistancia(){
        
        //Formula --> d(P1, P2) = ?((x2 - x1)² + (y2 - y1)²)
        
        Double x, y, distancia;
        
        x = p.getX2() - p.getX1();
        y = p.getY2() - p.getY1();
        
        /* 
        sqrt(double a) --> Devuelve la raíz cuadrada positiva correctamente
                           redondeada de un double
        pow(double a, double b) --> Devuelve el valor del primer argumento
                                    elevado a la potencia del segundo argumento
        */
        
        distancia = Math.sqrt(Math.pow(x, x) + Math.pow(y, y));
        
        System.out.println("La distancia que hay entre los puntos P1 y P2 "
                + "es de "+ distancia +" metros.");
    }
}
