package entidades;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Cita {

    private int id;
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
    private List<Personal> personal = new LinkedList<>();

    public Cita(String motivo, String condicion, double temperatura, double peso, double talla, String diagnostico,
            String tratamiento, Mascota mascota, HashMap<Producto, Integer> productosUsados) {

        this.id = new Random().nextInt(9000) + 1000;
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

    public void setPersonal(List<Personal> personal) {
        this.personal = personal;
    }

    public List<Personal> getPersonal() {
        return personal;
    }

    public int getId() {
        return id;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public void añadirProducto(Map<Producto, Integer> productosUsados) {
        this.productosUsados = productosUsados;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public String getCondicion() {
        return condicion;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getPeso() {
        return peso;
    }

    public double getTalla() {
        return talla;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public Map<Producto, Integer> getProductosUsados() {
        return productosUsados;
    }

}
