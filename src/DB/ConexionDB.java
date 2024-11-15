package DB;

import datos.Citas;
import datos.Mascotas;
import datos.Productos;
import datos.Usuarios;
import entidades.Cita;
import entidades.Dueño;
import entidades.Emergencia;
import entidades.Mascota;
import entidades.Personal;
import entidades.Producto;
import entidades.Quirurgica;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ConexionDB {

    // conexion
    private static ConexionDB conexion;

    // usuarios que pueden conectarse al sistema
    private UsuariosSys usuariosSys;

    // simulacion de base de datos
    private Mascotas mascotas; // mascotas
    private Productos productos; // productos xd
    private Citas citas; // los 3 tipos de cita
    private Usuarios usuarios; // clientes y personal

    private ConexionDB() {
        usuariosSys = new UsuariosSys();

        mascotas = new Mascotas();
        productos = new Productos();
        usuarios = new Usuarios();
        citas = new Citas();
    }

    ;

    public static ConexionDB getInstance() {
        if (conexion == null) {
            conexion = new ConexionDB();
        }
        return conexion;
    }

    public UsuarioSys getUsuario(String nombre) {
        return usuariosSys.getUsuario(nombre);
    }

    public void insertarMascota(Mascota mascota) {
        mascotas.añadirMascota(mascota);
    }

    public Dueño getDueñoDNI(String dni) {
        return usuarios.getDueño(dni);
    }

    public LinkedList<Dueño> getDueños() {
        return usuarios.getDueños();
    }

    public Map<Integer, Mascota> getMascotas() {

        return mascotas.getMascotas();
    }

    public Mascota getMascota(int numero) {
        return mascotas.getMascotaNumeroExpediente(numero);
    }

    public void insertarDueño(Dueño dueño) {
        usuarios.insertarDueño(dueño);
    }

    public Producto getProducto(String nombre) {
        return productos.getProducto(nombre);
    }

    public List<Producto> getProductos() {
        return productos.getProductos();
    }

    public void insertarProducto(Producto p) {
        productos.insertarProducto(p);
    }

    public void insertarPersonal(Personal p) {
        usuarios.insertarPersonal(p);
    }

    public List<Personal> getPersonal() {
        return usuarios.getPersonal();
    }

    public List<Personal> getPersonalCargo(String cargo) {
        return usuarios.getPersonalCargo(cargo);
    }

    public void insertarCita(Cita cita) {
        citas.insertarCita(cita);
    }

    public List<Cita> getCitas() {
        return citas.getCitas();
    }

    public Cita getCita(int id) {
        return citas.getCita(id);
    }

    public List<Quirurgica> getCitasQuirurgicas() {
        return citas.getCitasQuirurgicas();
    }

    public List<Emergencia> getCitasEmergencias() {
        return citas.getCitasEmergencias();
    }

    public Personal getPersonal(String nombre, String apellido) {
        return usuarios.getPersonal(nombre, apellido);
    }
}
