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
package Entidades;

// Crear una clase entidad llamada Curso
public class Curso {
    
    /*
    Cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
    cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos.
    Donde alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde
    se alojarán los nombres de cada alumno.
    */
    private String nombreCurso;
    private Integer cantidadHorasPorDia;
    private Integer cantidadDiasPorSemana;
    private String turno; // mañana o tarde
    private Double precioPorHora;
    private String[] alumnos = new String[5];

    // - Un constructor por defecto.
    public Curso() {
    }

    // - Un constructor con todos los atributos como parámetro.
    public Curso(String nombreCurso, Integer cantidadHorasPorDia, Integer cantidadDiasPorSemana, String turno, Double precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }

    // - Métodos getters y setters de cada atributo.
    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public Integer getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(Integer cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public Integer getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(Integer cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(Double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
}