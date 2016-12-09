/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import javax.swing.JOptionPane;
import sax.DBConnection;
/**
 *
 * @author Diego
 */
public class ModelInSe {
    private DBConnection conexion;

    private String user = "";
    private String password = "";

    public ModelInSe() {
        conexion = new DBConnection(3306, "localhost", "acme_shop", "root", "1234");
    }
    
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void login() {

        /*
        abierto a SQL Injection
         */
        
         String sql = "SELECT nombre, password FROM usuarios where nombre='" + user + "' and password = '" + password + "';";
        System.err.println(sql);
        conexion.executeQuery(sql);
        
        
        /*
            Cerrado a SQL injecction
         */
//        String cool = "SELECT user, password FROM usuarios where user=? and password=?;";
//        conexion.prepareStatement(cool);
//        conexion.setPreparedStatement(1, getUser());
//        conexion.setPreparedStatement(2, getPassword());
//        conexion.executePreparedStatement();

        conexion.moveNext();
        setUser(conexion.getString("nombre"));
        setPassword(conexion.getString("password"));

        if (getUser() != null) {
            JOptionPane.showMessageDialog(null, "Bienvenido " + getUser());
        } else {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado");
        }
    }
}
