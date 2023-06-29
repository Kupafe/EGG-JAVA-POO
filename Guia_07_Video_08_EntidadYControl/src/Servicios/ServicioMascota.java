package Servicios;

import Entidades.Mascota;
import java.util.Scanner;

public class ServicioMascota {
    
    private Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde
    
    public Mascota crearMascota(){
        
        System.out.print("Ingrese nombre: ");
        String nombre = leer.next();
        
        System.out.print("Ingrese apodo: ");
        String apodo = leer.next();
        
        System.out.print("Ingrese tipo: ");
        String tipo = leer.next();
        
        /*
        Mascota m = new Mascota(nombre, apodo, tipo);
        
        return m;
        */
        
        return new Mascota(nombre, apodo, tipo);
    }
    
}
