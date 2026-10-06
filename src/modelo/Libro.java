package modelo;

import java.util.ArrayList;

/** Representa un libro y sus ejemplares. */
public class Libro {
    private String titulo;
    private String autor;
    private ArrayList<Ejemplar> ejemplares;

    /**
     * Crea un libro.
     *
     * @param titulo título del libro
     * @param autor nombre del autor
     */
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = new ArrayList<>();
    }

    /**
     * Devuelve el título del libro.
     *
     * @return título del libro
     */
    public String getTitulo() {
        return this.titulo;
    }

    /**
     * Devuelve el autor del libro.
     *
     * @return nombre del autor
     */
    public String getAutor() {
        return this.autor;
    }

    /**
     * Agrega un ejemplar de este libro.
     *
     * @param ejemplar ejemplar que se agregará
     */
    public void agregarEjemplar(Ejemplar ejemplar) {
        ejemplares.add(ejemplar);
    }

    /**
     * Devuelve los ejemplares del libro.
     *
     * @return lista de ejemplares
     */
    public ArrayList<Ejemplar> getEjemplares() {
        return ejemplares;
    }
}
