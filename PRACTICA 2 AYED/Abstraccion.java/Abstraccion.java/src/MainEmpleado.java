import java.util.ArrayList;
public class MainEmpleado {
    public static void main(String[] args){
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPorHora(8,100,"Xavier"));
        empleados.add(new EmpleadoMensual("Mauro",3000));

        for(Empleado emp : empleados){
            if(emp instanceof EmpleadoMensual){ 
            System.out.println("El empleado " + emp.getNombre() + " cobra un sueldo al mes de : $"  + emp.calcularPago());
        } else{
            System.out.println("El empleado " + emp.getNombre() + " cobra una tarifa al dia de : $"  + emp.calcularPago());
        }
    }
    }

}
