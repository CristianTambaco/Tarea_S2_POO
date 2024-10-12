import java.util.Scanner;

public class EMPLEADO {

    class Empleado {
        String nombre;
        String cargo;
        double salario;
        String fechaIngreso;

        public Empleado(String nombre, String cargo, double salario, String fechaIngreso) {
            this.nombre = nombre;
            this.cargo = cargo;
            this.salario = salario;
            this.fechaIngreso = fechaIngreso;
        }

        public void mostrarInfo() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Cargo: " + cargo);
            System.out.println("Salario: $" + salario);
            System.out.println("Fecha de ingreso: " + fechaIngreso);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EMPLEADO gestion = new EMPLEADO(); // Crear instancia

        // Crear tres empleados
        Empleado[] empleados = new Empleado[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese los detalles del empleado " + (i + 1) );

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Cargo: ");
            String cargo = scanner.nextLine();

            System.out.print("Salario: ");
            double salario = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Fecha de ingreso (DD/MM/AAAA): ");
            String fechaIngreso = scanner.nextLine();

            // Crear el objeto
            empleados[i] = gestion.new Empleado(nombre, cargo, salario, fechaIngreso);
        }

        // Mostrar información
        System.out.println("\nInformación de los empleados:");
        for (Empleado empleado : empleados) {
            empleado.mostrarInfo();
            System.out.println();
        }

        scanner.close();
    }
}
