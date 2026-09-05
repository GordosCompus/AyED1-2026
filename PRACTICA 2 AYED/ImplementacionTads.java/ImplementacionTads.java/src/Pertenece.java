import java.util.LinkedList;
public class Pertenece {
    public static boolean pertenece(int n, LinkedList<Integer> lista){
       
        for(Integer list : lista){
            if(list.equals(n)){
                return true;
            }
        }
        return false;
    }

}
