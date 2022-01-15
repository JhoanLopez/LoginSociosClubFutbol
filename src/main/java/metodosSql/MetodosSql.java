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

    public static int guardar (String nombre, String apellidos, String correo, String contraseña) {
        int resultado = 0;
        Connection conexion = null;
        
        String sentenciaGuardar = ("INSERT INTO usuarios (nombre,apellidos,correo,contraseña) VALUES (?,?,?,?)");
        
        try {
            conexion = ConexionDDBB.conectar();
            sentenciaPreparada = conexion.prepareStatement(sentenciaGuardar);
            sentenciaPreparada.setString(1, nombre);
            sentenciaPreparada.setString(2, apellidos);
            sentenciaPreparada.setString(3, correo);
            sentenciaPreparada.setString(4, contraseña);
            
            resultado = sentenciaPreparada.executeUpdate();
            sentenciaPreparada.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return resultado;
    }
    
    public static String buscarNombre (String correo) {
    
        String busquedaNombre = null;
        Connection conexion = null;
        
        try {
            conexion = ConexionDDBB.conectar();
            String sentenciaBuscar = ("SELECT nombre, apellidos FROM usuarios WHERE correo = '" + correo + "'");
            sentenciaPreparada = conexion.prepareStatement(sentenciaBuscar);
            resultado = sentenciaPreparada.executeQuery();
            if (resultado.next()) {
                String nombre = resultado.getString("nombre");
                String apellidos = resultado.getString("apellidos");
                busquedaNombre = (nombre + " " + apellidos);
            }
           
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return busquedaNombre;
    }
    
    public static String buscarUsuarioRegistrado (String correo, String contraseña) {
        String busquedaUsuario = null;
        Connection conexion = null;
        
        try {
            conexion = ConexionDDBB.conectar();
            String sentenciaBuscarUsuario = 
            ("SELECT nombre,apellidos,correo,contraseña FROM usuarios WHERE correo = '" +
            correo + "' && contraseña = '" + contraseña + "'");
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
            System.out.println(ex);
        }
        return busquedaUsuario;
    }
}
