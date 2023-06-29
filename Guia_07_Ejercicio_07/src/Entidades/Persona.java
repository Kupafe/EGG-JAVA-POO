/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea anadir algun otro
atributo, puede hacerlo. Los metodos que se implementaran son:
    - Un constructor por defecto.
    - Un constructor con todos los atributos como parametro.
    - Metodos getters y setters de cada atributo.
    - Metodo crearPersona(): el metodo crear persona, le pide los valores de los atributos
      al usuario y despues se le asignan a sus respectivos atributos para llenar el objeto
      Persona. Ademas, comprueba que el sexo introducido sea correcto, es decir, H, M o
      O. Si no es correcto se debera mostrar un mensaje
    - Metodo calcularIMC(): calculara si la persona esta en su peso ideal (peso en
      kg/(altura^2 en mt2)). Si esta formula da por resultado un valor menor que 20,
      significa que la persona esta por debajo de su peso ideal y la funcion devuelve un -1.
      Si la formula da por resultado un numero entre 20 y 25 (incluidos), significa que la
      persona esta en su peso ideal y la funcion devuelve un 0. Finalmente, si el resultado
      de la formula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
      funcion devuelve un 1.
    - Metodo esMayorDeEdad(): indica si la persona es mayor de edad. La funcion
      devuelve un booleano.
A continuacion, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuacion, llamaremos todos
los metodos para cada objeto, debera comprobar si la persona esta en su peso ideal,
tiene sobrepeso o esta por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por ultimo, guardaremos los resultados de los metodos calcularIMC y esMayorDeEdad en
distintas variables, para despues en el main, calcular un porcentaje de esas 4 personas
 */
package Entidades;

// Realizar una clase llamada Persona
public class Persona {
   
    /* 
    Que tenga los siguientes atributos: nombre, edad,
    sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura.
    */
    private String nombre;
    private Integer edad;
    private String sexo; // ('H' hombre, 'M' mujer, 'O' otro)
    private Double peso;
    private Double altura;
    
    
    // Los metodos que se implementaran son:
    
    // Un constructor por defecto.
    public Persona() {
    }
    
    // Un constructor con todos los atributos como parametro.
    public Persona(String nombre, Integer edad, String sexo, Double peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    
    // Metodos getters y setters de cada atributo.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
