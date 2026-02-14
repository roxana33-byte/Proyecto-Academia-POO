import java.util.ArrayList;

public class GestionAcademia {
    // Encapsulamiento, La lista es privada, nadie fuera de esta clase puede tocarla
    private ArrayList<Alumno> listaAlumnos;

    public GestionAcademia() {
        this.listaAlumnos = new ArrayList<>();
    }

    // Lógica de Negocio, Inscribir con validación de carnet
    public boolean inscribirAlumno(Alumno nuevoAlumno) {
        for (Alumno a : listaAlumnos) {
            if (a.getCarnet().equalsIgnoreCase(nuevoAlumno.getCarnet())) {
                return false; // Error, El carnet ya existe, no se inscribe
            }
        }
        listaAlumnos.add(nuevoAlumno);
        return true; // Éxito, Se agrego correctamente
    }

    // Lógica de Negocio, Listar todos los alumnos
    public void listarAlumnos() {
        if (listaAlumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados actualmente.");
        } else {
            System.out.println("\n--- LISTADO DE ESTUDIANTES ---");
            for (Alumno a : listaAlumnos) {
                System.out.println(a.toString());
            }
        }
    }

    // Lógica de Negocio, Buscar un alumno específico
    public Alumno buscarPorCarnet(String carnet) {
        for (Alumno a : listaAlumnos) {
            if (a.getCarnet().equalsIgnoreCase(carnet)) {
                return a; // Lo encontramos
            }
        }
        return null; // No existe
    }
} 