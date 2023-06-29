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
package Entidades;

// realizar una clase llamada Raices
public class Raices {
    
    private Double a, b, c;

    public Raices() {
    }

    public Raices(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }
}
