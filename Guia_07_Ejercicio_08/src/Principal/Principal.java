/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
    a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
       frase ingresada.
    b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
       ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
       contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
    d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
       compone la clase con otra nueva frase ingresada por el usuario.
    f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
       con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    g) Método reemplazar(String letra), deberá reemplazar todas las letras ?a? que se
       encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
       la frase resultante.
    h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
       ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Principal;

import Entidades.Cadena;
import Servicios.CadenaServicio;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        /*
        En el main se creará el objeto y se le pedirá al usuario que ingrese
        una frase que puede ser una palabra o varias palabras separadas por un espacio en
        blanco y a través de los métodos set, se guardará la frase y la longitud de manera
        automática según la longitud de la frase ingresada
        */
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde

        Cadena cad = new Cadena();
        
        CadenaServicio cs = new CadenaServicio();
        
        String letra, frase, opcion;
        Boolean contieneLetra;
        
        do{
            
            System.out.print("\nIngrese una palabra o Frase: ");
            cad.setFrase(leer.next());
            cad.setLargoFrase(cad.getFrase().length());

            cs.mostrarVocales(cad);
            
            System.out.println("\n-------------------------------------------------------------------------------\n");
            
            cs.invertirFrase(cad);
            
            System.out.println("\n-------------------------------------------------------------------------------\n");
            
            /*
            c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
            contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
            d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
            */
            System.out.print("Ingrese letra a buscar: ");
            letra = leer.next();
        
            cs.vecesRepetido(cad, letra);
            
            System.out.println("\n-------------------------------------------------------------------------------\n");
            
            /*
            e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
            compone la clase con otra nueva frase ingresada por el usuario.
            */
            System.out.print("Ingrese una nueva Palabra o Frase para comparar la longuitud con la Palabra o Frase anterior: ");
            frase = leer.next();
            
            cs.compararLongitud(cad, frase);
            
            System.out.println("\n-------------------------------------------------------------------------------\n");
            
            /*
            f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
            con una nueva frase ingresada por el usuario y mostrar la frase resultante.
            */
            cs.unirFrases(cad, frase);
            
            System.out.println("\n-------------------------------------------------------------------------------\n");
            
            /*
            g) Método reemplazar(String letra), deberá reemplazar todas las letras ?a? que se
            encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
            la frase resultante.
            */
            cs.reemplazar(cad, letra);
            
            System.out.println("\n-------------------------------------------------------------------------------\n");
            
            /*
            h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
            ingresa el usuario y devuelve verdadero si la contiene y falso si no.
            */
            contieneLetra = cs.contiene(cad, letra);
            
            if (contieneLetra) {
                
                System.out.println("La Frase o Palabra SI contiene la Letra indicada por el Usuario.");
                
            }else{
                
                System.out.println("La Frase o Palabra NO contiene la Letra indicada por el Usuario.");
            }

            System.out.println("\n-------------------------------------------------------------------------------\n");
            
            System.out.print ("Desea ingresr una nueva frase.\n"
                    + "\tS (SI) / N (NO).\n"
                    + "Ingrese opcion: ");
            opcion = leer.next();
        
        }while(!opcion.equalsIgnoreCase("n"));
        
        System.out.println("FINALIZO LA EJECUCION DEL PROGRAMA.");
    }
    
}

//La Casa Rosada y Blanca
