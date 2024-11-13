package datos;

import entidades.Dueño;
import entidades.Persona;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Usuarios {

    private List<Persona> usuarios = new LinkedList<>();

    public Usuarios() {
        usuarios.add(new Dueño("Eddu", "Mamani", "Azabache", "12345678", "+51 933460321", "G202"));
        usuarios.add(new Dueño("Elmer", "Moreno", "Agreda", "98799654", "+51 999999999", "G203"));

    }

    public Dueño getDueño(String dni) {
        Iterator<Persona> it = usuarios.iterator();
        Persona p;
        while (it.hasNext()) {
            p = (Persona) it.next();
            if (p instanceof Dueño dueño && dueño.getDni().equals(dni)) {
                return dueño;
            }
        }
        return null;
    }
}
