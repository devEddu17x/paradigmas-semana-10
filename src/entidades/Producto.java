package entidades;

public class Producto {

    private String nombre;
    private String categoria;
    private String presentacion;
    private double precioUnitario;
    private int stock;

    public Producto(String nombre, String categoria, String presentacion, double precioUnitario, int stock) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.presentacion = presentacion;
        this.precioUnitario = precioUnitario;
        this.stock = stock;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public void añadirStock(int cantidad) {
        this.stock += cantidad;
    }

    public void reducirStock(int cantidad) {
        this.stock -= cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getStock() {
        return stock;
    }

}
