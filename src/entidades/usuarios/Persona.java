package entidades.usuarios;

public class Persona {
    private String nombre;
    private String apellidoP;
    private String apellidoM;

    public Persona(String nombre, String apellidoP, String apellidoM) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }
}
