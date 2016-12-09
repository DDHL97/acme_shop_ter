/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controls;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import models.*;
import views.ViewIniciarSesion;

/**
 *
 * @author Diego
 */
public class ControllerInSe implements ActionListener{
    ViewIniciarSesion viewInSe = new ViewIniciarSesion();
ModelInSe modelInSe = new ModelInSe();

    public ControllerInSe(ModelInSe modelInSe, ViewIniciarSesion viewInSe){
        this.viewInSe = viewInSe;
        this.modelInSe = modelInSe;
        this.viewInSe.jbtn_ingresar.addActionListener(this);
        this.viewInSe.jpt_password.addActionListener(this);
        this.viewInSe.jtf_user.addActionListener(this);
        
        init_view();
    }
    
    public void init_view(){
        this.viewInSe.jp_InSe.setVisible(true);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
            if (e.getSource() == viewInSe.jbtn_ingresar) {
                login();
        }
    }
    private void login() {

        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(StandardCharsets.UTF_8.encode(viewInSe.jpt_password.getText()));
            String md5_pass = String.format("%032x", new BigInteger(1, md5.digest()));
            
            modelInSe.setUser(viewInSe.jtf_user.getText());
            modelInSe.setPassword(md5_pass);
            modelInSe.login();
        } catch (NoSuchAlgorithmException ex) {
            JOptionPane.showMessageDialog(viewInSe, "Error al generar Hash");
        }
    }
    
}
