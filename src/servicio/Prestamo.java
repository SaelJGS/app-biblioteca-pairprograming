package servicio;

import modelo.Ejemplar;
import modelo.EstadoEjemplar;
import modelo.Usuario;

import java.time.LocalDate;

/** Representa el préstamo de un ejemplar a un usuario. */
public class Prestamo {
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private Usuario usuario;
    private Ejemplar ejemplar;

    /**
     * Crea un préstamo con su fecha de inicio y su fecha límite.
     *
     * @param fechaPrestamo fecha en que se realiza el préstamo
     * @param fechaDevolucion fecha límite para devolver el ejemplar
     */
    public Prestamo(LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    /**
     * Presta un ejemplar disponible a un usuario.
     *
     * @param usuario usuario que recibe el ejemplar
     * @param ejemplar ejemplar que se quiere prestar
     * @return mensaje que indica si el préstamo se realizó
     */
    public String realizarPrestamo(Usuario usuario, Ejemplar ejemplar) {
        if (this.ejemplar != null) {
            return "Este préstamo ya fue registrado";
        }
        if (ejemplar.getEstado() != EstadoEjemplar.DISPONIBLE) {
            return "El ejemplar no está disponible o se encuentra dañado";
        }

        this.usuario = usuario;
        this.ejemplar = ejemplar;
        ejemplar.setEstado(EstadoEjemplar.PRESTADO);

        System.out.println("Datos del préstamo");
        System.out.println("Nombre del usuario: " + this.usuario.getNombre());
        System.out.println("Código del ejemplar: " + this.ejemplar.getCodigo());
        System.out.println("Fecha del préstamo: " + fechaPrestamo);
        System.out.println("Fecha límite de devolución: " + fechaDevolucion);
        return "Préstamo realizado";
    }

    /** Devuelve el ejemplar prestado y lo marca como disponible. */
    public void devolver() {
        if (ejemplar == null || ejemplar.getEstado() != EstadoEjemplar.PRESTADO) {
            System.out.println("No hay un ejemplar prestado para devolver");
            return;
        }
        ejemplar.setEstado(EstadoEjemplar.DISPONIBLE);
        System.out.println("El ejemplar se ha devuelto");
    }

    /**
     * Comprueba si un préstamo activo superó la fecha límite.
     *
     * @return true si está vencido; false en caso contrario
     */
    public boolean estaVencido() {
        if (ejemplar == null || ejemplar.getEstado() != EstadoEjemplar.PRESTADO) {
            return false;
        }
        return LocalDate.now().isAfter(fechaDevolucion);
    }
}
