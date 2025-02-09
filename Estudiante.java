import java.util.ArrayList;
import java.util.List;

// Clase que representa a un estudiante
class Estudiante {
    private final int id; // Identificador único del estudiante
    private final String nombre; // Nombre del estudiante
    private final List<Asignatura> asignaturas; // Lista de asignaturas del estudiante

    // Constructor
    public Estudiante(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.asignaturas = new ArrayList<>();
    }

    // Método para agregar una asignatura al estudiante
    public void agregarAsignatura(Asignatura asignatura) {
        asignaturas.add(asignatura);
    }

    // Método para calcular el promedio general del estudiante
    public double calcularPromedioGeneral() {
        double suma = 0;
        for (Asignatura asignatura : asignaturas) {
            suma += asignatura.calcularNotaDefinitiva();
        }
        return asignaturas.isEmpty() ? 0 : suma / asignaturas.size();
    }

    // Getters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public List<Asignatura> getAsignaturas() { return asignaturas; }
}
