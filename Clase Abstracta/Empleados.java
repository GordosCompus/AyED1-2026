public abstract class Empleados {
    // Atributos privados (completamente ocultos fuera de esta clase)
    private String nombre;
    private double salarioTotal;

    // Constructor
    public Empleados(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto obligatorio
    public abstract void calcularPago();

    // Métodos de acceso (Getters y Setters)
    public String getNombre() {
        return nombre;
    }

    public double getSalarioTotal() {
        return salarioTotal;
    }

    public void setSalarioTotal(double salarioTotal) {
        this.salarioTotal = salarioTotal;
    }
}