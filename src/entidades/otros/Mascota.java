package entidades.otros;

import java.time.LocalDate;
import java.util.UUID;
import java.util.List;
import java.util.LinkedList;
import entidades.servicio.Cita;
import entidades.usuarios.Dueño;

public class Mascota {
    private String numeroExpediente;
    private String nombre;
    private String especie;
    private LocalDate nacimiento; // para no necesitar actualizar la edad, solo calcularla

    private Dueño dueño;
    private List<Cita> historialClinico;

    public Mascota(String nombre, String especie, LocalDate nacimiento, Dueño dueño) {
        this.numeroExpediente = UUID.randomUUID().getMostSignificantBits() + "";
        this.nombre = nombre;
        this.especie = especie;
        this.nacimiento = nacimiento;
        this.dueño = dueño;
        historialClinico = new LinkedList<>();
    }
}
