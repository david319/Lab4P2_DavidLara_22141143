import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Aldeanos extends Familias {
    static ArrayList<Aldeano> aldeanos = new ArrayList<>();
    static Scanner leer = new Scanner(System.in);

    public static void crearAldeano() {
        System.out.println("Ingrese el nombre:");
        String name = leer.next();
        System.out.println("Ingrese el apellido:");
        String lastName = leer.next().toUpperCase();
        if (buscarFamilia(lastName)) {
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

            if (option == 1) {
                Aldeano aldeano = new Aldeano.Normal(name, lastName, age, health);
                aldeanos.add(aldeano);
                familias.get(0).add(aldeano);
            } else if (option == 2) {
                System.out.println("Ingrese el discurso de paz:");
                String peaceSpeech = leer.next();
                Aldeano aldeano = new Aldeano.Pacifista(name, lastName, age, health, peaceSpeech);
                aldeanos.add(aldeano);
                familias.get(0).add(aldeano);
            } else if (option == 3) {
                Aldeano aldeano = new Aldeano.Herrero(name, lastName, age, health);
                aldeanos.add(aldeano);
                familias.get(0).add(aldeano);
            } else if (option == 4) {
                Aldeano aldeano = new Aldeano.Agronomo(name, lastName, age, health);
                aldeanos.add(aldeano);
                familias.get(0).add(aldeano);
            }
        } else {
            System.out.println("El apellido no coincide con ninguna familia");
        }
    }

    public static void aldeanosDefault() {
        Aldeano Romeo = new Aldeano.SuperGranjero("Romeo", "MONTESCO", 20, 1000);
        Aldeano Kevin = new Aldeano.Herrero("Kevin", "MONTESCO", 20, 500);
        Aldeano Mario = new Aldeano.Agronomo("Mario", "MONTESCO", 20, 300);
        Aldeano Julieta = new Aldeano.Normal("Julieta", "CAPULETO", 20, 1000);
        Aldeano Luis = new Aldeano.Agronomo("Luis", "CAPULETO", 20, 450);
        Aldeano Maria = new Aldeano.Pacifista("Maria", "CAPULETO", 20, 250, "Sea paz amigos");
        Aldeano Juan = new Aldeano.Normal("Juan", "PEREZ", 20, 300);
        Aldeano Marco = new Aldeano.Pacifista("Marco", "PEREZ", 20, 250, "No me molestes");
        aldeanos.add(Romeo);
        familias.get(0).add(Romeo);
        aldeanos.add(Kevin);
        familias.get(0).add(Kevin);
        aldeanos.add(Mario);
        familias.get(0).add(Mario);
        aldeanos.add(Julieta);
        familias.get(0).add(Julieta);
        aldeanos.add(Luis);
        familias.get(0).add(Luis);
        aldeanos.add(Maria);
        familias.get(0).add(Maria);
        aldeanos.add(Juan);
        familias.get(0).add(Juan);
        aldeanos.add(Marco);
        familias.get(0).add(Marco);
    }

    public static String getAldeanos(String familia) {
        for (int i = 0; i < aldeanos.size(); i++) {
            if (Objects.equals(aldeanos.get(i).getApellido(), familia)) {
                System.out.println(aldeanos.get(0).toString());
            }
        }
        return familia;
    }

    public static int getVida(String peleador1) {
        for (int i = 0; i < aldeanos.size(); i++) {
            if (Objects.equals(aldeanos.get(i).getApellido(), peleador1)) {
                return aldeanos.get(i).getVida();
            }
        }
        return 0;
    }

    public static int getAtaque(String peleador1) {
        for (int i = 0; i < aldeanos.size(); i++) {
            if (Objects.equals(aldeanos.get(i).getApellido(), peleador1)) {
                return aldeanos.get(i).getAtaque();
            }
        }
        return 0;
    }

    public static void Remove(String peleador1) {
        for (int i = 0; i < aldeanos.size(); i++) {
            if (Objects.equals(aldeanos.get(i).getApellido(), peleador1)) {
                aldeanos.remove(i);
            }
        }
    }

}
