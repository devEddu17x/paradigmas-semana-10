package control;

import DB.ConexionDB;
import entidades.Cita;
import entidades.Emergencia;
import entidades.Mascota;
import entidades.Producto;
import entidades.Quirurgica;
import java.util.HashMap;
import java.util.List;

public class CitasControlador {

    private static ConexionDB conexion;

    public static boolean insertarCita(String motivo, String condicion, String temp, String pes, String tall, String diagnostico,
            String tratamiento, Mascota mascota, HashMap<Producto, Integer> productosUsados) {
        double temperatura = -1, peso = -1, talla = -1;
        if (mascota == null) {
            return false;
        }
        try {

            temperatura = Double.parseDouble(temp);
            peso = Double.parseDouble(pes);
            talla = Double.parseDouble(tall);
        } catch (NumberFormatException e) {
            System.out.println("Error al formatear numero: ");
            System.out.println(e.getMessage());
        }

        if (temperatura <= 0 || peso <= 0 || talla <= 0) {
            return false;
        }
        Cita c = new Cita(motivo, condicion, temperatura, peso, talla, diagnostico, tratamiento, mascota, productosUsados);
        conexion.insertarCita(c);
        return true;
    }

    public static boolean insertarCita(String motivo, String condicion, String temp, String pes, String tall, String diagnostico,
            String tratamiento, Mascota mascota, HashMap<Producto, Integer> productosUsados, String procedimientosAdicionales) {
        double temperatura = -1, peso = -1, talla = -1;
        if (mascota == null) {
            return false;
        }
        try {

            temperatura = Double.parseDouble(temp);
            peso = Double.parseDouble(pes);
            talla = Double.parseDouble(tall);
        } catch (NumberFormatException e) {
            System.out.println("Error al formatear numero: ");
            System.out.println(e.getMessage());
        }

        if (temperatura <= 0 || peso <= 0 || talla <= 0) {
            return false;
        }
        Cita c = new Emergencia(motivo, condicion, temperatura, peso, talla, diagnostico, tratamiento, mascota, productosUsados, procedimientosAdicionales);
        conexion.insertarCita(c);
        return true;
    }

    public static boolean insertarCita(String motivo, String condicion, String temp, String pes, String tall, String diagnostico,
            String tratamiento, Mascota mascota, HashMap<Producto, Integer> productosUsados, String instruccionesPreOperatorias, String instruccionesPostOperatorias) {
        double temperatura = -1, peso = -1, talla = -1;
        if (mascota == null) {
            return false;
        }
        try {

            temperatura = Double.parseDouble(temp);
            peso = Double.parseDouble(pes);
            talla = Double.parseDouble(tall);
        } catch (NumberFormatException e) {
            System.out.println("Error al formatear numero: ");
            System.out.println(e.getMessage());
        }

        if (temperatura <= 0 || peso <= 0 || talla <= 0) {
            return false;
        }
        Cita c = new Quirurgica(motivo, condicion, temperatura, peso, talla, diagnostico, tratamiento, mascota, productosUsados, instruccionesPreOperatorias, instruccionesPostOperatorias);
        conexion.insertarCita(c);
        return true;
    }

    public static List<Cita> getCitas() {
        conexion = ConexionDB.getInstance();
        return conexion.getCitas();
    }

    public static Cita getCita(int id) {
        conexion = ConexionDB.getInstance();
        if (id <= 0) {
            return null;

        }
        return conexion.getCita(id);
    }

    public static List<Quirurgica> getCitasQuirurgicas() {
        conexion = ConexionDB.getInstance();
        return conexion.getCitasQuirurgicas();
    }

    public static List<Emergencia> getCitasEmergencias() {
        conexion = ConexionDB.getInstance();
        return conexion.getCitasEmergencias();
    }

}
