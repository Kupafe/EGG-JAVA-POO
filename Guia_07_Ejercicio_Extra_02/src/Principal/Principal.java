/*
Definir una clase llamada Puntos que contendr� las coordenadas de dos puntos, sus
atributos ser�n, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un m�todo crearPuntos() que le pide al usuario los dos n�meros y los ingresa en
los atributos del objeto. Despu�s, a trav�s de otro m�todo calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
 */
package Principal;

import Servicios.PuntosServicio;

public class Principal {

    public static void main(String[] args) {
        
        PuntosServicio ps = new PuntosServicio();
        
        System.out.println("\n--- BIENVENIDOS. ---\n"
                + "\nEste es un programa para calcular ladistancia entre Dos puntos en el plano cartesiano.\n");

        ps.crearPuntos();
    }
    
}
