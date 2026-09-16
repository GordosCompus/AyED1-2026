/**
 * MainLaA
 * Prueba de Memoria Estatica ListaArreglo (pasado por una IA)
 */
public class MainLA {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("  PRUEBA DE TAD LISTA: MEMORIA ESTÁTICA (ARREGLO)");
        System.out.println("==================================================");

        // 1. Instanciar la lista con capacidad fija para máximo 3 elementos
        Lista<String> listaEstatica = new ListaArreglo<>(3);

        System.out.println("¿La lista está vacía?: " + listaEstatica.esVacia()); // true

        // 2. Probar inserciones dentro del límite
        System.out.println("\n--- 1. Insertando elementos ---");
        listaEstatica.InsertarFin("Carlos");
        listaEstatica.InsertarInicio("Ana");
        listaEstatica.InsertarPos("Beatriz", 1); // Lista: [Ana, Beatriz, Carlos]

        System.out.print("Estado de la lista: ");
        listaEstatica.imprimir();
        System.out.println("Longitud actual: " + listaEstatica.longitud());

        // 3. Consultas
        System.out.println("\n--- 2. Consultando datos ---");
        System.out.println("Primer elemento: " + listaEstatica.obtenerPrimero());
        System.out.println("Último elemento: " + listaEstatica.obtenerUltimo());
        System.out.println("Posición de 'Beatriz': " + listaEstatica.buscar("Beatriz"));

        // 4. Probar desbordamiento (Overflow por capacidad fija)
        System.out.println("\n--- 3. Probando límite de Memoria Estática ---");
        try {
            System.out.println("Intentando agregar un cuarto elemento ('Daniel')...");
            listaEstatica.InsertarFin("Daniel"); 
        } catch (RuntimeException e) {
            System.out.println("-> Excepción capturada con éxito: " + e.getMessage());
        }

        // 5. Eliminar y verificar reacondicionamiento del arreglo
        System.out.println("\n--- 4. Eliminando elementos ---");
        System.out.println("Elemento eliminado del inicio: " + listaEstatica.eliminarPrimero());
        System.out.print("Lista tras eliminar el primero: ");
        listaEstatica.imprimir();

        // 6. Volver a insertar ahora que hay espacio
        System.out.println("\n--- 5. Insertando tras liberar espacio ---");
        listaEstatica.InsertarFin("Daniel");
        System.out.print("Lista final: ");
        listaEstatica.imprimir();
    }
}

