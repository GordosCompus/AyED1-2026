public class PilaLista<T> extends ListaEnlazada<T> implements Pila<T> {
 
    public PilaLista() {
        super();
    }
 
    @Override
    public void apilar(T item) {
        InsertarInicio(item);
    }
 
    @Override
    public void desapilar() {
        if (esVacia()) {
            throw new IllegalStateException("No se puede desapilar: la pila está vacía.");
        }
        eliminarPrimero();
    }
 
    @Override
    public T Tope() {
        if (esVacia()) {
            throw new IllegalStateException("No se puede obtener el tope: la pila está vacía.");
        }
        return obtenerPrimero();
    }
 
 
    @Override
    public void vaciar() {
        while (!esVacia()) {
            desapilar();
        }
    }
}
