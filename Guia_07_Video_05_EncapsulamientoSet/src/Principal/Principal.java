package Principal;

import Entidades.Mascota;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        // Crear un objeto Mascota
        Mascota mascota1 = new Mascota("Fernando Chiquito", leer.next(), "Perro");

        System.out.println("Mascota: "+ mascota1.toString());
        
        mascota1.setNombre("Pepe Chiquito");
        
        System.out.println("Mascota: "+ mascota1.toString());
    }
}
