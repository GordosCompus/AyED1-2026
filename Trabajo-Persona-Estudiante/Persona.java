// Clase que representa a una persona

public class Persona {
    private int dni;
    private String nombre;
    private String apellido;

    // Constructor de la clase Persona
    public Persona(int dni, String Nombre, String apellido){
        this.dni = dni;
        this.nombre= Nombre;
        this.apellido = apellido;
    }

    // Devuelve el DNI de la persona
    public int getDni() {
        return dni;
    }

    // Devuelve el nombre de la persona
    public String getNombre() {
        return nombre;
    }
    
    // Devuelve el apellido de la persona
    public String getApellido() {
        return apellido;
    }

    // Permite mostrar la información de la persona
    @Override
    public String toString() {
        return "DNI: " + dni +
               ", Nombre: " + nombre +
               ", Apellido: " + apellido;
    }
}
