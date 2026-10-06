# Biblioteca

Proyecto en Java que representa una biblioteca con usuarios, libros, ejemplares y préstamos. La clase principal es `app.BibliotecaApp`. 

## Autores

**Nombres:** 
Sael de Jesus Garduza Santos
Bryan de Jesus Cobaxin Miss

## Preguntas

### 1. ¿Para qué sirve `package`?

Sirve para indicar a qué paquete pertenece una clase y organizar el código. También ayuda a distinguir clases que podrían tener el mismo nombre. Por ejemplo, `package modelo;` indica que `Usuario` pertenece al paquete `modelo`.

### 2. ¿Para qué sirve `import`?

Permite usar una clase de otro paquete escribiendo solo el nombre de la clase, sin repetir su ruta completa. Por ejemplo, en `Prestamo.java`, `import modelo.Usuario;` permite escribir `Usuario` en lugar de `modelo.Usuario`. `import` no copia ni instala la clase.

### 3. ¿Qué relación existe entre paquete y directorio?

Normalmente, cada paquete corresponde a una carpeta dentro de `src`. En este proyecto, las clases que declaran `package modelo;` están en `src/modelo`, y `package servicio;` corresponde a `src/servicio`. Si un paquete se llamara `biblioteca.modelo`, su ruta sería `src/biblioteca/modelo`.

### 4. ¿Qué es Javadoc?

Javadoc es una forma de documentar clases y métodos en Java mediante comentarios que empiezan con `/**` y terminan con `*/`. La herramienta `javadoc` puede leer esos comentarios y generar páginas de documentación. Se pueden usar etiquetas como `@param` para explicar un parámetro y `@return` para explicar el valor devuelto.

```java
/**
 * Agrega un usuario a la biblioteca.
 * @param usuario usuario que se registrará
 */
public void agregarUsuario(Usuario usuario) {
    usuarios.add(usuario);
}
```

### 5. ¿Qué diferencia hay entre `//` y `/** ... */`?

`//` inicia un comentario de una sola línea y sirve para dejar una aclaración breve en el código. `/** ... */` es un comentario de documentación: puede ocupar varias líneas, se coloca antes de una clase o método y Javadoc lo utiliza para generar documentación. Ambos son comentarios y no se ejecutan.
