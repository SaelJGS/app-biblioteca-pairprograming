package modelo;

/** Representa a un usuario de la biblioteca. */
public class Usuario {
    private String nombre;
    private String numeroIdentificacion;

    /**
     * Crea un usuario con su nombre e identificación.
     *
     * @param nombre nombre del usuario
     * @param numeroIdentificacion número de identificación del usuario
     */
    public Usuario(String nombre, String numeroIdentificacion) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
    }

    /**
     * Devuelve el nombre del usuario.
     *
     * @return nombre del usuario
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Devuelve el número de identificación.
     *
     * @return número de identificación del usuario
     */
    public String getNumeroIdentificacion() {
        return this.numeroIdentificacion;
    }
}
