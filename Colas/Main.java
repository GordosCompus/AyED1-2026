public class Main {
    public static void main(String[] args) {
        ColaArreglo<String> colaImpresion = new ColaArreglo<>(3) ;
        colaImpresion . encolar ( " Trabajo1 . txt " ) ;
        colaImpresion . encolar ( " Trabajo2 . pdf " ) ;
        colaImpresion . encolar ( " Trabajo3 . doc " ) ;

        colaImpresion.imprimir();
    }
}
