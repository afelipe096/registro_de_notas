
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Clase Universidad (Main) que maneja la entrada de datos y la ejecución
public class Universidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Estudiante> estudiantes = new ArrayList<>(); // Lista de estudiantes

        System.out.print("Ingrese el número de estudiantes: ");
        int numEstudiantes = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        // Bucle para registrar varios estudiantes
        for (int e = 1; e <= numEstudiantes; e++) {
            System.out.print("\nIngrese el nombre del estudiante " + e + ": ");
            String nombreEstudiante = scanner.nextLine();
            Estudiante estudiante = new Estudiante(nombreEstudiante);

            System.out.print("Ingrese el número de asignaturas para " + nombreEstudiante + ": ");
            int numAsignaturas = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            // Bucle para registrar varias asignaturas
            for (int i = 1; i <= numAsignaturas; i++) {
                System.out.print("Ingrese el nombre de la asignatura " + i + ": ");
                String nombreAsignatura = scanner.nextLine();
                Asignatura asignatura = new Asignatura(nombreAsignatura);

                System.out.print("Ingrese el número de notas para " + nombreAsignatura + ": ");
                int numNotas = scanner.nextInt();

                // Bucle para ingresar varias notas en una asignatura
                for (int j = 1; j <= numNotas; j++) {
                    System.out.print("Ingrese la nota " + j + ": ");
                    double nota = scanner.nextDouble();
                    asignatura.agregarNota(nota);
                }
                scanner.nextLine(); // Limpiar buffer

                estudiante.agregarAsignatura(asignatura); // Agregar la asignatura al estudiante
            }

            estudiantes.add(estudiante); // Agregar el estudiante a la lista
        }

        // Mostrar promedios de todos los estudiantes
        System.out.println("\n📌 Promedios de los estudiantes:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println("🔹 " + estudiante.getNombre() + " - Promedio General: " + estudiante.calcularPromedioGeneral());
        }

        scanner.close(); // Cerrar el scanner
    }
}