/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, T�tulo, Autor,
N�mero de p�ginas, y un constructor con todos los atributos pasados por par�metro y un
constructor vac�o. Crear un m�todo para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro m�todo el n�mero de ISBN, el t�tulo, el autor del libro y el
numero de p�ginas.
 */
package Principal;

import Entidades.Libro;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las � y los tilde
                
        Libro libro1 = new Libro();
        
        long isbn;
        String titulo, autor;
        int numeroPaginas;
        
        System.out.println("\nBIENVENIDO AL SISTEMA DE BIBLIOTECA.\n");
        System.out.print("Ingrese el Numero de ISBN: ");
        libro1.isbn = leer.nextLong();
        
        System.out.print("Ingrese el Titulo: ");
        libro1.titulo = leer.next();
        
        System.out.print("Ingrese el Autor: ");
        libro1.Autor = leer.next();
        
        System.out.print("Ingrese la cantidad de Paginas: ");
        libro1.numeroPaginas = leer.nextInt();
       
        System.out.println("Libro: "+ libro1.toString());
    }
}

