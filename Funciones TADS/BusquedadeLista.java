import java.util.LinkedList;

public class BusquedadeLista {
    public static boolean pertenece(LinkedList<Integer> lista,int numero){
        return lista.contains(numero);
    }

    public static void main(String[] args){
        LinkedList<Integer> numeros = new LinkedList<>();
        numeros.add(25);
        numeros.add(8);
        numeros.add(19);
        numeros.add(30);

        int numero = 40;

        if(pertenece(numeros, numero)){
            System.out.println("su numero "+numero+ " si pertenece a la lista");
        }
        else{
            System.out.println("su numero "+numero+" no pertenece a la lista");
        }
    }
}
