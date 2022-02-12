import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Aldeanos extends Familias {
    protected static ArrayList<Aldeano> aldeanos = new ArrayList<>();
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
            } else if (option == 2) {
                System.out.println("Ingrese el discurso de paz:");
                String peaceSpeech = leer.next();
                Aldeano aldeano = new Aldeano.Pacifista(name, lastName, age, health, peaceSpeech);
                aldeanos.add(aldeano);
            } else if (option == 3) {
                Aldeano aldeano = new Aldeano.Herrero(name, lastName, age, health);
                aldeanos.add(aldeano);
            } else if (option == 4) {
                Aldeano aldeano = new Aldeano.Agronomo(name, lastName, age, health);
                aldeanos.add(aldeano);
            } else {
                System.out.println("El apellido no coincide con ninguna familia");
            }
        }
    }



    public static void Atacar() {
        Familias.randomFamilias("Montesco");
        System.out.println("Ingrese el apellido de la familia a pelear:");
        String familia = leer.next().toUpperCase();
        Familias.randomFamilias(familia);
        if (Familias.buscarFamilia(familia)) {
            for (int i = 0; i < aldeanos.size(); i++) {
                if (Objects.equals(aldeanos.get(i).getApellido(), familia)) {
                    String aldeanoAtacar = aldeanos.get(i).getName();
                    System.out.println(aldeanoAtacar);
                    for (int j = 0; j < aldeanos.size(); j++) {
                        String aldeanoAtacado = aldeanos.get(j).getName();
                        System.out.println(aldeanoAtacado);
                        if (Objects.equals(aldeanos.get(j).getApellido(), "MONTESCO")) {
                            do {
                                aldeanos.get(j).setVida(aldeanos.get(j).getVida() - aldeanos.get(i).getAtaque());
                                System.out.println(aldeanoAtacar + " ataca a " + aldeanos.get(j).getName() + " haciéndole " + aldeanos.get(j).getAtaque() + " de daño" +
                                        " dejándolo con " + aldeanos.get(j).getVida() + " de vida");
                                System.out.println(aldeanoAtacado + " ataca a " + aldeanos.get(i).getName() + " haciéndole " + aldeanos.get(i).getAtaque() + " de daño" +
                                        " dejándolo con " + aldeanos.get(i).getVida() + " de vida");
                                aldeanos.get(i).setVida(aldeanos.get(i).getVida() - aldeanos.get(j).getAtaque());
                            } while (aldeanos.get(j).getVida() > 0 && aldeanos.get(i).getVida() > 0);
                            if (aldeanos.get(j).getVida() <= 0) {
                                System.out.println(aldeanoAtacado + " ha muerto");
                                aldeanos.remove(j);
                            } else if (aldeanos.get(i).getVida() <= 0) {
                                System.out.println(aldeanoAtacar + " ha muerto");
                                aldeanos.remove(i);
                            }
                        }
                    }
                }
            }
        }
    }

}
