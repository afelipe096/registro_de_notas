import java.util.ArrayList;
import java.util.List;

// Clase Asignatura que representa una materia con sus notas
class Asignatura {
    private String nombre;
    private List<Double> notas; // Lista de notas de la asignatura

    // Constructor que inicializa el nombre y la lista de notas
    public Asignatura(String nombre) {
        this.nombre = nombre;
        this.notas = new ArrayList<>();
    }

    // Método para agregar una nota, asegurando que esté entre 0 y 5
    public void agregarNota(double nota) {
        if (nota >= 0 && nota <= 5) {
            notas.add(nota);
        } else {
            System.out.println("⚠️ La nota debe estar entre 0 y 5.");
        }
    }

    // Método para calcular el promedio de las notas de la asignatura
    public double calcularNotaDefinitiva() {
        if (notas.isEmpty()) return 0; // Si no hay notas, retorna 0
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.size(); // Promedio de las notas
    }

    // Método para obtener el nombre de la asignatura
    public String getNombre() {
        return nombre;
    }
}