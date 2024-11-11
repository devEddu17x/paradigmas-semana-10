package DB;

import datos.Mascotas;
import datos.Productos;
import datos.Servicios;
import datos.Usuarios;

public class ConexionDB {

    // conexion
    private static ConexionDB conexion;

    // usuarios que pueden conectarse al sistema
    private UsuariosSys usuariosSys;

    // simulacion de base de datos
    private Mascotas mascotas; // mascotas 
    private Productos productos; // productos xd
    private Servicios servicios; // los 3 tipos de cita
    private Usuarios usuarios; // clientes y personal

    private ConexionDB() {
        usuariosSys = new UsuariosSys();

        mascotas = new Mascotas();
        productos = new Productos();
        servicios = new Servicios();
        usuarios = new Usuarios();
    }

    ;
    
    public static ConexionDB getInstance() {
        if (conexion == null) {
            return new ConexionDB();
        }
        return conexion;
    }

    public UsuarioSys getUsuario(String nombre) {
        return usuariosSys.getUsuario(nombre);
    }
}
