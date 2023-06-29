package Principal;

import Servicios.MascotaServicio;

public class Principal {

    public static void main(String[] args) {
        
        MascotaServicio ms = new MascotaServicio();
        
        ms.crearMascota();
        ms.crearMascota();
        
        ms.mostrarMascotas();
    }
}
