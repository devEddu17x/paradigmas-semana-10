package entidades;

import java.util.List;

public class Personal extends Persona {

    private String cargo;
    private List<String> tareas;
    private String horario;
    private double nomina;

    public Personal(String cargo, String horario, double nomina, String nombre, String apellidoP, String apellidoM) {
        super(nombre, apellidoP, apellidoM);
        this.cargo = cargo;
        this.horario = horario;
        this.nomina = nomina;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setTareas(List<String> tareas) {
        this.tareas = tareas;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setNomina(double nomina) {
        this.nomina = nomina;
    }

    public String getCargo() {
        return cargo;
    }

    public List<String> getTareas() {
        return tareas;
    }

    public String getHorario() {
        return horario;
    }

    public double getNomina() {
        return nomina;
    }

}
