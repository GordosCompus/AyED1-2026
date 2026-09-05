public class EmpleadoMensual extends Empleado{  
    private int sueldoFijo;

    public EmpleadoMensual(String nombre, int sueldoFijo){
        super(nombre, 0);
        this.sueldoFijo = sueldoFijo;
    }

    @Override
    public int calcularPago(){ 
        return sueldoFijo;
    }

}
