package Principal;

import Entidades.Mascota;
import Servicios.ServicioMascota;

public class Principal {

    public static void main(String[] args) {

        ServicioMascota sm = new ServicioMascota();
        
        // Crear un objeto Mascota
        Mascota mascota1 = sm.crearMascota();
                
        System.out.println(mascota1.toString());
        
        mascota1 = null; // Elimina el espacio en memoria que utilizaba Mascota1
    }
}
