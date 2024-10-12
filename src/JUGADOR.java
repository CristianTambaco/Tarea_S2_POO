import java.util.Scanner;

public class JUGADOR {

    class jugador {
        String nombre;
        String posicion;
        int edad;
        int numeroCamiseta;

        public jugador(String nombre, String posicion, int edad, int numeroCamiseta) {
            this.nombre = nombre;
            this.posicion = posicion;
            this.edad = edad;
            this.numeroCamiseta = numeroCamiseta;

        }

        public void mostrarInfo() {
            System.out.println("Nombre: "+ nombre);
            System.out.println("Posicion: "+ posicion);
            System.out.println("Edad: "+ edad );
            System.out.println("Número de camiseta: "+ numeroCamiseta);
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JUGADOR equipo = new JUGADOR(); //Crear instancia de JUGADOR

        jugador jugador1 = equipo.new jugador("Neymar Jr", "Delantero", 31, 11);

        System.out.println("Ingrese el nombre del segundo jugador: ");
        String nombre2 = scanner.nextLine();

        System.out.println("Ingrese la posicion del segundo jugador: ");
        String posicion2 = scanner.nextLine();

        System.out.println("Ingrese la edad del segundo jugador: ");
        int edad2 = scanner.nextInt();

        System.out.println("Ingrese el numero de camiseta del segundo jugador: ");
        int numeroCamiseta2 = scanner.nextInt();

        scanner.nextLine();

        jugador jugador2 = equipo.new jugador( nombre2, posicion2, edad2, numeroCamiseta2 );
        //Datos quemados jugador 3
        jugador jugador3 = equipo.new jugador("Neymar Jr", "Delantero", 31, 11 );

        System.out.println("\nInformacion de los jugadores: ");
        jugador1.mostrarInfo();

        System.out.println();
        jugador2.mostrarInfo();

        System.out.println();
        jugador3.mostrarInfo();

        scanner.close();



    }
}
