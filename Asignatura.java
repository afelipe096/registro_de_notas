import java.util.ArrayList;
import java.util.List;

class Asignatura {
    private final String nombre; // Nombre de la asignatura
    private final List<Double> notas; // Lista de notas parciales

    // Constructor
    public Asignatura(String nombre) {
        this.nombre = nombre;
        this.notas = new ArrayList<>();
    }

    // Método para agregar una nota parcial
    public void agregarNota(double nota) {
        if (notas.size() < 3) { // Solo se permiten tres notas parciales
            notas.add(nota);
        } else {
            System.out.println("No se pueden agregar más de tres notas.");
        }
    }

    // Método para calcular la nota definitiva de la asignatura
    public double calcularNotaDefinitiva() {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return notas.isEmpty() ? 0 : suma / notas.size();
    }

    // Getters
    public String getNombre() { return nombre; }
    public List<Double> getNotas() { return notas; }
}
