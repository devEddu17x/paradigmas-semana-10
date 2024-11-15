package datos;

import entidades.Producto;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Productos {

    private List<Producto> productos = new LinkedList<>();

    public Productos() {
        productos.add(new Producto("Cambo", "Comida", "Alimento de fórmula avanzada Canbo Adulto Cordero razas medianas y grandes", 25.00, 20));
        productos.add(new Producto("RoyalCanin", "Comida", "Alimento seco para perros adultos de razas pequeñas", 30.00, 15));
        productos.add(new Producto("Hill's", "Comida", "Alimento para gatos adultos con sensibilidad digestiva", 28.50, 10));
        productos.add(new Producto("Frontline", "Antiparasitario", "Tratamiento antipulgas y garrapatas para perros", 35.00, 5));
        productos.add(new Producto("Advantage", "Antiparasitario", "Solución tópica para el control de pulgas en gatos", 20.00, 8));
        productos.add(new Producto("PetSafe", "Accesorio", "Collar de entrenamiento para perros", 45.00, 12));
        productos.add(new Producto("Bayer", "Antiparasitario", "Collar antipulgas y garrapatas para perros y gatos", 55.00, 7));
        productos.add(new Producto("Vet'sBest", "Cuidado", "Spray para el cuidado de la piel y el pelaje de mascotas", 18.00, 18));
        productos.add(new Producto("Nutribone", "Snack", "Huesos masticables saludables para perros", 15.00, 25));
        productos.add(new Producto("Feliway", "Comportamiento", "Difusor para reducir el estrés en gatos", 40.00, 9));
    }

    public Producto getProducto(String nombre) {
        Iterator<Producto> it = productos.iterator();
        Producto p;
        while (it.hasNext()) {
            p = (Producto) it.next();
            if (p instanceof Producto producto && producto.getNombre().equals(nombre)) {
                return producto;
            }
        }
        return null;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void insertarProducto(Producto producto) {
        productos.add(producto);
    }
}
