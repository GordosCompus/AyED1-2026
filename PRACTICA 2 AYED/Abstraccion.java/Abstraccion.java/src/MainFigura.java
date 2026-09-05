import java.util.ArrayList;
public class MainFigura {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(new Circulo(5.0));
        figuras.add(new Rectangulo(4.0, 6.0));
        double areaTotal = 0;
        for (Figura figura : figuras) {
            areaTotal += figura.area();
            System.out.println("Área: " + figura.area());
            System.out.println("Perímetro: " + figura.perimetro());
        }
        System.out.println("Área total: " + areaTotal);
    }

}
