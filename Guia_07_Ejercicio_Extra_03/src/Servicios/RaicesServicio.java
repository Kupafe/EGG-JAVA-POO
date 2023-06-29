/*
Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuaci�n de 2o grado. Tendremos los 3 coeficientes como atributos, llam�mosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a trav�s de un m�todo
constructor. Luego, las operaciones que se podr�n realizar son las siguientes:
    - M�todo getDiscriminante(): devuelve el valor del discriminante (double). El
      discriminante tiene la siguiente formula: (b^2)-4*a*c
    - M�todo tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
      que esto ocurra, el discriminante debe ser mayor o igual que 0.
    - M�todo tieneRaiz(): devuelve un booleano indicando si tiene una �nica soluci�n, para
      que esto ocurra, el discriminante debe ser igual que 0.
    - M�todo obtenerRaices(): llama a tieneRa�ces() y si devolvi�? true, imprime las 2
      posibles soluciones.
    - M�todo obtenerRaiz(): llama a tieneRaiz() y si devolvi�? true imprime una �nica ra�z.
      Es en el caso en que se tenga una �nica soluci�n posible.
    - M�todo calcular(): est� m�todo llamar� tieneRaices() y a tieneRa�z(), y mostrar� por
      pantalla las posibles soluciones que tiene nuestra ecuaci�n con los m�todos
      obtenerRaices() o obtenerRaiz(), seg�n lo que devuelvan nuestros m�todos y en caso
      de no existir soluci�n, se mostrar� un mensaje.

      Nota: Formula ecuaci�n 2o grado: (-b�?((b^2)-(4*a*c)))/(2*a) Solo varia el signo
      delante de -b
 */
package Servicios;

import Entidades.Raices;
import java.util.Scanner;

public class RaicesServicio {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las � y los tilde
        
    Raices r = new Raices();
    
    Double resultado;
    
    Boolean tieneDosRaices, tieneUnaRaiz;
    
    // Cargar los coeficientes a, b y c.
    public void cargarCoeficientes(){
        
        System.out.print("Debe ingresar tres numeros.\n"
                + "\n\tIngrese numero A: ");
        r.setA(leer.nextDouble());
        
        System.out.print("\tIngrese numero B: ");
        r.setB(leer.nextDouble());
        
        System.out.print("\tIngrese numero C: ");
        r.setC(leer.nextDouble());
        
        System.out.println("");
        
        resultado = getDiscriminante();
        
        System.out.println("Resultado: "+ resultado);
        
        tieneDosRaices = tieneRaices();
        System.out.println("Tiene Dos Raices: "+ tieneDosRaices);
        
        tieneUnaRaiz = tieneRaiz();
        System.out.println("Tiene Una Raices: "+ tieneUnaRaiz);
        
        if(tieneDosRaices == true){
            
            obtenerRaices();
        }
    }
    
    /*
    - M�todo getDiscriminante(): devuelve el valor del discriminante (double). El
    discriminante tiene la siguiente formula: (b^2)-4*a*c
    */
    public Double getDiscriminante(){
        
        /*
        pow(double a, double b)     Devuelve el valor del primer argumento elevado a la potencia del
                                    segundo argumento.
        */
        return Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC();
    }

    /*
    - M�todo tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
      que esto ocurra, el discriminante debe ser mayor o igual que 0.
    */
    public boolean tieneRaices(){
        
        if(resultado >= 0){
            
            return true;
            
        }else{
            
            return false;
        }
    }
    
    /*
    - M�todo tieneRaiz(): devuelve un booleano indicando si tiene una �nica soluci�n, para
      que esto ocurra, el discriminante debe ser igual que 0.
    */
    public boolean tieneRaiz(){
        
        if(resultado == 0){
            
            return true;
            
        }else{
            
            return false;
        }
    }
    
    /*
    - M�todo obtenerRaices(): llama a tieneRa�ces() y si devolvi�? true, imprime las 2
      posibles soluciones.
    */
    public void obtenerRaices(){
        
        /*
        sqrt(double a)              Devuelve la ra�z cuadrada positiva correctamente redondeada de un
                                    double.
        */
        
        System.out.println("Solucion 1: "+ ( -(r.getB()) + Math.sqrt(resultado)) / (2 * r.getA()) +".\n");
        System.out.println("Solucion 2: "+ ( -(r.getB()) - Math.sqrt(resultado)) / (2 * r.getA()) +".\n");
    }
    
    /*
    - M�todo obtenerRaiz(): llama a tieneRaiz() y si devolvi�? true imprime una �nica ra�z.
      Es en el caso en que se tenga una �nica soluci�n posible.
    */
    public void obtenerRaiz(){
        
        System.out.println("Solucion: "+ ( -(r.getB()) / (2 * r.getA())) +".\n");
    }
    
    /*
    - M�todo calcular(): est� m�todo llamar� tieneRaices() y a tieneRa�z(), y mostrar� por
      pantalla las posibles soluciones que tiene nuestra ecuaci�n con los m�todos
      obtenerRaices() o obtenerRaiz(), seg�n lo que devuelvan nuestros m�todos y en caso
      de no existir soluci�n, se mostrar� un mensaje.
    */
}
