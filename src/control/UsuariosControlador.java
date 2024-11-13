package control;

import DB.ConexionDB;
import entidades.Dueño;

public class UsuariosControlador {

    private static ConexionDB conexion;

    public static Dueño getDueñoDNI(String dni) {
        conexion = ConexionDB.getInstance();
        Dueño dueño = conexion.getDueñoDNI(dni);
        return dueño;
    }
}
