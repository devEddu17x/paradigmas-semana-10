package DB;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class UsuariosSys {

    private List<UsuarioSys> listaUsuarios;

    public UsuariosSys() {
        listaUsuarios = new LinkedList<>();
        listaUsuarios.add(new UsuarioSys("eddu", "linux"));
        listaUsuarios.add(new UsuarioSys("limay", "fisica"));
    }

    public UsuarioSys getUsuario(String nombre) {
        Optional<UsuarioSys> usuario = listaUsuarios.stream().filter(UsuarioSys -> UsuarioSys.getNombre().equals(nombre)).findFirst();
        if (usuario.isEmpty()) {
            throw new NoSuchElementException("No se encontro al usuario con nombre: " + nombre);
        }

        return usuario.get();
    }
}
