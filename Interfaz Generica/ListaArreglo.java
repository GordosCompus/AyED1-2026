/**
 * Implementación del TAD Lista utilizando Memoria Estática (basada en un Arreglo de tamaño fijo).
 */
@SuppressWarnings("unchecked")
public class ListaArreglo<T> implements Lista<T> {

    private T[] elementos;
    private int tamanio;
    private int capacidad;

    /**
     * Construye una ListaArreglo vacía con una capacidad reservada fija.
     */
    public ListaArreglo(int capacidad) {
        if (capacidad < 0) {
            throw new IllegalArgumentException("La capacidad no puede ser negativa.");
        }
        this.capacidad = capacidad;
        this.elementos = (T[]) new Object[capacidad];
        this.tamanio = 0;
    }

    /**
     * Agrega un elemento directamente al final del arreglo.
     */
    @Override
    public void InsertarFin(T item) {
        if (tamanio == capacidad) {
            throw new RuntimeException("Error: La lista está llena (Memoria estática agotada).");
        }
        elementos[tamanio] = item;
        tamanio++;
    }

    /**
     * Agrega un elemento en la primera posición desplazando el resto a la derecha.
     */
    @Override
    public void InsertarInicio(T elem) {
        if (tamanio == capacidad) {
            throw new RuntimeException("Error: La lista está llena (Memoria estática agotada).");
        }

        // Desplazar todos los elementos existentes una casilla hacia la derecha
        // Se recorre de atrás hacia adelante para no sobreescribir valores
        for (int i = tamanio; i > 0; i--) {
            elementos[i] = elementos[i - 1];
        }

        elementos[0] = elem;
        tamanio++;
    }

    /**
     * Inserta un elemento en una posición específica abriendo espacio con un desplazamiento.
     */
    @Override
    public void InsertarPos(T elem, int pos) {
        if (tamanio == capacidad) {
            throw new RuntimeException("Error: La lista está llena.");
        }
        if (pos < 0 || pos > tamanio) {
            throw new IndexOutOfBoundsException("Posición inválida: " + pos);
        }
        // Desplazamiento de elementos hacia la derecha
        for (int i = tamanio; i > pos; i--) {
            elementos[i] = elementos[i - 1];
        }
        elementos[pos] = elem;
        tamanio++;
    }

    /**
     * Elimina el último elemento del arreglo.
     */
    @Override
    public T eliminarUltimo() {
        return eliminarPos(tamanio - 1);
    }

    /**
     * Elimina el primer elemento del arreglo.
     */
    @Override
    public T eliminarPrimero() {
        return eliminarPos(0);
    }

    /**
     * Elimina el elemento en la posición dada y desplaza los posteriores hacia la izquierda.
     */
    @Override
    public T eliminarPos(int pos) {
        if (pos < 0 || pos >= tamanio) {
            throw new IndexOutOfBoundsException("Posición inválida: " + pos);
        }
        T eliminado = elementos[pos];

        for (int i = pos; i < tamanio - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        
        elementos[--tamanio] = null; 
        return eliminado;
    }

    @Override
    public T obtenerPrimero() {
        if (esVacia()) throw new IllegalStateException("La lista está vacía.");
        return elementos[0];
    }

    @Override
    public T obtenerUltimo() {
        if (esVacia()) throw new IllegalStateException("La lista está vacía.");
        return elementos[tamanio - 1];
    }

    @Override
    public T obtenerElemPos(int pos) {
        if (pos < 0 || pos >= tamanio) {
            throw new IndexOutOfBoundsException("Posición inválida: " + pos);
        }
        return elementos[pos];
    }

    @Override
    public int buscar(T item) {
        for (int i = 0; i < tamanio; i++) {
            if (elementos[i] != null && elementos[i].equals(item)) {
                return i;
            }
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
        for (int i = 0; i < tamanio; i++) {
            System.out.print(elementos[i] + (i < tamanio - 1 ? ", " : ""));
        }
        System.out.println(" ]");
    }
}

