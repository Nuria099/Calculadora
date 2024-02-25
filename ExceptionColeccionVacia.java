package proyecto.calculadora;

/**
 * Mensajes de error por si algo no funciona
 * @author nuria
 */
public class ExceptionColeccionVacia extends RuntimeException{

    /**
     * Función que manda el mensaje si hay error
     * @param message 
     */
    public ExceptionColeccionVacia(String message) {
        super(message);
    }
    
    
}
