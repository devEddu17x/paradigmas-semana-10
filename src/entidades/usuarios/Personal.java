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

}
