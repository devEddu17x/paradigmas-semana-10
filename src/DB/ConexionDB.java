package DB;

public class ConexionDB {

    private static ConexionDB conexion;

    private ConexionDB() {
    }

    ;
    
    public ConexionDB getInstance() {
        if (conexion == null) {
            return new ConexionDB();
        }
        return conexion;
    }
}
