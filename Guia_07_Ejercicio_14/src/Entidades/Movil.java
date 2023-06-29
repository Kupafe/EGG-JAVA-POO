/*
Una tienda que vende tel�fonos m�viles quiere tener registro de cada producto que
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
almacenar cada producto con su informaci�n. Crear una entidad Movil con los atributos
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo c�digo ser�
un arreglo num�rico de dimensi�n 7 (siete) donde cada sub�ndice alojar� un n�mero
correspondiente al c�digo. A continuaci�n, se implementar�n los siguientes m�todos:
    - Un constructor por defecto.
    - Un constructor con todos los atributos como par�metro.
    - M�todos getters y setters de cada atributo.
    - M�todo cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
      instanciar un objeto Celular y poder cargarlo en nuestro programa.
    - M�todo ingresarCodigo(): este m�todo permitir� ingresar el c�digo completo de siete
      n�meros de un celular. Para ello, puede utilizarse un bucle repetitivo
 */
package Entidades;

// Crear una entidad Movil
public class Movil {
    
    /*
    Agregar los atributos: marca, precio, modelo, memoriaRam, almacenamiento y
    codigo. El atributo c�digo ser� un arreglo num�rico de dimensi�n 7 (siete)
    donde cada sub�ndice alojar� un n�mero correspondiente al c�digo.
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

    // - Un constructor con todos los atributos como par�metro.
    public Movil(String marca, Double precio, String modelo, Integer memoriaRam, Integer almacenamiento, String[] codigo) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
    }

    // - M�todos getters y setters de cada atributo.
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
