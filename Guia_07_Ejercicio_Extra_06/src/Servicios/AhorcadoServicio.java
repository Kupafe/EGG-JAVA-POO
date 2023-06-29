/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la
cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes métodos
con los parámetros que sean necesarios:
    - Constructores, tanto el vacío como el parametrizado.
    - Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
      Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
      vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
      de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
      máximas, el valor que ingresó el usuario y encontradas en 0.
    - Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
      buscar como se usa el vector.length.
    - Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
      letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
    - Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
      cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
      devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
      busque una letra que no esté, se le restará uno a sus oportunidades.
    - Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
    - Método juego(): el método juego se encargará de llamar todos los métodos
      previamente mencionados e informará cuando el usuario descubra toda la palabra o
      se quede sin intentos. Este método se llamará en el main.

Un ejemplo de salida puede ser así:

    Ingrese una letra:
    a
    Longitud de la palabra: 6
    Mensaje: La letra pertenece a la palabra
    Número de letras (encontradas, faltantes): (3,4)
    Número de oportunidades restantes: 4
    ----------------------------------------------
    Ingrese una letra:
    z
    Longitud de la palabra: 6
    Mensaje: La letra no pertenece a la palabra
    Número de letras (encontradas, faltantes): (3,4)
    Número de oportunidades restantes: 3
    ---------------------------------------------
    Ingrese una letra:
    b
    Longitud de la palabra: 6
    Mensaje: La letra no pertenece a la palabra
    Número de letras (encontradas, faltantes): (4,3)
    Número de oportunidades restantes: 2
    ----------------------------------------------
    Ingrese una letra:
    u
    Longitud de la palabra: 6
    Mensaje: La letra no pertenece a la palabra
    Número de letras (encontradas, faltantes): (4,3)
    Número de oportunidades restantes: 1
    ----------------------------------------------
    Ingrese una letra:
    Longitud de la palabra: 6
    Mensaje: La letra no pertenece a la palabra
    Mensaje: Lo sentimos, no hay más oportunidades
 */
package Servicios;

import Entidades.Ahorcado;
import java.util.Scanner;

public class AhorcadoServicio {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde
        
    Ahorcado a = new Ahorcado();
            
    String vectorPalabraSecreta[], vectorMostrarPalabraSecreta[], vectorLetrasSecretas[];
    Integer contadorLetras = 0, cantidadRepetidas = 0, contadorEspacioBlanco = 0;
    Boolean seEncuentra;
    
    public void comienzo(){
        
        String letra;
        Integer largoLetra, largoPalabra, encontradas;
        
        largoPalabra = crearJuego();
        
        limpiarPantalla();
        
        mostrarVector(vectorMostrarPalabraSecreta);
        longitud();
        System.out.println("Tiene "+ a.getJugadasMaximas() +" oportunidades para descubrir la palabra sectreta.\n");

        do{
            do{
            
                System.out.print("Ingrese UNA letra para ver si se encuentra dentro de la Palabra Secreta: ");
                letra = leer.next();
                largoLetra = letra.length();
                
            }while(largoLetra != 1);
            
            cantidadRepetidas = buscar(letra);
            
            mostrarVector(vectorMostrarPalabraSecreta);
            
            longitud();
            
            if (cantidadRepetidas == 0) {
                
                a.setJugadasMaximas(a.getJugadasMaximas() - 1);
                System.out.println("La letra "+ letra.toUpperCase() +" NO pertenece a la palabra.\n");
            
            }else{
                
                a.setLetrasEncontradas(a.getLetrasEncontradas() + cantidadRepetidas);
                System.out.println("La letra "+ letra.toUpperCase() +" SI pertenece a la palabra\n");
            }
            
            System.out.println("Numero de Letras Encontadas / Faltantes: ("+ a.getLetrasEncontradas() +" / "+ (contadorLetras - a.getLetrasEncontradas()) +").\n");
            
            System.out.println("El numero de oportunidades restantes es de "+ a.getJugadasMaximas() +" veces.");
            
            encontradas = a.getLetrasEncontradas();

        }while(a.getJugadasMaximas() > 0 && encontradas != largoPalabra);
    }
    
    /*
    - Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
      Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
      vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
      de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
      máximas, el valor que ingresó el usuario y encontradas en 0.
    */
    public Integer crearJuego(){

        String palabraSecreta, letra;
        Integer jugadasMaximas, largo;
        
        System.out.print("Ingrese la Palabra Secreta: ");
        palabraSecreta = leer.next();

        largo = palabraSecreta.length();
        
        vectorPalabraSecreta = new String[largo];
        vectorMostrarPalabraSecreta = new String[largo];
        vectorLetrasSecretas = new String[largo];
        
        for (int i = 0; i < vectorPalabraSecreta.length; i++) {
             
            letra = palabraSecreta.substring(i, i + 1);
            
            if (letra.equals(" ")) {
                
                vectorPalabraSecreta[i] = letra;
                vectorMostrarPalabraSecreta[i] = " ";
                contadorEspacioBlanco++;
            
            }else{
                
                vectorPalabraSecreta[i] = letra;
                vectorMostrarPalabraSecreta[i] = "_";
                contadorLetras++;
            }
        }

        a.setPalabraABuscar(vectorPalabraSecreta);
        
        do{
            System.out.print("Ingrese la cantidad de Jugadas que tiene el"
                    + " Participante para descubrir la Palabra Secreta.\n"
                    + "El numero de Jugadas no puede ser Menor a 1.\n"
                    + "Ingrese la cantidad de jugadas: ");
            jugadasMaximas = leer.nextInt();
        
        }while(jugadasMaximas < 1);
                
        a.setJugadasMaximas(jugadasMaximas);
            
        a.setLetrasEncontradas(0);
        
        return contadorLetras;
    }
        
    public void mostrarVector(String[] vector){

        System.out.println("");
        for (int i = 0; i < vector.length; i++) {

            System.out.print(vector[i] +" ");
        }
    }
        
    /*
    - Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
      buscar como se usa el vector.length.
    */
    public void longitud(){
        
        System.out.println("\n\nLa Longitud de la Palabra Secreta es de "+ contadorLetras +" letras.\n");
    }

    /*
    - Método buscar(letra): este método recibe una letra dada por el usuario y busca si la
      letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
    */
    public Integer buscar(String letra){
        
        Integer cantidadLetrasRepetidas = 0;

        vectorLetrasSecretas = a.getPalabraABuscar();
        
        for (int i = 0; i < a.getPalabraABuscar().length; i++) {
            
            if(vectorLetrasSecretas[i].equalsIgnoreCase(letra)){
                
                cantidadLetrasRepetidas++;

                vectorMostrarPalabraSecreta[i] = letra;
            }
        }
        
        return cantidadLetrasRepetidas;
    }
    
    public void limpiarPantalla(){
        
        for (int i = 0; i < 30; i++) {
            
            System.out.println("");
            
        }
    }
}