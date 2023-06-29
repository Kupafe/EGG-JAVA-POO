/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, T�tulo, Autor,
N�mero de p�ginas, y un constructor con todos los atributos pasados por par�metro y un
constructor vac�o. Crear un m�todo para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro m�todo el n�mero de ISBN, el t�tulo, el autor del libro y el
numero de p�ginas.
 */
package Entidades;

public class Libro {
    
    public long isbn;
    public String titulo;
    public String Autor;
    public int numeroPaginas;

    public Libro() {
    }

    public Libro(long isbn, String titulo, String Autor, int numeroPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.Autor = Autor;
        this.numeroPaginas = numeroPaginas;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", Autor=" + Autor + ", numeroPaginas=" + numeroPaginas + '}';
    }
}
