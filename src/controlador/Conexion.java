/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author carlo
 */
public class Conexion {
    
    private Connection conn; 
    public Conexion() throws ClassNotFoundException, SQLException{
    
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost/pruebaom";
        String user="root";
        String pass="";
        conn= DriverManager.getConnection(url, user, pass);
        
    }
    
    public Connection get(){
    return conn;
    }
    
    public void cerrar() throws SQLException{
    conn.close();
    }
           
    
}
