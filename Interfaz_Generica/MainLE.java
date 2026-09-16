/**
 * MainLE
 * Prueba de Memoria Dinamica ListaEnlazada (pasado por una IA)
 */
public class MainLE {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println(" PRUEBA DE TAD LISTA: MEMORIA DINÁMICA (ENLAZADA)");
        System.out.println("==================================================");

        // 1. Instanciar la lista dinámica (no requiere definir capacidad)
        Lista<Integer> listaDinamica = new ListaEnlazada<>();

        System.out.println("¿La lista está vacía?: " + listaDinamica.esVacia()); // true

        // 2. Insertar múltiples elementos (crecimiento continuo en el Heap)
        System.out.println("\n--- 1. Insertando elementos dinámicamente ---");
        listaDinamica.InsertarFin(10);
        listaDinamica.InsertarFin(20);
        listaDinamica.InsertarInicio(5);
        listaDinamica.InsertarPos(15, 2); // Lista: [5, 10, 15, 20]
        listaDinamica.InsertarFin(25);    // Lista: [5, 10, 15, 20, 25]

        System.out.print("Estado de la lista: ");
        listaDinamica.imprimir();
        System.out.println("Longitud actual: " + listaDinamica.longitud());

        // 3. Consultas
        System.out.println("\n--- 2. Consultando datos ---");
        System.out.println("Primer elemento: " + listaDinamica.obtenerPrimero());
        System.out.println("Último elemento: " + listaDinamica.obtenerUltimo());
        System.out.println("Elemento en la posición 3: " + listaDinamica.obtenerElemPos(3));
        System.out.println("Posición del número 15: " + listaDinamica.buscar(15));

        // 4. Eliminaciones en distintas posiciones
        System.out.println("\n--- 3. Eliminando elementos de la cadena ---");
        System.out.println("Eliminado del inicio: " + listaDinamica.eliminarPrimero()); // Elimina 5
        System.out.println("Eliminado del final: " + listaDinamica.eliminarUltimo());   // Elimina 25
        System.out.println("Eliminado de la pos 1: " + listaDinamica.eliminarPos(1));   // Elimina 15

        System.out.print("Lista tras las tres eliminaciones: ");
        listaDinamica.imprimir();
        System.out.println("Longitud final: " + listaDinamica.longitud());

        // 5. Control de errores (Tratar de consultar lista que se vacía)
        System.out.println("\n--- 4. Vaciando lista completamente ---");
        listaDinamica.eliminarPrimero();
        listaDinamica.eliminarPrimero();
        System.out.println("¿Está vacía ahora?: " + listaDinamica.esVacia()); // true
    }
}
