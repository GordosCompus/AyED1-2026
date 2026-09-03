// Clase principal del programa
public class Main{
    public static void main(String[] args){
    /* Creamos un arreglo de tipo Persona.
    Puede contener tanto Personas como Estudiantes,
    porque Estudiante hereda de Persona.*/
        Persona[] personas = new Persona[4];

        personas[0] = new Persona(12345678, "Juan", "Perez");

        personas[1] = new Estudiante(
                48286638,
                "Franco",
                "Sanchez",
                true,
                8.5f,
                3
        );

        personas[2] = new Persona(34567890, "Maria", "Lopez");

        personas[3] = new Estudiante(
                45678901,
                "Alejandro",
                "Sanchez",
                true,
                7.0f,
                2
        );

         // Recorremos todo el arreglo
        for (Persona persona : personas) {
             // Mostramos la información de cada elemento
            System.out.println(persona);
        }
    }
}