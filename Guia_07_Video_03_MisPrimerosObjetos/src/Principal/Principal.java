package Principal;

import Entidades.Mascota;

public class Principal {

    public static void main(String[] args) {

        // Scanner leer = new Scanner(System.in);
        // Crear un objeto Mascota
        Mascota mascota1 = new Mascota();
        
        mascota1.apodo = "Chiquito";
        mascota1.nombre = "Fernando Chiquito";
        //mascota.nombre = leer.next;
        mascota1.tipo = "Perro";
        mascota1.edad = 14;
        mascota1.raza = "Beagle";
        mascota1.cola = true;
        mascota1.color = "Tricolor";
        
        System.out.println(mascota1.apodo +" "+ mascota1.edad +" "+mascota1.tipo);
    }
}
