/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import sax.DBConnection;
import jdda.ConnectionDB;
/**
 *
 * @author Diego
 */
public class ModelNew {
    DBConnection dBConnection = new DBConnection(3306,"localhost", "acme_shop", "root", "1234");
    ConnectionDB cb = new ConnectionDB();
 private String usuarioNombre;
 private String clave;
 private String estado;
 private String nivel;
 private int editar;
 private int errores;
    
    
    public void add(String insert){
        cb.Connection("acme_shop", "root", "1234");
        cb.add(insert);
    }

    /**
     * @return the editar
     */
    public int getEditar() {
        return editar;
    }

    /**
     * @param editar the editar to set
     */
    public void setEditar(int editar) {
        this.editar = editar;
    }

    /**
     * @return the errores
     */
    public int getErrores() {
        return errores;
    }

    /**
     * @param errores the errores to set
     */
    public void setErrores(int errores) {
        this.errores = errores;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}
