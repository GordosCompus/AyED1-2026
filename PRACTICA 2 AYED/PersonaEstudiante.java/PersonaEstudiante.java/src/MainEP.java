public class MainEP {
    public static void main(String[] args) {
        Persona[] A = new Persona[5];
        A[0] = new Persona("Juan", "Perez", "12345678");
        A[1] = new Persona("Maria", "Gomez", "87654321");
        A[2] = new Estudiante("Pedro", "Lopez", "11223344", "Ingenieria", 3, 8);
        A[3] = new Estudiante("Ana", "Martinez", "44332211", "Medicina", 5, 9);
        A[4] = new Estudiante("Luis", "Garcia", "55667788", "Derecho", 2, 7);
        for(Persona p :A){
            System.out.println(p.toString());
        }
        System.out.println("Todos los estudiantes mostrados!");
    }
}
