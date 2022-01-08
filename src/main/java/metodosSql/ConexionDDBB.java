package metodosSql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @date 4 ene. 2022
 * @author Jhoan López
 * @email Jhoanlopezclase@gmail.com
 */

public class ConexionDDBB {
    
    public static String url = "jdbc:mysql://localhost/datosusuarios";
    public static String usuario = "root";
    public static String contraseña = null;
    public static String clase = "com.mysql.jdbc.Driver";
    
    public static Connection conectar() {
        Connection conexion = null;
        
        try {
            Class.forName(clase);
            conexion = (Connection) DriverManager.getConnection (url,usuario,contraseña);
            System.out.println("Conexión establecida");
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
        return conexion;
    }
}
