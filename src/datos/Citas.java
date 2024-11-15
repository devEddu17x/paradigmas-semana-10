package datos;

import entidades.Cita;
import entidades.Emergencia;
import entidades.Quirurgica;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Citas {

    private List<Cita> citas = new LinkedList<>();

    public void insertarCita(Cita cita) {
        citas.add(cita);
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public Cita getCita(int id) {

        Optional<Cita> cita = citas.stream().filter(c -> c.getId() == id).findFirst();
        if (cita.isPresent()) {
            return cita.get();
        }
        return null;
    }

    public List<Quirurgica> getCitasQuirurgicas() {
        List<Quirurgica> citasQuirurgicas = new LinkedList<>();
        for (Cita cita : citas) {
            if (cita instanceof Quirurgica quiru) {
                citasQuirurgicas.add(quiru);
            }
        }
        return citasQuirurgicas;
    }

    public List<Emergencia> getCitasEmergencias() {
        List<Emergencia> citasEmergencias = new LinkedList<>();
        for (Cita cita : citas) {
            if (cita instanceof Emergencia emergemcoa) {
                citasEmergencias.add(emergemcoa);
            }
        }
        return citasEmergencias;

    }
}
