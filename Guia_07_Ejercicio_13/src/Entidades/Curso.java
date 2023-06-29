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
package Entidades;

// Crear una clase entidad llamada Curso
public class Curso {
    
    /*
    Cuyos atributos ser�n: nombreCurso, cantidadHorasPorDia,
    cantidadDiasPorSemana, turno (ma�ana o tarde), precioPorHora y alumnos.
    Donde alumnos es un arreglo de tipo String de dimensi�n 5 (cinco), donde
    se alojar�n los nombres de cada alumno.
    */
    private String nombreCurso;
    private Integer cantidadHorasPorDia;
    private Integer cantidadDiasPorSemana;
    private String turno; // ma�ana o tarde
    private Double precioPorHora;
    private String[] alumnos = new String[5];

    // - Un constructor por defecto.
    public Curso() {
    }

    // - Un constructor con todos los atributos como par�metro.
    public Curso(String nombreCurso, Integer cantidadHorasPorDia, Integer cantidadDiasPorSemana, String turno, Double precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }

    // - M�todos getters y setters de cada atributo.
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