import java.util.Scanner;

public class Pelea {
    static Scanner leer = new Scanner(System.in);

    public static void Pelear() {
        System.out.println("Ingrese la familia a pelear contra los Montesco:");
        String familia = leer.next().toUpperCase();
            Familias.randomFamilias(familia);
            Familias.randomFamilias("Montesco");
            String peleador1 = Aldeanos.getAldeanos(familia);
            int vida1 = Aldeanos.getVida(peleador1);
            int ataque1 = Aldeanos.getAtaque(peleador1);
            Aldeanos.getAldeanos("MONTESCO");
            String peleador2 = Aldeanos.getAldeanos("MONTESCO");
            int vida2 = Aldeanos.getVida(peleador2);
            int ataque2 = Aldeanos.getAtaque(peleador2);

            System.out.println(familia + " VS " + "MONTESCO");
            if (ataque1 < vida2) {
                vida2 = vida2 - ataque1;
                System.out.println(peleador1 + " ataca a " + peleador2 + " y le quita " + ataque1 + " de vida");
                vida2 = vida2 - ataque1;
                System.out.println(peleador2 + " le quita " + ataque1 + " de vida");
                if (vida2 <= 0) {
                    System.out.println(peleador1 + " ganado");
                    Aldeanos.Remove(peleador2);
                } else if (vida1 <= 0) {
                    System.out.println(peleador2 + " ganado");
                    Aldeanos.Remove(peleador1);
                }
            } else if (ataque1 > vida2) {
                System.out.println(peleador1 + " ataca a " + peleador2 + " y le quita " + vida2 + " de vida");
                vida2 = vida2 - ataque1;
                if (vida2 <= 0) {
                    System.out.println(peleador1 + " ganado");
                    Aldeanos.Remove(peleador2);
                }
            } else if (ataque2 < vida1) {
                vida1 = vida1 - ataque2;
                System.out.println(peleador2 + " ataca a " + peleador1 + " y le quita " + ataque2 + " de vida");
                System.out.println(peleador1 + " le quita " + ataque2 + " de vida");
                if (vida1 <= 0) {
                    System.out.println(peleador2 + " ganado");
                    Aldeanos.Remove(peleador1);
                } else if (vida2 <= 0) {
                    System.out.println(peleador1 + " ganado");
                    Aldeanos.Remove(peleador2);
                }
            }

            if (Aldeanos.getAldeanos("MONTESCO").equals(null)) {
                System.out.println("La familia " + familia + " a ganado");
            } else if (Aldeanos.getAldeanos(familia).equals(null)) {
                System.out.println("La familia " + "MONTESCO" + " a ganado");
            }
    }

}
