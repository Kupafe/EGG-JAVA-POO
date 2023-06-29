/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deber� contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la
cantidad jugadas m�ximas que puede realizar el usuario. Definir los siguientes m�todos
con los par�metros que sean necesarios:
    - Constructores, tanto el vac�o como el parametrizado.
    - Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas m�xima.
      Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
      vector. Despu�s ingresa la palabra en el vector, letra por letra, quedando cada letra
      de la palabra en un �ndice del vector. Y tambi�n, guarda en cantidad de jugadas
      m�ximas, el valor que ingres� el usuario y encontradas en 0.
    - M�todo longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
      buscar como se usa el vector.length.
    - M�todo buscar(letra): este m�todo recibe una letra dada por el usuario y busca sila
      letra ingresada es parte de la palabra o no. Tambi�n informar� si la letra estaba o no.
    - M�todo encontradas(letra): que reciba una letra ingresada por el usuario y muestre
      cuantas letras han sido encontradas y cuantas le faltan. Este m�todo adem�s deber�
      devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
      busque una letra que no est�, se le restar� uno a sus oportunidades.
    - M�todo intentos(): para mostrar cuantas oportunidades le queda al jugador.
    - M�todo juego(): el m�todo juego se encargar� de llamar todos los m�todos
      previamente mencionados e informar� cuando el usuario descubra toda la palabra o
      se quede sin intentos. Este m�todo se llamar� en el main.

Un ejemplo de salida puede ser as�:

    Ingrese una letra:
    a
    Longitud de la palabra: 6
    Mensaje: La letra pertenece a la palabra
    N�mero de letras (encontradas, faltantes): (3,4)
    N�mero de oportunidades restantes: 4
    ----------------------------------------------
    Ingrese una letra:
    z
    Longitud de la palabra: 6
    Mensaje: La letra no pertenece a la palabra
    N�mero de letras (encontradas, faltantes): (3,4)
    N�mero de oportunidades restantes: 3
    ---------------------------------------------
    Ingrese una letra:
    b
    Longitud de la palabra: 6
    Mensaje: La letra no pertenece a la palabra
    N�mero de letras (encontradas, faltantes): (4,3)
    N�mero de oportunidades restantes: 2
    ----------------------------------------------
    Ingrese una letra:
    u
    Longitud de la palabra: 6
    Mensaje: La letra no pertenece a la palabra
    N�mero de letras (encontradas, faltantes): (4,3)
    N�mero de oportunidades restantes: 1
    ----------------------------------------------
    Ingrese una letra:
    Longitud de la palabra: 6
    Mensaje: La letra no pertenece a la palabra
    Mensaje: Lo sentimos, no hay m�s oportunidades
 */
package Principal;

import Servicios.AhorcadoServicio;

public class Principal {

    public static void main(String[] args) {
        
        AhorcadoServicio as = new AhorcadoServicio();
        
        System.out.println("\nCOMIENZO DE LA EJECUCION DEL PROGRAMA.\n");
        
        System.out.println("Bienvenido al Juego del Ahorcado.\n");
        
        as.comienzo();
        
       // System.out.println("----------------------------------------------");

        System.out.println("\n\nFIN DE LA EJECUCION DEL PROGRAMA.\n");
    }
    
}
