public class Aldeano {

    protected String nombre;
    protected String apellido;
    protected int edad;
    protected int vida;
    protected int ataque;


    public Aldeano(String nombre, String apellido, int edad, int vida) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.vida = vida;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public static class Normal extends Aldeano {
        int ataque;

        public Normal(String nombre, String apellido, int edad, int vida) {
            super(nombre, apellido, edad, vida);
            this.vida = vida;
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
        int ataque;

        public Herrero(String nombre, String apellido, int edad, int vida) {
            super(nombre, apellido, edad, vida);
            super.vida = (int) (vida + (vida * 0.5));
            ataque = (int) (Math.random() * 500) + 200;
        }
    }

    public static class Agronomo extends Aldeano {
        int ataque;

        public Agronomo(String nombre, String apellido, int edad, int vida) {
            super(nombre, apellido, edad, vida);
            ataque = 100;
        }
    }

    public static class Explosivo extends Aldeano {
        int ataque;

        public Explosivo(String nombre, String apellido, int edad, int vida) {
            super(nombre, apellido, edad, vida);
            ataque = 250;
        }
    }

    public static class SuperGranjero extends Aldeano {
        int ataque;

        public SuperGranjero(String nombre, String apellido, int edad, int vida) {
            super(nombre, apellido, edad, vida);
            super.vida = 1000;
            ataque = 1000;
        }
    }

    public String name() {
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
