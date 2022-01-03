package metodosSql;

import java.sql.*;

/**
 * @date 4 ene. 2022
 * @author Jhoan López
 * @email Jhoanlopezclase@gmail.com
 */

public class MetodosSql {
    
    public static ConexionDDBB conexionDDBB = new ConexionDDBB();
    public static PreparedStatement sentencia;
    public static ResultSet resultado;
    public static String sql;
    public static int resultadoNum = 0;

    public int guardadr (String nombre, String apellidos, String correo, String contraseña) {
        int resultado = 0;
        Connection conexion = null;
        
        String sentenciaGuardar = ("INSERT INTO tabla ()");
        return resultado;
    }
}
