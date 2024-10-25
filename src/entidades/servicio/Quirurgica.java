package entidades.servicio;

import java.time.LocalTime;
import java.util.HashMap;

import entidades.otros.Mascota;
import entidades.otros.Producto;

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

}
