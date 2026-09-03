import java.util.LinkedList;
import java.util.Random;

public class NumAlea{
    /**
     * Crea y retorna una LinkedList con N números enteros aleatorios.
     */
    public static LinkedList<Integer> generarN(int n) {
        LinkedList<Integer> lista = new LinkedList<>();
        Random random = new Random();

        // Agrega N números aleatorios a la lista
        for (int i = 0; i < n; i++) {
            lista.add(random.nextInt()); 
        }

        return lista;
    }

    public static void main(String[] args) {
        int cantidad = 5; // Parámetro N
        
        // Llamada a la función
        LinkedList<Integer> miLista = generarN(cantidad);
        
        // Impresión del resultado
        System.out.println("Lista con " + cantidad + " números aleatorios:");
        System.out.println(miLista);
    }
}