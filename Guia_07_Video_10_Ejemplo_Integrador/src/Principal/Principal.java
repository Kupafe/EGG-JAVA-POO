// Calcular el sueldo y antiguedad de un vendedor

package Principal;

import Entidades.Vendedor;
import Servicio.VendedorServicio;

public class Principal {

    public static void main(String[] args) {

        VendedorServicio vs = new VendedorServicio();
        
        Vendedor v1 = vs.altaVendedor();
        
        vs.sueldoMensual(v1);
        vs.vacaciones(v1);
    }
}
