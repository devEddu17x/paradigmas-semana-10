package entidades;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class Mascota {

    private int numeroExpediente;
    private String nombre;
    private String especie;
    private LocalDate nacimiento; // para no necesitar actualizar la edad, solo calcularla

    private Dueño dueño;
    private List<Cita> historialClinico;

    public Mascota(String nombre, String especie, LocalDate nacimiento, Dueño dueño) {
        this.numeroExpediente = (int) UUID.randomUUID().getMostSignificantBits();
        this.nombre = nombre;
        this.especie = especie;
        this.nacimiento = nacimiento;
        this.dueño = dueño;
        historialClinico = new LinkedList<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }

    public void añadirCita(Cita cita) {
        this.historialClinico.add(cita);
    }

    public int getNumeroExpediente() {
        return numeroExpediente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public List<Cita> getHistorialClinico() {
        return historialClinico;
    }

}
