package metodosSql;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @date 4 ene. 2022
 * @author Jhoan López
 * @email Jhoanlopezclase@gmail.com
 */

public class ConexionDDBB {
  
    public static Connection conectar(){
        Properties properties = new Properties();
        Connection conexion = null;
        try {
            properties.load(new FileInputStream(new File("properties.properties")));
            String url = properties.get("url").toString();
            String usuario = properties.get("usuario").toString();
            String contraseña = properties.get("contraseña").toString();
            try (var con = DriverManager.getConnection(url, usuario, contraseña)) {
                conexion = DriverManager.getConnection(url, usuario, contraseña);
                String guion = "--------------------";
                System.out.println(guion + " CONECTADO CON LA BASE DE DATOS " + guion);
            } catch (SQLException ex) {
                System.out.println("NO PUDIMOS CONECTAR CON LA BASE DE DATOS:");
                System.err.println(ex); 
            }
        } catch (FileNotFoundException ex) {
            System.out.print("ERROR: ");
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.print("ERROR: ");
            System.out.println(ex);
        } 
        return conexion;
    }
}
