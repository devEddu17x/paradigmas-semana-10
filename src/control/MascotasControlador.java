package control;

import DB.ConexionDB;
import entidades.Dueño;
import entidades.Mascota;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.List;

public class MascotasControlador {

    private static ConexionDB conexion;

    public static boolean agregarMascota(String nombre, String especie, int dia, int mes, int año, Dueño dueño) {
        try {
            conexion = ConexionDB.getInstance();
            LocalDate fechaNacimiento = LocalDate.of(año, mes, dia);
            if (dueño == null) {
                throw new IllegalArgumentException("El dueño es null");
            }
            Mascota mascota = new Mascota(nombre, especie, fechaNacimiento, dueño);
            conexion.insertarMascota(mascota);
        } catch (DateTimeException e) {
            System.out.println("""
                               Error al crear fecha de nacimiento: 
                               """ + e.getMessage());
            return false;
        } catch (IllegalArgumentException e) {
            System.out.println("""
                               Error al crear mascota
                               """ + e.getMessage());
            return false;
        }
        return true;
    }

    public static Mascota getMascotaNumeroExp(String numero) {
        int expediente = -1;
        try {
            expediente = Integer.parseInt(numero);

        } catch (NumberFormatException e) {
            System.out.println("Error al parsear numero de expediente:");
            System.out.println(e.getMessage());
            return null;
        }

        if (expediente <= 0) {
            return null;
        }
        return conexion.getMascota(expediente);
    }

    public static List<Mascota> getMascotas() {
        conexion = ConexionDB.getInstance();
        List<Mascota> lista = List.copyOf(conexion.getMascotas().values());
        return lista;
    }
}
