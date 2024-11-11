package DB;

public class UsuarioSys {

    private final String nombre, contraseña;

    public UsuarioSys(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean validarUsuario(UsuarioSys usuario) {
        return this.nombre.equals(usuario.nombre) && this.contraseña.equals(usuario.contraseña);
    }

}
