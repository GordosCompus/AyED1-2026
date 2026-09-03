import java.util.ArrayList;

public class OrdenamientoList {
    // Version Optimizada de BubbleSort
 public static void bubbleSort(ArrayList<Integer> list) {
        int n = list.size();
        boolean intercambio;
        
        for (int i = 0; i < n - 1; i++) {
            intercambio = false;
            for (int j = 0; j < n - i - 1; j++) {
                // Comparamos elementos vecinos usando .get()
                if (list.get(j) > list.get(j + 1)) {
                    // Intercambio usando un elemento temporal y .set()
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                    
                    intercambio = true;
                }
            }
            // Si no hubo cambios, la lista ya está ordenada
            if (!intercambio) break;
        }
    }

    public static void main(String[] args){
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(8);
        lista.add(5);
        lista.add(9);
        System.out.println("su lista original es: "+lista);

        bubbleSort(lista);
        System.out.println("su lista original aplicada al bubleSort es: "+lista);


    }
}
