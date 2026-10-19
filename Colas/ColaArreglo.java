public class ColaArreglo<T> extends ListaArreglo<T> implements Cola<T>{

    public ColaArreglo(int Capacidad){
        super(Capacidad);
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

    public boolean estaLlena(){
        return super.estaLlena();
    }

    public void vaciar(){
        while(!esVacia()){
            desencolar();
        }
    }

    public void imprimir(){
        super.imprimir();
    }
}