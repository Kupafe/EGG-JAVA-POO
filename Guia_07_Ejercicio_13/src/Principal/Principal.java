/*
Un profesor particular est� dando cursos para grupos de cinco alumnos y necesita un
programa para organizar la informaci�n de cada curso. Para ello, crearemos una clase
entidad llamada Curso, cuyos atributos ser�n: nombreCurso, cantidadHorasPorDia,
cantidadDiasPorSemana, turno (ma�ana o tarde), precioPorHora y alumnos. Donde
alumnos es un arreglo de tipo String de dimensi�n 5 (cinco), donde se alojar�n los
nombres de cada alumno. A continuaci�n, se implementar�n los siguientes m�todos:
    
    - Un constructor por defecto.
    - Un constructor con todos los atributos como par�metro.
    - M�todos getters y setters de cada atributo.
    - m�todo cargarAlumnos(): este m�todo le permitir� al usuario ingresar los alumnos
      que asisten a las clases. Nosotros nos encargaremos de almacenar esta informaci�n
      en un arreglo e iterar con un bucle, solicitando en cada repetici�n que se ingrese el
      nombre de cada alumno.
    - M�todo crearCurso(): el m�todo crear curso, le pide los valores de los atributos al
      usuario y despu�s se le asignan a sus respectivos atributos para llenar el objeto
      Curso. En este m�todo invocaremos al m�todo cargarAlumnos() para asignarle valor
      al atributo alumnos
    - M�todo calcularGananciaSemanal(): este m�todo se encarga de calcular la ganancia
      en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
      d�a, el precio por hora, la cantidad de alumnos y la cantidad de d�as a la semana que
      se repite el encuentro.
 */
package Principal;

import Servicios.CursoServicio;

public class Principal {

    public static void main(String[] args) {

        CursoServicio cs = new CursoServicio();
        
        System.out.println("\nCOMIENZO DE LA EJECUCION DEL PROGRAMA.");
        
        cs.crearCurso();
        
        System.out.println("FIN DE LA EJECUCION DEL PROGRAMA.\n");
    }
}