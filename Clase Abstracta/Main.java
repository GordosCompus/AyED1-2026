import java.util.ArrayList;

public class Main {
       public static void main(String[] args) {
        ArrayList<Figuras> figuras = new ArrayList<Figuras>();
 
        figuras.add(new Circulo(5));
        figuras.add(new Rectangulo(4, 6));
        figuras.add(new Triangulo(3, 4, 5, 4, 3)); 
 
        double areaTotal = 0;
 
        for (int i = 0; i < figuras.size(); i++) {
            Figuras f = figuras.get(i);
            f.mostrarInfo();
 
            if (f.area() > 0) {
                areaTotal += f.area();
            } else {
                System.out.println("Advertencia: área inválida en la figura " + i);
            }
        }
 
        System.out.println("\nÁrea total de todas las figuras: " + areaTotal);
    }
}
