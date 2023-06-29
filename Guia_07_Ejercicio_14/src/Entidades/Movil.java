/*
Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
almacenar cada producto con su información. Crear una entidad Movil con los atributos
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
correspondiente al código. A continuación, se implementarán los siguientes métodos:
    - Un constructor por defecto.
    - Un constructor con todos los atributos como parámetro.
    - Métodos getters y setters de cada atributo.
    - Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
      instanciar un objeto Celular y poder cargarlo en nuestro programa.
    - Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
      números de un celular. Para ello, puede utilizarse un bucle repetitivo
 */
package Entidades;

// Crear una entidad Movil
public class Movil {
    
    /*
    Agregar los atributos: marca, precio, modelo, memoriaRam, almacenamiento y
    codigo. El atributo código será un arreglo numérico de dimensión 7 (siete)
    donde cada subíndice alojará un número correspondiente al código.
    */
    private String marca;
    private Double precio;
    private String modelo;
    private Integer memoriaRam;
    private Integer almacenamiento;
    private String[] codigo = new String[6];

    // - Un constructor por defecto.
    public Movil() {
    }

    // - Un constructor con todos los atributos como parámetro.
    public Movil(String marca, Double precio, String modelo, Integer memoriaRam, Integer almacenamiento, String[] codigo) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
    }

    // - Métodos getters y setters de cada atributo.
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(Integer memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public Integer getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(Integer almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String[] getCodigo() {
        return codigo;
    }

    public void setCodigo(String[] codigo) {
        this.codigo = codigo;
    }
}
