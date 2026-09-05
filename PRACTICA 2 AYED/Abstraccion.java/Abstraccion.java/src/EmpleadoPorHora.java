public class EmpleadoPorHora extends Empleado{
    private int horasTrabajadas;
    private int tarifaPorHora;

    public EmpleadoPorHora(int horasTrabajadas,int tarifaPorHora, String nombre){ 
        super(nombre,0);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;

    }

    @Override
    public int calcularPago(){
        return horasTrabajadas*tarifaPorHora;
    }

}


