package proyecto.calculadora;
/**
 * Interfaz que contiene las funciones que va a tener la pila
 * @author Nuria,Paola,Nicolás y Mario
 */
public interface PilaADT <T>{
   
    /**
     * Fuerza a la clase implemntada a tener una función en la que agregue un dato a la pila
     * @param dato es el dato que será agregado a la pila
     */
    public void push(T dato);
    
    
    /**
     * Fuerza a la clase implemntada a tener una función en la que saque un dato de la pila
     */
    public T pop();
    
    /**
     *Fuerza a la clase implementada a tener una función en la que indique si la pila está vacia o no
     */
    public boolean isEmpty();
    
    /**
     * Fuerza a la clase implemntada a tener una función que permita ver cual es el dato de esta arriba de la pila
     */
    public T peek();
    
}
