package control;

import DB.ConexionDB;
import entidades.Dueño;
import entidades.Mascota;
import java.time.DateTimeException;
import java.time.LocalDate;

public class MascotasControlador {

    private static ConexionDB conexion;

    public static boolean agregarMascota(String nombre, String especie, int dia, int mes, int año, Dueño dueño) {
        try {
            conexion = ConexionDB.getInstance();
            LocalDate fechaNacimiento = LocalDate.of(dia, mes, año);
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
}
