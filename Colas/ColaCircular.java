public interface ColaCircular<T>{

    public boolean estaLlena();
    public boolean estaVacia();

    public void encolar(T item);
    public T desencolar();
    
    public void imprimir();
    
}