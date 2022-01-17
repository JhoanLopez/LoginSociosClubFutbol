package metodosSql;

import java.sql.*;

/**
 * @date 4 ene. 2022
 * @author Jhoan López
 * @email Jhoanlopezclase@gmail.com
 */

public class MetodosSql {
    
    public static ConexionDDBB conexion = new ConexionDDBB();
    public static PreparedStatement sentenciaPreparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultadoNum = 0;

    public static int guardar (String nombre, String apellidos, String IDNumero, String contraseña) {
        int resultado = 0;
        Connection conexion = null;
        try {
            conexion = ConexionDDBB.conectar();
            String sentenciaGuardar = 
            ("INSERT INTO usuarios (nombre,apellidos,IDnumero,contraseña) VALUES (?,?,?,?)");
            sentenciaPreparada = conexion.prepareStatement(sentenciaGuardar);
            sentenciaPreparada.setString(1, nombre);
            sentenciaPreparada.setString(2, apellidos);
            sentenciaPreparada.setString(3, IDNumero);
            sentenciaPreparada.setString(4, contraseña);
            
            resultado = sentenciaPreparada.executeUpdate();
            sentenciaPreparada.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.print("ERROR: ");
            System.out.println(ex);
        }
        return resultado;
    }
    
    public static String buscarNombre (String IDNumero) {
        String busquedaNombre = null;
        Connection conexion = null;
        try {
            conexion = ConexionDDBB.conectar();
            String sentenciaBuscar = ("SELECT nombre, apellidos FROM usuarios WHERE IDNumero = '" + IDNumero + "'");
            sentenciaPreparada = conexion.prepareStatement(sentenciaBuscar);
            resultado = sentenciaPreparada.executeQuery();
            
            if (resultado.next()) {
                String nombre = resultado.getString("nombre");
                String apellidos = resultado.getString("apellidos");
                busquedaNombre = (nombre + " " + apellidos);
            }
            
            conexion.close();
        } catch (SQLException ex) {
            System.out.print("ERROR: ");
            System.out.println(ex);
        }
        return busquedaNombre;
    }
    
    public static String buscarUsuarioRegistrado (String IDNumero, String contraseña) {
        String busquedaUsuario = null;
        Connection conexion = null;
        try {
            conexion = ConexionDDBB.conectar();
            String sentenciaBuscarUsuario = 
            ("SELECT nombre,apellidos,IDNumero,contraseña FROM usuarios WHERE IDNumero = '" +
            IDNumero + "' && contraseña = '" + contraseña + "'");
            sentenciaPreparada = conexion.prepareStatement(sentenciaBuscarUsuario);
            resultado = sentenciaPreparada.executeQuery();
            
            if (resultado.next()) {
                busquedaUsuario = "Usuario encontrado";
                System.out.println(busquedaUsuario);
            } else {
                busquedaUsuario = "Usuario no encontrado";
                System.out.println(busquedaUsuario);
            }
            
            conexion.close();
        } catch (SQLException ex) {
            System.out.print("ERROR: ");
            System.out.println(ex);
        }
        return busquedaUsuario;
    }
}
