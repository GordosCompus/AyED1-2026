/**
 * Implementación del TAD Lista utilizando Memoria Dinámica
 * Reserva memoria en el Heap a medida que se crean nodos y no requiere un tamaño máximo predefinido.
 *
 */
public class ListaEnlazada<T> implements Lista<T> {

    /**
     * Clase interna que representa un nodo en la memoria RAM.
     */
    private static class Nodo<T> {
        T dato;
        Nodo<T> siguiente;

        Nodo(T dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo<T> cabeza;
    private int tamanio;

    public ListaEnlazada() {
        this.cabeza = null;
        this.tamanio = 0;
    }

    /**
     * Agrega un elemento reservando memoria para un nuevo nodo al final de la cadena.
     */
    @Override
    public void InsertarFin(T item) {
        // 1. Reservar memoria en el Heap para el nuevo nodo
        Nodo<T> nuevo = new Nodo<>(item);

        // Caso especial: si la lista está vacía, el nuevo nodo se convierte en la cabeza
        if (esVacia()) {
            cabeza = nuevo;
        } else {
            // Si la lista no está vacía, debemos recorrerla hasta el último nodo actual
            Nodo<T> actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente; // Avanza salto por salto
            }
            actual.siguiente = nuevo;
        }

        tamanio++;
    }

    /**
     * Crea un nodo nuevo y lo asigna directamente como la nueva cabeza de la lista.
     */
    @Override
    public void InsertarInicio(T elem) {
        Nodo<T> nuevo = new Nodo<>(elem);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
        tamanio++;
    }

    /**
     * Crea un nodo nuevo y reorganiza los punteros para enlazarlo en la posición indicada.
     */
    @Override
    public void InsertarPos(T elem, int pos) {
        if (pos < 0 || pos > tamanio) {
            throw new IndexOutOfBoundsException("Posición inválida: " + pos);
        }
        if (pos == 0) {
            InsertarInicio(elem);
            return;
        }

        Nodo<T> actual = cabeza;
        for (int i = 0; i < pos - 1; i++) {
            actual = actual.siguiente;
        }

        Nodo<T> nuevo = new Nodo<>(elem);
        nuevo.siguiente = actual.siguiente;
        actual.siguiente = nuevo;
        tamanio++;
    }

    /**
     * Desconecta el primer nodo. La memoria queda libre para el Garbage Collector.
     */
    @Override
    public T eliminarPrimero() {
        if (esVacia()) throw new IllegalStateException("La lista está vacía.");
        T eliminado = cabeza.dato;
        cabeza = cabeza.siguiente;
        tamanio--;
        return eliminado;
    }

    @Override
    public T eliminarUltimo() {
        return eliminarPos(tamanio - 1);
    }

    /**
     * Saltea el nodo de la posición indicada reconectando las referencias anteriores y posteriores.
     */
    @Override
    public T eliminarPos(int pos) {
        if (pos < 0 || pos >= tamanio) {
            throw new IndexOutOfBoundsException("Posición inválida: " + pos);
        }
        if (pos == 0) {
            return eliminarPrimero();
        }

        Nodo<T> actual = cabeza;
        for (int i = 0; i < pos - 1; i++) {
            actual = actual.siguiente;
        }

        T eliminado = actual.siguiente.dato;
        actual.siguiente = actual.siguiente.siguiente;
        tamanio--;
        return eliminado;
    }

    @Override
    public T obtenerPrimero() {
        if (esVacia()) throw new IllegalStateException("La lista está vacía.");
        return cabeza.dato;
    }

    @Override
    public T obtenerUltimo() {
        if (esVacia()) throw new IllegalStateException("La lista está vacía.");
        return obtenerElemPos(tamanio - 1);
    }

    @Override
    public T obtenerElemPos(int pos) {
        if (pos < 0 || pos >= tamanio) {
            throw new IndexOutOfBoundsException("Posición inválida: " + pos);
        }
        Nodo<T> actual = cabeza;
        for (int i = 0; i < pos; i++) {
            actual = actual.siguiente;
        }
        return actual.dato;
    }

    @Override
    public int buscar(T item) {
        Nodo<T> actual = cabeza;
        int pos = 0;
        while (actual != null) {
            if (actual.dato != null && actual.dato.equals(item)) {
                return pos;
            }
            actual = actual.siguiente;
            pos++;
        }
        return -1;
    }

    @Override
    public int longitud() {
        return tamanio;
    }

    @Override
    public boolean esVacia() {
        return tamanio == 0;
    }

    @Override
    public void imprimir() {
        System.out.print("[ ");
        Nodo<T> actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + (actual.siguiente != null ? ", " : ""));
            actual = actual.siguiente;
        }
        System.out.println(" ]");
    }
}
