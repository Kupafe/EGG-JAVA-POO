package Principal;

import Entidades.Mascota;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        // Crear un objeto Mascota
        Mascota mascota1 = new Mascota("Fernando Chiquito", "Chiquito", "Perro");
        Mascota mascota2 = new Mascota();
        System.out.println("Mascota: "+ mascota1.toString());
        
        mascota1.setNombre("Pepe Chiquito");
        
        System.out.println("Mascota - Nombre: "+ mascota1.getNombre());
        
        System.out.println("Mascota: "+ mascota1); // Me muestra el espacio en memoria donde esta asignada esta variable
        System.out.println("-----------------------");
        System.out.println("Mascota: "+ mascota2); // Me muestra el espacio en memoria donde esta asignada esta variable
        System.out.println("-----------------------");
        System.out.println(mascota1.toString());
        System.out.println("-----------------------");
        System.out.println(mascota2.toString());
    }
}
