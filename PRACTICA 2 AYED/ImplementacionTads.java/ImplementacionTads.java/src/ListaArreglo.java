public class ListaArreglo<T> implements Lista<T> {
    private T[] arreglo;
    private int cantidadOcupada;

    @SuppressWarnings("unchecked")
    public ListaArreglo(int capacidadInicial){
        this.arreglo = (T[]) new Object[capacidadInicial];
        this.cantidadOcupada = 0;

    }

    @Override
    public void insertarFin(T item){
        if (cantidadOcupada == arreglo.length) {
        throw new IllegalStateException("El arreglo está lleno.");
    }
        arreglo[cantidadOcupada]= item;
        cantidadOcupada++;
    }

     @Override
    public void insertarInicio(T elem){
          if (cantidadOcupada == arreglo.length) {
        throw new IllegalStateException("El arreglo está lleno.");
    }
    if(esVacia()==true){
        arreglo[cantidadOcupada] = elem;
        cantidadOcupada++;
    } else{
        for(int i=cantidadOcupada - 1; i>=0; i--){
            arreglo[i + 1] = arreglo[i];
        }
        arreglo[0] = elem;
        cantidadOcupada++;
    }

    }

    @Override
    public  void insertarPos(T elem, int pos){
         if (cantidadOcupada == arreglo.length) {
            throw new IllegalStateException("El arreglo está lleno.");
        }
        if (pos<0 || pos>=cantidadOcupada) {
            throw new IllegalStateException("El indice debe ser >=0 y menor a Cantidad Ocupada");

        }
        
        if(arreglo[pos]==null){
        arreglo[pos] = elem;
        cantidadOcupada++;
        } else{
             for(int i=cantidadOcupada - 1; i>=pos; i--){
            arreglo[i + 1] = arreglo[i];
        }
        arreglo[pos] = elem;
        cantidadOcupada++;
    }

    }

    @Override
    public T eliminarUltimo(){
        arreglo[cantidadOcupada-1]=null;
        cantidadOcupada--;
        return arreglo[cantidadOcupada-1];
    }

    @Override
    public T eliminarPrimero(){ 
        arreglo[0]=null;
        cantidadOcupada--;
        return arreglo[0];
    }

    @Override
    public T eliminarPos(int pos){
         if (pos<0 || pos>=cantidadOcupada) {
            throw new IllegalStateException("El indice debe ser >=0 y menor a Cantidad Ocupada");

        }
        arreglo[pos] = null;
        cantidadOcupada--;
        return arreglo[pos];
    }

    @Override
    public T obtenerPrimero(){
        return arreglo[0];
    }

    @Override
    public T obtenerUltimo(){
        return arreglo[cantidadOcupada-1];

    }

     @Override
    public T obtenerElemPos(int pos){
         if (pos<0 || pos>=cantidadOcupada) {
            throw new IllegalStateException("El indice debe ser >=0 y menor a Cantidad Ocupada");

        }
        return arreglo[pos];
    }

     @Override
    public int buscar(T item){
        for(int i=0; i<cantidadOcupada; i++){
            if(arreglo[i]==item){
                return i;
            }
        }
        return -1;
    }


    @Override
    public int longitud(){
        return arreglo.length;
    }

    @Override
    public boolean esVacia(){
        return cantidadOcupada == 0;
    }

    @Override
    public void imprimir(){
        int a=0;
        for(T elem : arreglo){
            
            System.out.println("Elemento " + a +"=" + elem);
            a++;
        }
    }
    
    



}
