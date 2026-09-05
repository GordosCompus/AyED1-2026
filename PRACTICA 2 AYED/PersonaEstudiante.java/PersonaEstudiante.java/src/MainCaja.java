import java.util.ArrayList;
public class MainCaja {
    public static void main(String[] args){
        Caja<Integer> cajaEnteros = new Caja<>();
        Caja<String> cajaString = new Caja<>();
        Caja<Persona> cajaPersona = new Caja<>();
        Caja<Estudiante> cajaEstudiante = new Caja<>();
        cajaEnteros.guardar(10);
        cajaString.guardar("Hola Mundo");
        cajaPersona.guardar(new Persona("Juan", "Perez", "12345678"));
        cajaEstudiante.guardar(new Estudiante("Pedro", "Lopez", "11223344", "Ingenieria", 3, 8));
        cajaEnteros.mostrarInfo();
        cajaString.mostrarInfo();
        cajaPersona.mostrarInfo();
        cajaEstudiante.mostrarInfo();
        ArrayList<Caja<?>> cajas = new ArrayList<>();
        cajas.add(cajaEnteros);
        cajas.add(cajaString);
        cajas.add(cajaPersona);
        cajas.add(cajaEstudiante);
        for(Caja<?> caja : cajas){
            Object item = caja.obtener();
            if(item instanceof Persona){
                if(item instanceof Estudiante){
                    Estudiante e = (Estudiante) item;
                    System.out.println("Encontré una Persona y Estudiante, Nombre: " + e.getNombre() + ", Apellido :" + e.getApellido() +  ", DNI: " + e.getDni() + ", Carrera: " + e.getCarrera() + ", Cantidad de materias aprobadas : " + e.getCantidadMateriasAprobadas() + ", Promedio : " + e.getPromedio());
                } else{
                Persona p = (Persona) item;
                System.out.println("Encontré una Persona, Nombre: " + p.getNombre() + ", Apellido :" + p.getApellido() +  ", DNI: " + p.getDni());
            }
        }
        }
        for(Caja<?> caja: cajas){
            caja.mostrarInfo();
        }

    }
}
