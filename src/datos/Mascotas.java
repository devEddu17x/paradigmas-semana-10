package datos;

import entidades.Mascota;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;

public class Mascotas {

    private static Map<Integer, Mascota> mascotas = new HashMap<>();

    public static Mascota getMascotaNumeroExpediente(int expediente) {
        Mascota mascotaExpediente = mascotas.get(expediente);
        if (mascotaExpediente == null) {
            throw new NoSuchElementException("No se ha encontrado a una mascota con el expediente: " + expediente);
        }
        return mascotaExpediente;
    }

    public static Mascota getMascotaDueño(String dni) {
        Optional<Mascota> mascotaDueño = mascotas.values().stream().filter(mascota -> mascota.getDueño().getDni().equals(dni)).findFirst();

        if (mascotaDueño.isEmpty()) {
            throw new NoSuchElementException("No se ha encontrado a una mascota donde el dueño tenga dni: " + dni);
        }
        return mascotaDueño.get();
    }
}