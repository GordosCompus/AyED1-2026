// Clase que representa un Estudiante y hereda de la clase Persona
public class Estudiante extends Persona{
    private boolean esRegular;
    private float promedio;
    private int materiasAprobadas;

    // Constructor de Estudiante
    public Estudiante(int dni, String nombre, String apellido, boolean esRegular, float promedio, int cantidadMateriasAprobadas) {
        // Llama al constructor de la clase Persona
        // para inicializar DNI, nombre y apellido
        super(dni, nombre, apellido);
        // Inicializa los atributos propios de Estudiante
        this.esRegular = esRegular;
        this.promedio = promedio;
        this.materiasAprobadas = cantidadMateriasAprobadas;
    }

    // Método que se ejecuta cuando el estudiante aprueba una materia
    public void aproboMateria(int nota) {

        promedio = (promedio * materiasAprobadas + nota)
                   / (materiasAprobadas + 1);

        materiasAprobadas++;
    }

    // Sobrescribe el método toString() de Persona
    @Override
    public String toString() {

        // Muestra la información heredada de Persona
        // junto con la información propia del estudiante
        return super.toString() +
               ", Es regular: " + esRegular +
               ", Promedio: " + promedio +
               ", Materias aprobadas: " + materiasAprobadas;
    }
    
}