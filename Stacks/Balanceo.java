import java.util.Stack;

public class Balanceo{

    public static boolean estaBalanceado(String cadena){
        Stack<Character> pila = new Stack<>();
        
        for(int i= 0; i< cadena.length(); i++){
            char C = cadena.charAt(i);

            if(C == '(' ){
                pila.push(C);
            }

            else if(C ==')'){
                if(pila.isEmpty()){
                    return false;
                }
                char tope = pila.pop();
                if(C == ')' && tope != '('){
                    return false;
                }
            }
        }
     return pila.isEmpty();    
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


