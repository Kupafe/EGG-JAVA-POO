package Servicios;

import Entidades.Mascota;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MascotaServicio {
    
    // Variables
    private Scanner leer;
    
    private List<String> mascotas;

    // Constructor
    public MascotaServicio() {
        
        this.leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde
        this.mascotas = new ArrayList();
    }
    
    // Metodos
    public void crearMascota(){
        
        System.out.print("Ingrese nombre: ");
        String nombre = leer.next();
        
        System.out.print("Ingrese apodo: ");
        String apodo = leer.next();
        
        System.out.print("Ingrese tipo: ");
        String tipo = leer.next();
        
        String mascota = nombre +" "+ apodo +" "+ tipo;
        
        mascotas.add(mascota);
    }
    
    public void mostrarMascotas(){
        
        System.out.println("\n Las mascotas actuales de la Lista Mascotas son:\n");
        
        for (String aux : mascotas) {
            
            System.out.println("\t"+ aux);
        }
        
        System.out.println("\nLa cantidad de mascotas son: "+ mascotas.size() +".\n");
    }
}
