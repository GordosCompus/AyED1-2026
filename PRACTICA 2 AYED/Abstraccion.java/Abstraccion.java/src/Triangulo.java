public class Triangulo extends Figura {
    private double base;
    private double altura;


    public Triangulo(double base) {
        this.base = base;
        
    }

    @Override
    public double area(){
        return (base * altura) / 2;
    }

    @Override
    public double perimetro(){
        return 3*base;
    }

}
