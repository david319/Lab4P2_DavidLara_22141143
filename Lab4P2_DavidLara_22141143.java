import java.util.Scanner;

public class Lab4P2_DavidLara_22141143 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        // Declaración de variables
        int option;

        // iniciar familias por defecto
        Familias.familiasDefault();

        do {
            System.out.println("""
                    Menu de opciones
                    0. Salir
                    1. Crear una familia
                    2. Crear un aldeano
                    3. Listar familias
                    4. Pelear
                    Seleccione una opción:""");
            option = leer.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Crear una familia");
                    Familias.crearFamilia();
                    break;
                case 2:
                    System.out.println("Crear un aldeano");
                    Aldeanos.crearAldeano();
                    break;
                case 3:
                    System.out.println("Listar familias");
                    Familias.listarFamilias();
                    break;
                case 4:
                    System.out.println("Pelear");
                    Pelea.Pelear();
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (option != 0);
    }
}
