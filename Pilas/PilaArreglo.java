 public class PilaArreglo<T> extends ListaArreglo<T> implements Pila<T>{
    
    
    public PilaArreglo(int capacidad){
        super(capacidad);
    }

    //se apila al final de la pila un elemento de tipo T
    @Override 
    public void apilar(T item){
        super.InsertarFin(item);
    }

    //se saca el ultimo elemento de la pila
    @Override 
    public void desapilar(){
        super.eliminarUltimo();
    }

    //retorna el tope de la pila
    @Override 
    public T Tope(){
        return super.obtenerUltimo();
    }

    //retorna si la pila esta vacia
    @Override 
    public boolean esVacia(){
        return super.esVacia();
    }

    //vacia la pila si no esta vacia
    @Override 
    public void vaciar(){
         while (!esVacia()) {
            desapilar();
        }
    }
}
