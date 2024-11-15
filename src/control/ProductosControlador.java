package control;

import DB.ConexionDB;
import entidades.Producto;
import java.util.List;

public class ProductosControlador {

    private static ConexionDB conexion;

    public static Producto getProducto(String nombre) {
        if (nombre.equals("")) {
            return null;
        }

        conexion = ConexionDB.getInstance();
        return conexion.getProducto(nombre);

    }

    public static List<Producto> getProductos() {
        conexion = ConexionDB.getInstance();
        return conexion.getProductos();
    }

    public static boolean insertarProducto(String nombre, String categoria, String presentacion, String precio, String st) {

        double precioUnitario = -1;
        int stock = -1;
        try {
            precioUnitario = Double.parseDouble(precio);
            stock = Integer.parseInt(st);
        } catch (NumberFormatException e) {
            System.out.println("Ocurrio un error al intentar parsear los numeros: ");
            System.out.println(e.getMessage());
            return false;
        }

        if (nombre.equals("") || categoria.equals("") || presentacion.equals("") || precioUnitario <= 0 || stock <= 0) {
            return false;
        }

        conexion = ConexionDB.getInstance();
        Producto producto = new Producto(nombre, categoria, presentacion, precioUnitario, stock);
        conexion.insertarProducto(producto);
        return true;
    }

}
