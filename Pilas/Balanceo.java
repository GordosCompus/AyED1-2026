public class Balanceo{

    public static boolean estaBalanceado(String cadena){
        PilaLista<Character> pila = new PilaLista<>();
        
        for(int i= 0; i< cadena.length(); i++){
            char C = cadena.charAt(i);

            if(C == '(' ){
                pila.apilar(C);
            }

            else if(C ==')'){
                if(pila.esVacia()){
                    return false;
                }
                char tope = pila.Tope();
                if(C == ')' && tope != '('){
                    return false;
                }
            }
        }
     return pila.esVacia();    
    }

    public static void main(String[] args) {
        String test1 = "(3+4) * 8";
        String test2 = "(( 3 + 4 ) * 8";
        String test3 = ") 3 + 4 ( * 8";

        System.out.println(test1 + " -> " + estaBalanceado(test1)); // true
        System.out.println(test2 + " -> " + estaBalanceado(test2)); // false
        System.out.println(test3 + " -> " + estaBalanceado(test3)); // false

    }
}