/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoevidencia1;

/**
 *
 * @author HugoRojas
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Proyectoevidencia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String usuario = "root";
        String password="Alex03081984**";
        String url="jdbc:mysql://localhost:3306/proyecsysmanage";
        Connection conexion;
        Statement statement;
        ResultSet rs;
               
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Proyectoevidencia1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            conexion=DriverManager.getConnection(url,usuario,password);
            statement=conexion.createStatement();
            
            // Consultar datos en la tabla USUARIOS
            rs=statement.executeQuery("SELECT * FROM USUARIOS");
            while(rs.next()){
                System.out.print(rs.getInt("Id_usuario") + ":" + rs.getString("nombre_usuario") + ";" + 
                                 rs.getString("email") + ":" + rs.getString("contraseña") + ":" + 
                                 rs.getString("rol") + ":" + rs.getString("fecha_creacion") + "\n");
            }
            
            // Insertar un nuevo registro en la tabla USUARIOS
            statement.executeUpdate("INSERT INTO USUARIOS (nombre_usuario, email, contraseña, rol, fecha_creacion) VALUES ('Ana', 'xxx@xxxx', '123654789', 'usuario', '2024-03-11')");
            
        } catch (SQLException ex) {
            Logger.getLogger(Proyectoevidencia1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
