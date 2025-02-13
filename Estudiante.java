import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private List<Asignatura> asignaturas; // Lista de asignaturas del estudiante

    // Constructor que inicializa el nombre y la lista de asignaturas
    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.asignaturas = new ArrayList<>(); // Ahora sí reconoce ArrayList
    }

    // Método para agregar una asignatura al estudiante
    public void agregarAsignatura(Asignatura asignatura) {
        asignaturas.add(asignatura);
    }

    // Método para calcular el promedio general del estudiante
    public double calcularPromedioGeneral() {
        if (asignaturas.isEmpty()) return 0; // Si no tiene asignaturas, retorna 0

        double suma = 0;
        for (Asignatura asignatura : asignaturas) {
            suma += asignatura.calcularNotaDefinitiva();
        }
        return suma / asignaturas.size(); // Promedio de las notas definitivas
    }

    // Método para obtener el nombre del estudiante
    public String getNombre() {
        return nombre;
    }
}
