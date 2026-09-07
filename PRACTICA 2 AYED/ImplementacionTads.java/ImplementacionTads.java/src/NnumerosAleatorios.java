import java.util.LinkedList;
import java.util.Random;
import java.util.ArrayList;
public class NnumerosAleatorios {
    public static LinkedList<Integer> listaAleatoria(int n){
        LinkedList<Integer> lista = new LinkedList<>();
        Random random = new Random();
        for(int i=0; i<n; i++){
            int min = 15;
            int max = 60;
            //Si quieres un número entre 15 y 60, (60 - 15 + 1) da 46. La instrucción random.nextInt(46) le ordena al motor estocástico generar un bloque de posibilidades del 0 al 45. Finalmente, al sumar el min (15) por fuera de la función, la CPU desplaza ese resultado bruto hacia arriba en la recta numérica. Si sale el 0, el resultado es 15. Si sale el límite máximo que es 45, el resultado es 60.
            Integer nuevoNumero = random.nextInt(max - min + 1) + min; 
            lista.add(nuevoNumero);
        }
        return lista;
    }

     public static boolean pertenece(int n, LinkedList<Integer> lista){
       
        for(Integer list : lista){
            if(list.equals(n)){
                return true;
            }
        }
        return false;
    }

    public static void ordenamiento(ArrayList<Integer> arreglo){
        for(int i=0; i<arreglo.size(); i++){ 
        for(int j=0; j<arreglo.size()-1; j++){
            Integer mayorPar;
            Integer menorPar;
            if( arreglo.get(j) > arreglo.get(j+1) ){
                mayorPar = arreglo.get(j);
                menorPar = arreglo.get(j+1);

                arreglo.set(j+1, mayorPar);
                arreglo.set(j, menorPar);

            }
        }
    }
    

    
        }


    

}
