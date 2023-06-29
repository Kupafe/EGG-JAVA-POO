/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deber�?
definir adem�s dos constructores: uno vac�o que inicializa el titulo y el autor a cadenas
vac�as y otro que reciba como par�metros el titulo y el autor de la canci�n. Se deber�n
adem�s definir los m�todos getters y setters correspondientes.
 */
package Entidades;

// Desarrollar una clase Cancion.
public class Cancion {
    
    // Atributos: titulo y autor.
    private String titulo;
    private String autor;
    
    /*
    Crear dos constructores: uno vac�o que inicializa el titulo y el autor a
    cadenas vac�as y otro que reciba como par�metros el titulo y el autor de la
    canci�n.
    */

    public Cancion() {
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    // Se deber�n adem�s definir los m�todos getters y setters correspondientes.
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
