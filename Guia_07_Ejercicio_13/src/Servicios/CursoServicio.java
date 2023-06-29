/*
Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
programa para organizar la información de cada curso. Para ello, crearemos una clase
entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
    
    - Un constructor por defecto.
    - Un constructor con todos los atributos como parámetro.
    - Métodos getters y setters de cada atributo.
    - método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
      que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
      en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
      nombre de cada alumno.
    - Método crearCurso(): el método crear curso, le pide los valores de los atributos al
      usuario y después se le asignan a sus respectivos atributos para llenar el objeto
      Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
      al atributo alumnos
    - Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
      en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
      día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
      se repite el encuentro.
 */
package Servicios;

import Entidades.Curso;
import java.util.Scanner;

public class CursoServicio {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); // "ISO-8859-1" --> Permite el ingreso de entrada las ñ y los tilde

    /*
    - método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
      que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
      en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
      nombre de cada alumno.
    */
    public void cargarAlumnos(Curso c){

        String[] alum = new String[5];
        
        for (int i = 0; i < alum.length; i++) {

            System.out.print("Ingrese nombre del alumno "+ (i + 1) +": ");
            alum[i] = leer.next();
        }

        c.setAlumnos(alum);

        System.out.println("\n-----------------------------------------\n");
    }
    
    /*
    - Método crearCurso(): el método crear curso, le pide los valores de los atributos al
      usuario y después se le asignan a sus respectivos atributos para llenar el objeto
      Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
      al atributo alumnos
    */
    public void crearCurso(){
        
        Curso c = new Curso();
        
        String nomCurso, elegirTurno;
        Integer horasDias, diasSemana;
        Double precioHora;
        
        System.out.println("\n-----------------------------------------\n");
            
        // Nombre de Curso
        System.out.print("Ingrese el nombre del Curso: ");
        // nomCurso = leer.next();
        c.setNombreCurso(leer.next());
            
        // Cantidad de horas por dia
        do{

            System.out.print("Ingrese la Cantidad de Horas por Dia de la Cursada.\n"
                    + "Se puede cursar de 1 a 12 Horas por dia.\n"
                    + "Ingrese cantidad de Horas: ");
            horasDias = leer.nextInt();

        }while(horasDias <= 1 && horasDias >= 12);

        c.setCantidadHorasPorDia(horasDias);
        
        // Cantidad de Dias por Semana
        do{

            System.out.print("Ingrese la Cantidad de Dias por Semana que se Cursa.\n"
                    + "Se puede cursar de 1 a 6 dias por Semana\n"
                    + "Ingrese cantidad de Dias: ");
            diasSemana = leer.nextInt();

        }while(diasSemana <= 1 && diasSemana >= 6);
        
        c.setCantidadDiasPorSemana(diasSemana);
        
        // Turno de la cursada
        do{

            System.out.print("Ingrese el Turno de la Cursada.\n"
                    + "\tM (Mañana) / T (Tarde).\n"
                    + "Elija opcion: ");
            elegirTurno = leer.next().toUpperCase();

        }while(!((elegirTurno.equals("M")) || (elegirTurno.equals("T")) || (elegirTurno.equals("Mañana")) || (elegirTurno.equals("Tarde"))));

        if(elegirTurno.equalsIgnoreCase("M")){

            elegirTurno = "Mañana";

        }else{

            elegirTurno = "Tarde";
        }

        c.setTurno(elegirTurno);
        
        // Precio por hora
        do{

            System.out.print("Ingrese el Precio en Pesos por Hora de Cursada - Usar la coma (,) en vez del punto (.) para separar los decimales): ");
            precioHora = leer.nextDouble();

        }while(precioHora < 0);
        
        c.setPrecioPorHora(precioHora);
        
        cargarAlumnos(c);
        
        calcularGananciaSemanal(c);
            
    }
    
    /*
    - Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
      en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
      día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
      se repite el encuentro.
    */
    public void calcularGananciaSemanal(Curso c){
        
        Double gananciaSemanal;
        
        gananciaSemanal = c.getCantidadHorasPorDia() * c.getPrecioPorHora() * c.getAlumnos().length * c.getCantidadDiasPorSemana();
            
        System.out.println("La Ganacia semanal del Curso de "+ c.getNombreCurso() +" es de $"+ gananciaSemanal +" Pesos.");
    }
}
