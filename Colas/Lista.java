public interface Lista<T>{
    // Agregar elemeto
    void InsertarFin(T item);
    void InsertarInicio(T item);
    void InsertarPos(T elem, int pos);

    // Eliminar un elemento
    T eliminarUltimo();
    T eliminarPrimero();
    T eliminarPos(int pos);

    // Obtener un elemento (sin modificar la lista)
    T obtenerPrimero(); // Precondición: La lista no es Vacía.
    T obtenerUltimo();  // Precondición: La lista no es Vacía.
    T obtenerElemPos(int pos); // Precondición: pos es una posición válida

    // Otros métodos auxiliares
    int buscar(T item);
    int longitud();
    boolean esVacia();
    void imprimir();    
}