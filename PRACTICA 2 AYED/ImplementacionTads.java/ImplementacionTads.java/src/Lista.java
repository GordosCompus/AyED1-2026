public interface Lista<T> {

    public void insertarFin(T item);
    public void insertarInicio(T elem);
    public  void insertarPos(T elem, int pos);
    public T eliminarUltimo();
    public T eliminarPrimero();
    public T eliminarPos(int pos);
    public T obtenerPrimero();
    public T obtenerUltimo();
    public T obtenerElemPos(int pos);
    public int buscar(T item);
    public int longitud();
    public boolean esVacia();
    public void imprimir();


}
