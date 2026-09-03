import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Cajas individuales
        Caja<Integer> cajaInt = new Caja<>();
        cajaInt.guardar(42);

        Caja<String> cajaString = new Caja<>();
        cajaString.guardar("Hola Mundo");

        Caja<Persona> cajaPersona = new Caja<>();
        cajaPersona.guardar(new Persona(30123456, "Ana", "Gómez"));

        //mostrarInfo() de cada caja
        cajaInt.mostrarInfo();
        cajaString.mostrarInfo();
        cajaPersona.mostrarInfo();

        //Recuperar con obtener() y mostrar atributos si es Persona
        Integer valorInt = cajaInt.obtener();
        System.out.println("Valor recuperado (Integer): " + valorInt);

        String valorString = cajaString.obtener();
        System.out.println("Valor recuperado (String): " + valorString);

        Persona valorPersona = cajaPersona.obtener();
        System.out.println("Valor recuperado (Persona):");
        System.out.println("  Nombre: " + valorPersona.getNombre());
        System.out.println("  Apellido: " + valorPersona.getApellido());
        System.out.println("  DNI: " + valorPersona.getDni());

        //Lista de cajas genéricas
        ArrayList<Caja<?>> listaCajas = new ArrayList<>();
        listaCajas.add(cajaInt);
        listaCajas.add(cajaString);
        listaCajas.add(cajaPersona);

        System.out.println("Mostrando contenido de todas las cajas de la lista:");
        for (Caja<?> caja : listaCajas) {
            caja.mostrarInfo();
        }
    }
}
