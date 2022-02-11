import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Familias {
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    // Atributos
    protected static ArrayList<Familia> familias = new ArrayList<>();

    // Métodos
    public static void crearFamilia(){
        System.out.println("Introduce el apellido de la familia:");
        String apellido = leer.next().toUpperCase();
        Familia familia = new Familia(apellido);
        familias.add(familia);
    }

    public static boolean buscarFamilia(String apellido){
        for(Familia familia : familias){
            if(familia.getApellido().equals(apellido)){
                return true;
            }
        }
        return false;
    }

    public static void randomFamilias(String apellido){
        for(Familia familia : familias){
            if(familia.getApellido().equals(apellido)){
                Collections.shuffle(familias);
            }
        }
    }

    public static void familiasDefault(){
        Familia familia = new Familia("MONTESCO");
        Familia familia2 = new Familia("CAPULETO");
        Familia familia3 = new Familia("PEREZ");
        familias.add(familia);
        familias.add(familia2);
        familias.add(familia3);
    }

    public static void listarFamilias(){
        for(Familia familia : familias){
            System.out.println("Familia:\n" + familia.toString() + Aldeanos.aldeanos.toString());
        }
    }
}
