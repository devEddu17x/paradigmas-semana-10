package entidades.servicio;

import java.time.LocalTime;
import java.util.HashMap;

import entidades.otros.Mascota;
import entidades.otros.Producto;

public class Emergencia extends Cita {
    private String procedimientosAdicionales;

    public Emergencia(String motivo, String condicion, double temperatura, double peso, double talla,
            String diagnostico, String tratamiento, Mascota mascota, HashMap<Producto, Integer> productosUsados,
            String procedimientosAdicionales) {
        super(motivo, condicion, temperatura, peso, talla, diagnostico, tratamiento, mascota, productosUsados);
        this.procedimientosAdicionales = procedimientosAdicionales;
    }

}
