public class MainListaEnlazada {
    public static void main(String args[]){
     Lista<Integer> enlazada1 = new ListaEnlazada<>();
        enlazada1.insertarFin(1);
        enlazada1.insertarFin(2);
        enlazada1.insertarFin(3);
        enlazada1.insertarFin(4);
        enlazada1.insertarFin(5);

       enlazada1.imprimir();
       enlazada1.insertarInicio(6);
       enlazada1.imprimir();
       System.out.println(enlazada1.longitud());
       System.out.println(enlazada1.obtenerPrimero());
        System.out.println(enlazada1.obtenerUltimo());
        enlazada1.eliminarPrimero();
        System.out.println(enlazada1.obtenerPrimero());
         System.out.println(enlazada1.longitud());
         enlazada1.eliminarPos(0);
         System.out.println(enlazada1.obtenerPrimero());
           System.out.println(enlazada1.longitud());
           



    }

}
