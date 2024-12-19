/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author aldoi
 */


public class ConexionDB {
    private static final String URL = "jdbc:mysql://localhost:3306/DBsupermercado";
    private static final String USER = "root";
    private static final String PASSWORD = "pincky123";

    public static Connection conectar() {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error en la conexion: " + ex.getMessage());
        }
        return conexion;
    }
}
