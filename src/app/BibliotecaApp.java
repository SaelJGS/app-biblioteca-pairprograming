package app;

import java.time.LocalDate;
import modelo.Biblioteca;
import modelo.Ejemplar;
import modelo.EstadoEjemplar;
import modelo.Libro;
import modelo.Usuario;
import servicio.Prestamo;

/** Muestra un ejemplo de registro, préstamo y devolución. */
public class BibliotecaApp {
    /**
     * Ejecuta el ejemplo de la biblioteca.
     *
     * @param args argumentos de la línea de comandos; no se utilizan
     */
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("USBI Coatzacoalcos");
        Usuario usuario = new Usuario("Sael", "1234567");
        Libro libro = new Libro("El principito", "Cobaxin Miss");
        Ejemplar ejemplar = new Ejemplar("E001", EstadoEjemplar.DISPONIBLE);

        biblioteca.agregarUsuario(usuario);
        libro.agregarEjemplar(ejemplar);

        System.out.println("Biblioteca: " + biblioteca.getNombre());
        System.out.println("Usuarios registrados: " + biblioteca.getUsuarios().size());
        System.out.println("Libro: " + libro.getTitulo() + " de " + libro.getAutor());
        System.out.println("Ejemplares del libro: " + libro.getEjemplares().size());

        Prestamo prestamo = new Prestamo(LocalDate.now(), LocalDate.now().plusDays(7));
        System.out.println(prestamo.realizarPrestamo(usuario, ejemplar));
        System.out.println("Estado del ejemplar: " + ejemplar.getEstado());
        System.out.println("¿Está vencido? " + prestamo.estaVencido());

        prestamo.devolver();
        System.out.println("Estado del ejemplar: " + ejemplar.getEstado());
    }
}
