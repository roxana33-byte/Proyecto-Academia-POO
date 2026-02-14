import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestionAcademia academia = new GestionAcademia(); // import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestionAcademia academia = new GestionAcademia(); // Instanciamos el cerebro
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- MENÚ ACADEMIA DE COMPUTACIÓN ---");
            System.out.println("1. Inscribir Alumno");
            System.out.println("2. Ver Lista de Alumnos");
            System.out.println("3. Buscar Alumno por Carnet");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer de teclado

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Carnet: ");
                    String carnet = sc.nextLine();
                    System.out.print("Promedio: ");
                    double promedio = sc.nextDouble();

                    Alumno nuevo = new Alumno(nombre, carnet, promedio);
                    if (academia.inscribirAlumno(nuevo)) {
                        System.out.println(">>> Alumno inscrito con éxito.");
                    } else {
                        System.out.println(">>> ERROR: El carnet ya existe.");
                    }
                    break;

                case 2:
                    academia.listarAlumnos();
                    break;

                case 3:
                    System.out.print("Ingrese carnet a buscar: ");
                    String busqueda = sc.nextLine();
                    Alumno encontrado = academia.buscarPorCarnet(busqueda);
                    if (encontrado != null) {
                        System.out.println("Encontrado: " + encontrado);
                    } else {
                        System.out.println("No se encontró ningún alumno con ese carnet.");
                    }
                    break;

                case 4:
                    salir = true;
                    System.out.println("Cerrando sistema...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }
        sc.close();
    }
}
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- MENÚ ACADEMIA DE COMPUTACIÓN ---");
            System.out.println("1. Inscribir Alumno");
            System.out.println("2. Ver Lista de Alumnos");
            System.out.println("3. Buscar Alumno por Carnet");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer de teclado

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Carnet: ");
                    String carnet = sc.nextLine();
                    System.out.print("Promedio: ");
                    double promedio = sc.nextDouble();

                    Alumno nuevo = new Alumno(nombre, carnet, promedio);
                    if (academia.inscribirAlumno(nuevo)) {
                        System.out.println(">>> Alumno inscrito con éxito.");
                    } else {
                        System.out.println(">>> ERROR: El carnet ya existe.");
                    }
                    break;

                case 2:
                    academia.listarAlumnos();
                    break;

                case 3:
                    System.out.print("Ingrese carnet a buscar: ");
                    String busqueda = sc.nextLine();
                    Alumno encontrado = academia.buscarPorCarnet(busqueda);
                    if (encontrado != null) {
                        System.out.println("Encontrado: " + encontrado);
                    } else {
                        System.out.println("No se encontró ningún alumno con ese carnet.");
                    }
                    break;

                case 4:
                    salir = true;
                    System.out.println("Cerrando sistema...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }
        sc.close();
    }
}