package proyecto.calculadora;

/**
 * Clase que tiene todas las funciones para la pila
 * @author nuria,Nico,Paola y Mario
 */
public class PilaA <T> implements PilaADT<T>{
    private T[] pila;
    private int tope;
    private final int MAX=100;
    
    /**
     * Constructor de la PilA
     * (donde se incializa la pila)
     */
    public PilaA(){
        pila=(T[]) new Object[MAX];
        tope=-1;
    }
    /**
     * Sirve oara cambiar la capacidad máxima de la pila para lamacenar datos
     * (se ajusta a la necesidad de cada problema)
     * @param max recibe la nueva capacidad máxima de la pila
     *
     */
    public PilaA(int max){
        pila=(T[]) new Object [max];
        tope=-1;
    }
    /**
     * Añade un dato a la pila
     * @param dato recibe el dato nuevo que será ingresado a la pila
     */
    @Override
    public void push(T dato) {
        if(tope+1==pila.length){
            expande();
        }
        tope++;
        pila[tope]=dato;
    }
    /**
     * Expande el largo de la pila para poder ingresar un dato nuevo a la pila
     */
    private void expande(){
        T[] masGrande=(T[]) new Object[pila.length*2];
        for(int i=0; i<=tope; i++){ //también lo puedes poner i<pila.length
            masGrande[i]=pila[i];
        }
        pila=masGrande;
    }
    /**
     * 
     * @return 
     */
    @Override
    public T pop() {
        T eliminado;
        if(this.isEmpty())
            throw new ExceptionColeccionVacia("La pila está vacía");
        eliminado=pila[tope];
        pila[tope]=null;
        tope--;
        return eliminado;
    }

    @Override
    public boolean isEmpty() {
        return tope==-1;
    }

    @Override
    public T peek() {
        if(this.isEmpty())
            throw new ExceptionColeccionVacia("La pila está vacía");
        return pila[tope];
    }
    
    public String toString(){
        StringBuilder sb=new StringBuilder("\nPila del 0 al tope- \n");
        for(int i=0; i<=tope; i++){
            sb.append(pila[i]).append(" ");
        }
        return sb.toString();
    }
    
    
    
    
}
