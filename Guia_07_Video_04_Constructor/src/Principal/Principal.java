package Principal;

import java.util.Scanner;
import Entidades.Mascota;

public class Principal {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        // Crear un objeto Mascota
        Mascota mascota1 = new Mascota("Fernando Chiquito", leer.next(), "Perro");
        
        mascota1.nombre = "Pepe Chiquito";

        System.out.println(mascota1.apodo +" "+ mascota1.edad +" "+mascota1.tipo +" "+ mascota1.color);
    }
}
