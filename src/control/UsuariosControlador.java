package control;

import DB.ConexionDB;
import entidades.Dueño;
import entidades.Personal;
import java.util.LinkedList;
import java.util.List;

public class UsuariosControlador {

    private static ConexionDB conexion;

    public static Dueño getDueñoDNI(String dni) {
        if (dni == null) {
            return null;
        }

        conexion = ConexionDB.getInstance();
        return conexion.getDueñoDNI(dni);

    }

    public static LinkedList<Dueño> getDueños() {
        conexion = ConexionDB.getInstance();
        return conexion.getDueños();
    }

    public static boolean insertarDueño(String nombre, String apellidoP, String apellidoM, String dni, String telefono, String direccion) {
        if (nombre.equals("") || apellidoP.equals("") || apellidoM.equals("") || dni.equals("") || telefono.equals("") || direccion.equals("")) {
            return false;
        }

        conexion = ConexionDB.getInstance();
        Dueño dueño = new Dueño(nombre, apellidoP, apellidoM, dni, telefono, direccion);
        conexion.insertarDueño(dueño);
        return true;
    }

    public static List<Personal> getPersonal() {
        conexion = ConexionDB.getInstance();
        return conexion.getPersonal();
    }

    public static boolean insertarPersonal(String cargo, String horario, String nom, String nombre, String apellidoP, String apellidoM) {
        double nomina = -1;
        try {
            nomina = Double.parseDouble(nom);
        } catch (NumberFormatException e) {
            System.out.println("Hubo un error al parsear nomina:");
            System.out.println(e.getMessage());
        }

        if (cargo.equals("") || horario.equals("") || nomina <= 0 || nombre.equals("") || apellidoP.equals("") || apellidoM.equals("")) {
            return false;
        }

        Personal p = new Personal(cargo, horario, nomina, nombre, apellidoP, apellidoM);
        conexion = ConexionDB.getInstance();
        conexion.insertarPersonal(p);
        return true;
    }

    public static List<Personal> getPersonalCargo(String cargo) {
        conexion = ConexionDB.getInstance();
        List<Personal> p = conexion.getPersonalCargo(cargo);
        return p;
    }
}
