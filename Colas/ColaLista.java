public class ColaLista<T> extends ListaEnlazada<T> implements Cola<T>  {

    public ColaLista(){
        super();
    }

    public void encolar(T item){
        super.InsertarInicio(item);
    }

    public void desencolar(){
        super.eliminarPrimero();
    }

    public boolean esVacia(){
        return super.esVacia();
    }

    public void vaciar(){
        while(!esVacia()){
            desencolar();
        }
    }
}
