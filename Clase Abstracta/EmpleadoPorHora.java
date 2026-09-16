public class EmpleadoPorHora extends Empleados{
    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoPorHora(String nombre, int horasTrabajadas, double tarifaPorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    // Implementación del método solicitado
    @Override
    public void calcularPago() {
        double pago = this.horasTrabajadas * this.tarifaPorHora;
        setSalarioTotal(pago);
    }
}