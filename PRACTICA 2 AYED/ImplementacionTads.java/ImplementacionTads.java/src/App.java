import java.util.LinkedList;
import java.util.ArrayList;
public class App {
    public static void main(String[] args)  {


        LinkedList<Integer> listaN = NnumerosAleatorios.listaAleatoria(12);

        System.out.println("Numeros generados : "+ listaN);

         LinkedList<Integer> listaM = new LinkedList<>();

        listaM.add(1);
        listaM.add(2);
        listaM.add(3);
        listaM.add(4);
       System.out.println( NnumerosAleatorios.pertenece(4, listaM));


       ArrayList<Integer> lista = new ArrayList<>();
       lista.add(7);
       lista.add(9);
       lista.add(3);
       lista.add(1);
       lista.add(0);
       lista.add(12);
       lista.add(5);

       NnumerosAleatorios.ordenamiento(lista);
       System.out.println(lista);
       

       Lista<Integer> z = new ListaArreglo<>(10);
       System.out.println(z.esVacia());
       z.insertarFin(5);
       System.out.println(z.esVacia());
       z.insertarInicio(6);
      System.out.println(z.obtenerPrimero());
      z.insertarInicio(7);
      System.out.println(z.obtenerPrimero());
      z.insertarPos(50, 0);
      System.out.println(z.obtenerPrimero());
        z.insertarPos(8, 0);
        System.out.println(z.obtenerPrimero());
        System.out.println(z.obtenerUltimo());
        z.eliminarUltimo();
        System.out.println(z.obtenerUltimo());
        z.insertarFin(155);
        System.out.println(z.obtenerUltimo());
        z.insertarFin(300);
        System.out.println(z.obtenerUltimo());
        z.eliminarUltimo();
        System.out.println(z.obtenerUltimo());
       System.out.println(z.obtenerPrimero());
       z.eliminarPrimero();
        System.out.println(z.obtenerPrimero());
       System.out.println(z.buscar(null));
       System.out.println(z.obtenerPrimero());
       z.imprimir();




    }

    

}
