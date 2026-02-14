public class Alumno extends Persona { // extends- aplica la Herencia
    private String carnet;   // private- aplica el Encapsulamiento
    private double promedio;

    public Alumno(String nombre, String carnet, double promedio) {
        super(nombre); // Llama al constructor del padre (Persona)
        this.carnet = carnet;
        this.promedio = promedio;
    }

    public String getCarnet() { return carnet; }

    @Override
    public String toString() {
        return "Alumno: " + nombre + " | Carnet: " + carnet + " | Promedio: " + promedio;
    }
}