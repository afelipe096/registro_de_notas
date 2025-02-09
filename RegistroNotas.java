
import java.util.Scanner;

// Programa principal para probar el sistema
public class RegistroNotas {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { // Uso de try-with-resources para cerrar el scanner automáticamente
            Universidad universidad = new Universidad();

            // Registro de 5 estudiantes
            for (int i = 1; i <= 5; i++) {
                int id;
                do {
                    System.out.print("Ingrese el ID del estudiante " + i + ": ");
                    id = scanner.nextInt();
                    if (universidad.existeEstudiante(id)) {
                        System.out.println("El ID ya está registrado. Ingrese otro.");
                    }
                } while (universidad.existeEstudiante(id));
                
                scanner.nextLine(); // Limpiar buffer
                System.out.print("Ingrese el nombre del estudiante " + i + ": ");
                String nombre = scanner.nextLine();
                Estudiante estudiante = new Estudiante(id, nombre);

                // Registro de 5 asignaturas por estudiante
                for (int j = 1; j <= 5; j++) {
                    System.out.print("Ingrese el nombre de la asignatura " + j + " para " + nombre + ": ");
                    String nombreAsignatura = scanner.nextLine();
                    Asignatura asignatura = new Asignatura(nombreAsignatura);

                    // Registro de 3 notas parciales por asignatura
                    for (int k = 1; k <= 3; k++) {
                        System.out.print("Ingrese la nota " + k + " de " + nombreAsignatura + ": ");
                        double nota = scanner.nextDouble();
                        asignatura.agregarNota(nota);
                    }
                    scanner.nextLine(); // Limpiar buffer
                    estudiante.agregarAsignatura(asignatura);
                }
                universidad.agregarEstudiante(estudiante);
            }

            // Mostrar promedios
            for (Estudiante estudiante : universidad.getEstudiantes()) {
                System.out.println("Promedio general de " + estudiante.getNombre() + ": " + estudiante.calcularPromedioGeneral());
            }
        }
    }
}
