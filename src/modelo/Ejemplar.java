package modelo;

/** Representa un ejemplar de un libro y su estado. */
public class Ejemplar {
    private String codigo;
    private EstadoEjemplar estado;

    /**
     * Crea un ejemplar.
     *
     * @param codigo código que identifica al ejemplar
     * @param estado estado inicial del ejemplar
     */
    public Ejemplar(String codigo, EstadoEjemplar estado) {
        this.codigo = codigo;
        this.estado = estado;
    }

    /**
     * Devuelve el código del ejemplar.
     *
     * @return código del ejemplar
     */
    public String getCodigo() {
        return this.codigo;
    }

    /**
     * Devuelve el estado del ejemplar.
     *
     * @return estado actual del ejemplar
     */
    public EstadoEjemplar getEstado() {
        return this.estado;
    }

    /**
     * Cambia el estado del ejemplar.
     *
     * @param estado nuevo estado del ejemplar
     */
    public void setEstado(EstadoEjemplar estado) {
        this.estado = estado;
    }
}
