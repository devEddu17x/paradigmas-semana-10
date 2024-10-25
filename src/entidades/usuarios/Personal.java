package entidades.usuarios;

import java.util.List;
import java.util.ArrayList;

public class Personal {
    private String cargo;
    private List<String> tareas;
    private String horario;
    private double nomina;

    public Personal(String cargo, ArrayList<String> tareas, String horario) {
        this.cargo = cargo;
        this.tareas = tareas;
        this.horario = horario;
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
