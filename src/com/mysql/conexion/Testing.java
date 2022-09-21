/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mysql.conexion;

import com.mysql.jdbc.Connection;
import java.sql.SQLException;

/**
 *
 * @author Javier Fernández
 */
public class Testing {
    
    public static void main(String[] args) throws SQLException{
    DBConexion db = new DBConexion();
    db.getConnection();
    Connection ps = null;
    
    try{
    ps.prepareStatement("CREATE TABLE PORKS");
       
 
    } catch(SQLException e){
        
    }}
    
}
