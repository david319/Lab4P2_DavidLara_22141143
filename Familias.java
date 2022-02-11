import java.util.ArrayList;
import java.util.Scanner;

public class Familias {
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    // Atributos
    String apellido;
    protected static ArrayList<Familia> familias = new ArrayList<>();

    // Métodos
    public static void crearFamilia(){
        System.out.println("Introduce el apellido de la familia:");
        String apellido = leer.next().toUpperCase();
        Familia familia = new Familia(apellido);
        familias.add(familia);
    }

    public static void listarFamilias(){
        for(Familia familia : familias){
            System.out.println("Familia:\n" + familia.toString() + Aldeanos.aldeanos.toString());
        }
    }
}
