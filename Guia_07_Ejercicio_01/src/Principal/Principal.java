/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package Principal;

import Entidades.Libro;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde
                
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

