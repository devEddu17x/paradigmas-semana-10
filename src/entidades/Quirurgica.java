package entidades;

import java.time.LocalTime;
import java.util.HashMap;

public class Quirurgica extends Cita {

    private String instruccionesPreOperatorias;
    private String instruccionesPostOperatorias;
    private LocalTime hora;

    public Quirurgica(String motivo, String condicion, double temperatura, double peso, double talla,
            String diagnostico, String tratamiento, Mascota mascota, HashMap<Producto, Integer> productosUsados,
            String instruccionesPreOperatorias, String instruccionesPostOperatorias) {
        super(motivo, condicion, temperatura, peso, talla, diagnostico, tratamiento, mascota, productosUsados);
        this.hora = LocalTime.now();
        this.instruccionesPreOperatorias = instruccionesPreOperatorias;
        this.instruccionesPostOperatorias = instruccionesPostOperatorias;
    }

    public String getInstruccionesPreOperatorias() {
        return instruccionesPreOperatorias;
    }

    public void setInstruccionesPreOperatorias(String instruccionesPreOperatorias) {
        this.instruccionesPreOperatorias = instruccionesPreOperatorias;
    }

    public String getInstruccionesPostOperatorias() {
        return instruccionesPostOperatorias;
    }

    public void setInstruccionesPostOperatorias(String instruccionesPostOperatorias) {
        this.instruccionesPostOperatorias = instruccionesPostOperatorias;
    }

    public LocalTime getHora() {
        return hora;
    }

}
