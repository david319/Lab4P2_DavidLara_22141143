public class Familia {

    // Atributos
    protected String apellido;


    public Familia(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public String toString() {
        return "Familia " + apellido;
    }

}
