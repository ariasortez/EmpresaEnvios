/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mysql.conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier Fernández
 */
public class DBConexion {

    private static String DRIVER = "com.mysql.jdbc.Driver";
    private static String USUARIO = "root";
    private static String PASSWORD = "Arias007!";
    private static String URL = "jdbc:mysql://localhost:3306/clientes";

    static {

        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,"Error en el Driver");

        }

    }

    public Connection getConnection() {
        Connection con = null;

        try {
            con = (Connection) DriverManager.getConnection(URL, USUARIO, PASSWORD);
            JOptionPane.showMessageDialog(null,"Conexion Exitosa");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Conexion Nula, Fallo");

        }
        return con;
    }

}
