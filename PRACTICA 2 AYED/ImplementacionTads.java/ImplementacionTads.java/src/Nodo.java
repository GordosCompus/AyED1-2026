public class Nodo<T> {
    T dato;
    Nodo<T> siguiente;

    public Nodo(T dato){
        this.dato = dato;
        this.siguiente = null;
    }
    public void setSiguiente(Nodo<T> elem){
        this.siguiente = elem;
    }

    public Nodo<T> getSiguiente(){
        return siguiente;
    }

    public T getDato(){
        return dato;
    }

    public void setDato(T dato){
        this.dato = dato;
    }


}
