public interface Pila<T>{
   
   //metodos de des/agregar elementos de la pila
   public void apilar(T item);
   public void desapilar();

   //metodos de retorno
   public T Tope();
   public boolean esVacia();
   
   //metodo que vacia la pila completa
   public void vaciar();
}