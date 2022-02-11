import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Aldeanos extends Familias {
    static ArrayList<Aldeano> aldeanos = new ArrayList<>();
    static Scanner leer = new Scanner(System.in);

    public static void crearAldeano(){
        System.out.println("Ingrese el nombre:");
        String name = leer.next();
        System.out.println("Ingrese el apellido:");
        String lastName = leer.next().toUpperCase();
        if(Objects.equals(lastName, familias.get(0).getApellido())){
            System.out.println("Ingrese la edad:");
            int age = leer.nextInt();
            System.out.println("Ingrese los pts de vida:");
            int health = leer.nextInt();
            System.out.println("***** Tipo de Aldeano *****");
            System.out.println("""
                1. Normal
                2. Pacifista
                3. Herrero
                4. Agrónomo
                5. Explosivo
                Seleccione una opción:""");
            int option = leer.nextInt();

            if(option == 1){
                Aldeano aldeano = new Aldeano.Normal(name, lastName, age, health);
                aldeanos.add(aldeano);
                familias.get(0).add(aldeano);
            } else if(option == 2){
                System.out.println("Ingrese el discurso de paz:");
                String peaceSpeech = leer.next();
                Aldeano aldeano = new Aldeano.Pacifista(name, lastName, age, health, peaceSpeech);
                aldeanos.add(aldeano);
                familias.get(0).add(aldeano);
            } else if(option == 3){
                Aldeano aldeano = new Aldeano.Herrero(name, lastName, age, health);
                aldeanos.add(aldeano);
                familias.get(0).add(aldeano);
            } else if(option == 4){
                Aldeano aldeano = new Aldeano.Agronomo(name, lastName, age, health);
                aldeanos.add(aldeano);
                familias.get(0).add(aldeano);
            }
        } else {
            System.out.println("El apellido no coincide con ninguna familia");
        }
    }

}
