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
package Servicios;

import Entidades.Persona;
import static java.lang.Math.pow;

public class PersonaServicio {
    
    Persona p = new Persona();
    
    Double IMC;
    
    /*
    - Metodo crearPersona(): el metodo crear persona, le pide los valores de los atributos
      al usuario y despues se le asignan a sus respectivos atributos para llenar el objeto
      Persona. Ademas, comprueba que el sexo introducido sea correcto, es decir, H, M o
      O. Si no es correcto se debera mostrar un mensaje
    */
    public void crearPersona(String nombre, Integer edad, String sexo, Double peso, Double altura){
        
        p.setNombre(nombre);
        p.setEdad(edad);
        
        sexo = sexo.toUpperCase();
        
        if (sexo.equals("H") || sexo.equals("M") || sexo.equals("O")){
            
            p.setSexo(sexo);
            
        } else{
            
            System.out.println("ERROR. La letra del Sexo no coincide con la que tiene que ingresar.");
            p.setSexo("a");
        }
        
        p.setPeso(peso);
        p.setAltura(altura);
    }
    
    /*
    - Metodo calcularIMC(): calculara si la persona esta en su peso ideal (peso en
      kg/(altura^2 en mt2)). Si esta formula da por resultado un valor menor que 20,
      significa que la persona esta por debajo de su peso ideal y la funcion devuelve un -1.
      Si la formula da por resultado un numero entre 20 y 25 (incluidos), significa que la
      persona esta en su peso ideal y la funcion devuelve un 0. Finalmente, si el resultado
      de la formula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
      funcion devuelve un 1.
    */
    public int calcularIMC(){
        
        // pow(double a, double b)
        IMC = p.getPeso() / (pow(p.getAltura(), 2));
        
        if (IMC < 20){
            
            return -1;
            
        }else if (IMC >= 20 && IMC <= 25){
            
            return 0;
            
        }else{
            
            return 1;
        }
    }
    
    public void informacionResultadoIMC(Integer resultadoIMC){
        
        if (resultadoIMC == -1){
            
            System.out.print(p.getNombre() +", usted al ser ");
            
            resultadoSexo(p.getSexo());
            
            System.out.print("y tener un Peso de "+ p.getPeso() +" y una altura de "+ p.getAltura() +" su IMC es de "+ IMC +", por lo cual, usted esta debajo de su peso ideal");
            
        }else{
            
            if(resultadoIMC == 0){
            
                System.out.print(p.getNombre() +", usted al ser ");

                resultadoSexo(p.getSexo());

                System.out.print("y tener un Peso de "+ p.getPeso() +" y una altura de "+ p.getAltura() +" su IMC es de "+ IMC +", por lo cual, usted esta en su peso ideal");
            
            }else{
            
                System.out.print(p.getNombre() +", usted al ser ");
            
                resultadoSexo(p.getSexo());
            
                System.out.print("y tener un Peso de "+ p.getPeso() +" y una altura de "+ p.getAltura() +" su IMC es de "+ IMC +", por lo cual, usted tiene sobrepeso");
            }
        }
    }
    
    public void resultadoSexo(String sexo){
        
        if(p.getSexo().equals("H")){
                
            System.out.print("Hombre ");
            
        }else if(p.getSexo().equals("M")){
                
            System.out.print("Mujer ");
                
        }else if(p.getSexo().equals("O")){
                
            System.out.print("Otro ");
            
        }else{
            
            System.out.print("Error de carga de SEXO ");
        }
    }
    
    /*
    - Metodo esMayorDeEdad(): indica si la persona es mayor de edad. La funcion
      devuelve un booleano.
    */
    public Boolean esMayorDeEdad(){

        if (p.getEdad() >= 18){
            
            return true;
            
        }else{
            
            return false;
        }
    }
    
    public void informarResultadoMayor(Boolean esMayor){
        
        if(esMayor){
            
            System.out.println(" y es mayor de edad ya que tiene "+ p.getEdad() +" años.");
            
        }else{
            
            System.out.println(" y es menor de edad ya que tiene "+ p.getEdad() +" años.");
        }
    }
}
 