public class ColaCiruclarImp<T> extends ListaEnlazada<T> implements ColaCircular<T> {
    
    private Nodo<T> Cabeza;
    private Nodo<T> Cola;


    public  ColaCiruclarImp(){
        this.Cabeza = null;
        this.Cola = null;
    }


    @Override
    public boolean estaLlena() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'estaLlena'");
    }


    @Override
    public boolean estaVacia() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'estaVacia'");
    }


    @Override
    public void encolar(T item) {
        Nodo<T> Nuevo = new Nodo<T>(item);

        if(Cabeza == null){
            Nuevo = Cabeza;
            Nuevo = Cola;
        }

        Cola.setSiguiente(Nuevo);
        Cola = Nuevo;
        Cola.setSiguiente(Cabeza);
    }


    @Override
    public Nodo<T> desencolar() {
        if(Cabeza == null){
            return null;
        }

        Nodo<T> aux = Cabeza;
        Cabeza = null;
        Cabeza = aux.getSiguiente();

        return aux;

    }

    
}
