
package com.mycompany.biblioteca.modelo;

public class Libro {
    String isbn, titulo, autor;

    public Libro(String isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return  isbn + "," + titulo + "," + autor ;
    }
    
}
