public class Circulo extends Figura {
    private double radio;

    public Circulo( double radio){
        this.radio = radio;
    }

    @Override
    public double area(){
        double radioCuadrado = radio * radio;
        return Math.PI * radioCuadrado;
    }

    @Override
    public double perimetro(){
        return 2 * Math.PI * radio;
    }

    

}
