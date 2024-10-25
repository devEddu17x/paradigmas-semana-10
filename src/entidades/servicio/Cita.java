package entidades.servicio;

import java.time.LocalDate;
import java.util.Map;
import java.util.HashMap;
import entidades.otros.Mascota;
import entidades.otros.Producto;

public class Cita {

    private LocalDate fecha;
    private String motivo;
    private String condicion;
    private double temperatura;
    private double peso;
    private double talla;
    private String diagnostico;
    private String tratamiento;

    private Mascota mascota;
    private Map<Producto, Integer> productosUsados;

    public Cita(String motivo, String condicion, double temperatura, double peso, double talla, String diagnostico,
            String tratamiento, Mascota mascota, HashMap<Producto, Integer> productosUsados) {
        this.fecha = LocalDate.now();
        this.motivo = motivo;
        this.condicion = condicion;
        this.temperatura = temperatura;
        this.peso = peso;
        this.talla = talla;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.mascota = mascota;
        this.productosUsados = productosUsados;
    }

}
