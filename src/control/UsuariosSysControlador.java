package control;

import DB.ConexionDB;
import DB.UsuarioSys;
import java.util.NoSuchElementException;

public class UsuariosSysControlador {

    private static ConexionDB conexion;

    public static boolean validarUsuario(String nombre, String contraseña) {
        conexion = ConexionDB.getInstance();
        try {
            UsuarioSys usuario = conexion.getUsuario(nombre);
            return usuario.validarUsuario(new UsuarioSys(nombre, contraseña));
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage()); // solo para debuguear codigo si es que hay errores
            return false;
        }
    }
}
