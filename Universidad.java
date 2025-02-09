
import java.util.ArrayList;
import java.util.List;

// Clase Universidad que maneja la lista de estudiantes
class Universidad {
    private final List<Estudiante> estudiantes;

    // Constructor
    public Universidad() {
        this.estudiantes = new ArrayList<>();
    }

    // Método para agregar un estudiante a la universidad
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    // Método para verificar si un ID ya está registrado
    public boolean existeEstudiante(int id) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getId() == id) {
                return true;
            }
        }
        return false;
    }

    // Método para calcular el promedio de una asignatura entre todos los estudiantes
    public double calcularPromedioPorAsignatura(String nombreAsignatura) {
        double suma = 0;
        int contador = 0;
        for (Estudiante estudiante : estudiantes) {
            for (Asignatura asignatura : estudiante.getAsignaturas()) {
                if (asignatura.getNombre().equals(nombreAsignatura)) {
                    suma += asignatura.calcularNotaDefinitiva();
                    contador++;
                }
            }
        }
        return contador == 0 ? 0 : suma / contador;
    }

    // Getters
    public List<Estudiante> getEstudiantes() { return estudiantes; }
}
