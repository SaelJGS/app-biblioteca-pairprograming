package modelo;

import java.util.ArrayList;

/** Representa una biblioteca con sus usuarios registrados. */
public class Biblioteca {
    private String nombre;
    private ArrayList<Usuario> usuarios;

    /**
     * Crea una biblioteca.
     *
     * @param nombre nombre de la biblioteca
     */
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.usuarios = new ArrayList<>();
    }

    /**
     * Agrega un usuario a la biblioteca.
     *
     * @param usuario usuario que se registrará
     */
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario agregado: " + usuario.getNombre());
        System.out.println("ID del usuario: " + usuario.getNumeroIdentificacion());
    }

    /**
     * Devuelve el nombre de la biblioteca.
     *
     * @return nombre de la biblioteca
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve los usuarios registrados.
     *
     * @return lista de usuarios
     */
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
}
