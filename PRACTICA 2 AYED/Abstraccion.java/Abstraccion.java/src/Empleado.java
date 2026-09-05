public abstract class Empleado {
    private String nombre;
    private int salarioTotal;

    public Empleado(String nombre, int salarioTotal){
        this.nombre = nombre;
        this.salarioTotal = salarioTotal;
    }

    public abstract int calcularPago();

   public String getNombre(){
    return nombre;
   } 

}
