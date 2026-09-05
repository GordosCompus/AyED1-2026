public class Estudiante extends Persona {
    private String carrera;
    private int cantidadMateriasAprobadas;
    private int promedio;

    public Estudiante(String nombre, String apellido, String dni, String carrera, int cantidadMateriasAprobadas, int promedio) {
        super(nombre, apellido, dni);
        this.carrera = carrera;
        this.cantidadMateriasAprobadas = cantidadMateriasAprobadas;
        this.promedio = promedio;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getCantidadMateriasAprobadas() {
        return cantidadMateriasAprobadas;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setAproboMateria(int nota){
        cantidadMateriasAprobadas++;
        promedio = (promedio+nota)/cantidadMateriasAprobadas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Carrera: " + carrera + ", Cantidad de materias aprobadas : " + cantidadMateriasAprobadas + ", Promedio : " + promedio;
    }


}
