import java.util.Collection;

public class Aldeano {

    String nombre;
    String apellido;
    int edad;
    int vida;
    int ataque;


    public Aldeano(String nombre, String apellido, int edad, int vida) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.vida = vida;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Collection<? extends Familia> getFamilias() {
        return Familias.familias;
    }

    public static class Normal extends Aldeano {

        public Normal(String nombre, String apellido, int edad, int vida) {
            super(nombre, apellido, edad, vida);
            ataque = 10;
        }
    }

    public static class Pacifista extends Aldeano {
        String discurso;

        public Pacifista(String nombre, String apellido, int edad, int vida, String discurso) {
            super(nombre, apellido, edad, vida);
            this.discurso = discurso;
        }
    }

    public static class Herrero extends Aldeano {

        public Herrero(String nombre, String apellido, int edad, int vida) {
            super(nombre, apellido, edad, vida);
            super.vida = (int) (vida + (vida * 0.5));
            ataque = (int) ((Math.random() * (500 - 200)) + 200);
        }
    }

    public static class Agronomo extends Aldeano {

        public Agronomo(String nombre, String apellido, int edad, int vida) {
            super(nombre, apellido, edad, vida);
            ataque = 100;
        }
    }

    public static class Explosivo extends Aldeano {

        public Explosivo(String nombre, String apellido, int edad, int vida) {
            super(nombre, apellido, edad, vida);
            ataque = 250;
        }
    }

    public static class SuperGranjero extends Aldeano {

        public SuperGranjero(String nombre, String apellido, int edad, int vida) {
            super(nombre, apellido, edad, vida);
            super.vida = 1000;
            ataque = 1000;
        }
    }

    public String getName() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public String toString() {
        return "Aldeano{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", vida=" + vida +
                ", ataque=" + ataque +
                '}';
    }
}
