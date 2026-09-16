public class ListaEnlazada<T> implements Lista<T> {
    private Nodo<T> cabeza;
    private int cantLogica;

    public ListaEnlazada(){
        this.cabeza = null;
        this.cantLogica = 0;
    }

    // La regla arquitectónica es esta:

//Cuando vas a alterar enlaces (insertar/eliminar), usas i < pos - 1 para frenar un bloque antes. Necesitas ese nodo previo intacto para usar sus brazos (setSiguiente) y reenganchar la cadena.

//Cuando vas a leer un dato, no te importan los enlaces. Usas i < pos para dar la cantidad exacta de pasos y pararte encima del objetivo.
    @Override
    public void insertarFin(T dato){
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if(esVacia()){
            cabeza = nuevoNodo;
            cantLogica++;
        } else{
            Nodo<T> mensajero = cabeza;
            while(mensajero.getSiguiente() !=null){ 
                mensajero = mensajero.getSiguiente();
            }
            mensajero.setSiguiente(nuevoNodo);
             cantLogica++;
        }
    }

     @Override
    public void insertarInicio(T dato){
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if(esVacia()){
            cabeza = nuevoNodo;
            cantLogica++;
        } else{
           nuevoNodo.setSiguiente(cabeza);
            cabeza = nuevoNodo;
            cantLogica++;
        }     
    }

    @Override
    public  void insertarPos(T elem, int pos){
        if(pos>cantLogica || pos<0){
            throw new IllegalStateException("La pos debe ser >=0 y menor a Cantidad Logica");
        }
        if(pos==0){
           insertarInicio(elem);
        }   else{

        
        Nodo<T> nuevoNodo = new Nodo<>(elem);
            Nodo<T> mensajero = cabeza;
        for(int i = 0; i<pos-1; i++){
           mensajero = mensajero.getSiguiente();
        }
        //La regla de oro en el manejo de memoria dinámica es: nunca sueltes la estructura original hasta que el bloque nuevo ya esté asegurado a ella. Siempre debes enlazar de derecha a izquierda.
        nuevoNodo.setSiguiente(mensajero.getSiguiente()); //primero enlazamos la  nueva 
        mensajero.setSiguiente(nuevoNodo); // segundo la anterior a la nueva 
        
        cantLogica++;
    }
    }

    @Override
    public T eliminarUltimo(){
        if(esVacia()){
             throw new IllegalStateException("La lista es vacia, no se puede eliminar elementos");

        }

        if(cantLogica==1){
           return  eliminarPrimero();
        }

            Nodo<T> mensajero = cabeza;
            while(mensajero.getSiguiente().getSiguiente()!=null){
                mensajero = mensajero.getSiguiente();
            }
            T auxMensajero = mensajero.getSiguiente().getDato();
            mensajero.setSiguiente(null);
            cantLogica--;

        return auxMensajero;
    }

    @Override
    public T eliminarPrimero(){
        if(esVacia()){
             throw new IllegalStateException("La lista es vacia, no se puede eliminar elementos");
         }
         T auxCabeza = cabeza.getDato();
         cabeza = cabeza.getSiguiente();// Mueve la cabeza al siguiente puntero (si era el unico, queda en null papaaa)
         cantLogica--;
        return auxCabeza;
    }

    @Override
    public T eliminarPos(int pos){
         if(esVacia()){
             throw new IllegalStateException("La lista es vacia, no se puede eliminar elementos");
         }
          if(pos>cantLogica || pos<0){
            throw new IllegalStateException("La pos debe ser >=0 y menor a Cantidad Logica");
        }
        if(pos==0){
            return eliminarPrimero();
        } 

        Nodo<T> mensajero = cabeza;
        for(int i=0; i<pos-1; i++){
            mensajero = mensajero.getSiguiente();
        }
        T auxDato= mensajero.getSiguiente().getDato();
        mensajero.setSiguiente(mensajero.getSiguiente().getSiguiente());
        cantLogica--;
        
        return auxDato;
    }

    @Override
    public T obtenerPrimero(){
        if(esVacia()){
             throw new IllegalStateException("La lista es vacia, no se puede obtener elementos");
         }

        return cabeza.getDato();
    }

    @Override
    public T obtenerUltimo(){
        if(esVacia()){
             throw new IllegalStateException("La lista es vacia, no se puede obtener elementos");
         }
        Nodo<T> mensajero = cabeza;
        while(mensajero.getSiguiente() != null){
            mensajero = mensajero.getSiguiente();
        }

        return mensajero.getDato();
    }

    @Override
    public T obtenerElemPos(int pos){
         if(esVacia()){
             throw new IllegalStateException("La lista es vacia, no se puede obtener elementos");
         }
         if(pos>=cantLogica || pos<0){
            throw new IllegalStateException("La pos debe ser >=0 y menor a Cantidad Logica");
        }
         if(pos==0){
           return obtenerPrimero();
         }
         Nodo<T> mensajero = cabeza;
         for(int i=0; i<pos; i++){
            mensajero = mensajero.getSiguiente();
         }
        return mensajero.getDato();
    }

    @Override
    public int buscar(T item){
        if(item==null){
             throw new IllegalStateException("item debe ser distinto de null");
        }
        Nodo<T> mensajero = cabeza;
        int contador = 0;
        while(mensajero!= null){
            if(mensajero.getDato().equals(item)){
                return contador;
            }
            mensajero = mensajero.getSiguiente();
            contador++;
        }

        return -1;
       
    }

    @Override
    public int longitud(){
        return cantLogica;
    }

    @Override
    public boolean esVacia(){
        if(cabeza == null){
            return true;
        }
        return false;
    }

    @Override
    public void imprimir(){
        if(esVacia()){
             throw new IllegalStateException("La lista es vacia, no se puede obtener elementos");
         }
         Nodo<T> mensajero = cabeza;
         int contador = 0;
         while(mensajero!=null){

            System.out.println(" Indice " + contador + " : " + mensajero.getDato());
            mensajero = mensajero.getSiguiente();
            contador++;
         }

    }
}
