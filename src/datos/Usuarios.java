package datos;

import entidades.Dueño;
import entidades.Persona;
import entidades.Personal;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Usuarios {

    private List<Persona> usuarios = new LinkedList<>();

    public Usuarios() {
        // dueños
        usuarios.add(new Dueño("Eddu", "Mamani", "Azabache", "12345678", "+51 933460321", "G202"));
        usuarios.add(new Dueño("Elmer", "Moreno", "Agreda", "98799654", "+51 999999999", "G203"));
        // personal
        usuarios.add(new Personal("Veterinario", "9:00 - 17:00", 3000.00, "Juan", "Pérez", "Gómez"));
        usuarios.add(new Personal("Veterinario", "10:00 - 18:00", 3200.00, "Ana", "López", "Martínez"));
        usuarios.add(new Personal("Asistente", "8:00 - 16:00", 2000.00, "Carlos", "Ramírez", "Hernández"));
        usuarios.add(new Personal("Asistente", "11:00 - 19:00", 2100.00, "Lucía", "Torres", "Sánchez"));
        usuarios.add(new Personal("Limpieza", "7:00 - 15:00", 1500.00, "Pedro", "García", "Vásquez"));
        usuarios.add(new Personal("Limpieza", "8:00 - 16:00", 1600.00, "María", "Fernández", "Jiménez"));
        usuarios.add(new Personal("Veterinario", "9:30 - 17:30", 3100.00, "Javier", "Díaz", "Salazar"));
        usuarios.add(new Personal("Asistente", "12:00 - 20:00", 2200.00, "Elena", "Mendoza", "Ríos"));
        usuarios.add(new Personal("Limpieza", "6:30 - 14:30", 1400.00, "Sofía", "Ponce", "Cruz"));
        usuarios.add(new Personal("Veterinario", "8:30 - 16:30", 3300.00, "Ricardo", "Cordero", "Blanco"));
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

    public LinkedList<Dueño> getDueños() {
        LinkedList<Dueño> dueños = new LinkedList<>();
        for (Persona p : usuarios) {
            if (p instanceof Dueño dueño) {
                dueños.add(dueño);
            }
        }
        return dueños;
    }

    public void insertarDueño(Dueño dueño) {
        usuarios.add(dueño);
    }

    public void insertarPersonal(Personal personal) {
        usuarios.add(personal);
    }

    public LinkedList<Personal> getPersonal() {
        LinkedList<Personal> empleados = new LinkedList<>();
        for (Persona p : usuarios) {
            if (p instanceof Personal personal) {
                empleados.add(personal);
            }
        }
        return empleados;
    }

    public List<Personal> getPersonalCargo(String cargo) {
        LinkedList<Personal> empleados = new LinkedList<>();
        for (Persona p : usuarios) {
            if (p instanceof Personal personal && personal.getCargo().equals(cargo)) {
                empleados.add(personal);
            }
        }
        return empleados;
    }
}
