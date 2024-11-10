package entidades;

import java.util.LinkedList;
import java.util.List;

public class Dueño extends Persona {

    private String dni;
    private String telefono;
    private String direccion;

    private List<Mascota> mascotas;

    public Dueño(String nombre, String apellidoP, String apellidoM, String dni, String telefono, String direccion) {
        super(nombre, apellidoP, apellidoM);
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
        mascotas = new LinkedList<>();
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void añadirMascotas(Mascota mascota) {
        this.mascotas.add(mascota);
    }

    public String getDni() {
        return dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

}
