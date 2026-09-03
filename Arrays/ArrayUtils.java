import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Clase ArrayUtils: contiene implementaciones de rutinas fundamentales
 * sobre arreglos.
 * 
 * @author N. Aguirre
 * @version 0.1
 */
class ArrayUtils
{

    /**
     * Comprueba si un elemento (entero) pertenece a un arreglo.
     */
    public boolean pertenece(int elem, int[] arreglo) {
        if (arreglo == null)
            throw new IllegalArgumentException("Arreglo nulo");
        for(int i = 0; i <arreglo.length; i++){
            if(elem == arreglo[i]){
                return true;
            }
        }
        return false;
    }
    
    /**
     * Calcula la suma de los elementos de un arreglo de enteros
     */
    public int suma(int[] arreglo) {
        if(arreglo == null){
            throw new IllegalArgumentException("su arreglo es nulo");
        }
        int resultado = 0;
        for(int i = 0; i< arreglo.length;i++){
            resultado= resultado+arreglo[i];
        }
     return resultado;
    }
    
    /**
     * Calcula el valor mínimo de un arreglo de reales
     */
    public float minimo(float[] arreglo) {
        float minimo= arreglo[0];
        for(int i= 0; i<arreglo.length;i++){
            if(minimo>arreglo[i]){
                minimo= arreglo[i];
            }
        }
        return minimo;
    }
    
    /**
     * Calcula el valor máximo de un arreglo de reales
     */
    public float maximo(float[] arreglo) {
        float maximo= arreglo[0];
        for(int i= 0; i<arreglo.length;i++){
            if(maximo<arreglo[i]){
                maximo= arreglo[i];
            }
        }
        return maximo;
    }
    
    
    /**
     * Calcula el valor promedio de un arreglo de reales
     */
    public float promedio(float[] arreglo) {
        float resultado = 0;
        float promedio = 0;
        for(int i = 0; i< arreglo.length;i++){
            resultado= resultado+arreglo[i];
        }
        promedio = resultado/arreglo.length;
        return promedio;
    }
    
    /**
     * Retorna un arreglo con los primeros n números de Fibonacci
     */
    public int[] fibSequence(int n) {
        if (n == 0) {
        return new int[]{0};
        }
        if (n == 1) {
        return new int[]{0, 1};
        }

        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }

        return fib;
    }
    
    /**
     * Calcula la mediana de un arreglo de reales
     */
    public float mediana(float[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[i]) {
                    float aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux; 
                }
             }
        }

        int n = arreglo.length;
        if (n % 2 != 0) {
            return arreglo[n / 2];
        } else {
            return (arreglo[(n / 2) - 1] + arreglo[n / 2]) / 2.0f;
        }
    }

    
    
    /**
     * Comprueba si dos arreglos de enteros son iguales
     */
    public boolean iguales(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
            return false;
        }
     }

        return true;
    }
      
    /**
     * Comprueba si un arreglo tiene valores repetidos
     */
    public boolean tieneRepetidos(int[] arreglo) {
        for(int i = 0; i<arreglo.length;i++){
            for(int j= i+1;j<arreglo.length;j++){
                if(arreglo[i]==arreglo[j]){
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * Comprueba si un arreglo tiene dos valores cuya suma dé cero.
     */
    public boolean tieneOpuestos(float[] arreglo) {
        for(int i = 0; i<arreglo.length;i++){
            for(int j= i+1;j<arreglo.length;j++){
                if(arreglo[i]+arreglo[j] == 0){
                    return true;
                }
            }
        }
    return false;
    }
    
          public static void main(String[] args){
        ArrayUtils array= new ArrayUtils();
        String[] strArray = args;
        int[] intArray = new int[strArray.length];
        int numero= 3;

        for (int i = 0; i < strArray.length; i++) {
        intArray[i] = Integer.parseInt(strArray[i]);
        }

        //convertimos los int en float
        
        List<Float> numerosFloat = new ArrayList<>();

        for (int i = 0; i < intArray.length; i++) {
            int n = intArray[i];
            float f = (float) n;
            numerosFloat.add(f);
        }

        float[] arregloFloat = new float[numerosFloat.size()];
            for (int i = 0; i < numerosFloat.size(); i++) {
            arregloFloat[i] = numerosFloat.get(i);
        }
        
        // Probamos el Metodo Pertenece
        if(array.pertenece(numero,intArray)){
            System.out.println("El elemento si pertenece a su arreglo");
        }
        else{
            System.out.println("El elemento no pertenece a su arreglo");
        }

        //probamos el Metodo suma
        System.out.println("La suma de su arreglo es"+":"+""+array.suma(intArray));

        //probamos el Metodo minimo
        System.out.println("El elemento minimo de su arreglo es"+":"+""+array.minimo(arregloFloat));

        //probamos el Metodo minimo
        System.out.println("El elemento maximo de su arreglo es"+":"+""+array.maximo(arregloFloat));

        //probamos el metodo fibSequence
        int[] resultado = array.fibSequence(5);
        System.out.println("La secuencia fibonacci es"+":"+""+Arrays.toString(resultado));

        //probamos mediana
        System.out.println("La mediana de su arreglo es"+":"+""+array.mediana(arregloFloat));

        /*probamos el metodo iguales
        //*separamos el arreglo
        // en dos mitades
        // iguales */
        int mitad = intArray.length / 2;

        int[] primeraMitad = new int[mitad];
        int[] segundaMitad = new int[intArray.length - mitad];

        for (int i = 0; i < mitad; i++) {
            primeraMitad[i] = intArray[i];
        }

        for (int i = mitad; i < intArray.length; i++) {
            segundaMitad[i - mitad] = intArray[i];
        }

        System.out.println("la igualdad de arreglos es"+":"+""+array.iguales(primeraMitad, segundaMitad));

        //probamos tiene repetidos
        System.out.println("su arreglo tiene en repetidos valor de"+":"+""+array.tieneRepetidos(intArray));

        //probamos tiene opuestos
        System.out.println("su arreglo tiene en opuestos valor de"+":"+""+array.tieneOpuestos(arregloFloat));
    }
}