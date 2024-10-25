package entidades.usuarios;

import java.util.LinkedList;
import java.util.List;
import entidades.otros.Mascota;

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
}
