abstract class Figuras{

    public abstract double area();
    public abstract double perimetro();

    public void mostrarInfo() {
        System.out.println(this.getClass().getSimpleName()
                + "  área: " + area()
                + "  perímetro: " + perimetro());
    }
}

class Circulo extends Figuras {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double area() {
        return Math.PI * (radio * radio);
    }

    public double perimetro() {
        return 2 * Math.PI * radio;
    }
}

class Rectangulo extends Figuras {
    private double base;
    private double altura;
 
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
 
    public double area() {
        return base * altura;
    }
 
    public double perimetro() {
        return 2 * (base + altura);
    }
}

class Triangulo extends Figuras {
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double base;
    private double altura;
 
    public Triangulo(double ladoA, double ladoB, double ladoC, double base, double altura) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.base = base;
        this.altura = altura;
    }
 
    public double area() {
        return (base * altura) / 2.0;
    }
 
    public double perimetro() {
        return ladoA + ladoB + ladoC;
    }
}
