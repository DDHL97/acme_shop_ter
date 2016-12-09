/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controls;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.ModelNew;
import views.ViewNew;

/**
 *
 * @author Diego
 */
public class ControllerNew implements ActionListener{
    ViewNew viewNew = new ViewNew();
ModelNew modelNew = new ModelNew();

    public ControllerNew(ModelNew modelNew, ViewNew viewNew){
        this.viewNew = viewNew;
        this.modelNew = modelNew;
        this.viewNew.jbtn_registrar.addActionListener(this);
        this.viewNew.jcmb_nivel.addActionListener(this);
        this.viewNew.jtf_name.addActionListener(this);
        this.viewNew.jp_password.addActionListener(this);
        this.viewNew.jtf_user.addActionListener(this);
        init_view();
    }
    
    public void init_view(){
        this.viewNew.setVisible(true);
    }
    public void clean(){
        this.viewNew.jtf_name.setText("");
        this.viewNew.jtf_user.setText("");
        this.viewNew.jp_password.setText("");
    }
    public void nuevo(){
        String name = this.viewNew.jtf_name.getText();
        String usuario = this.viewNew.jtf_user.getText();
        String password = this.viewNew.jp_password.getText();
        String estado = "Activo";
        String nivel = (String) this.viewNew.jcmb_nivel.getSelectedItem();
        String query = "Insert into usuarios (nombre, usuario, password, estado, nivel)"+ "values('"+name+"','"+usuario+"',MD5('"+password+"'),'"+estado+"','"+nivel+"');";
        this.modelNew.add(query);
        if(this.modelNew.getErrores()==0){
            JOptionPane.showMessageDialog(viewNew, "Se a registrado correctamente\n Bienvenido");
            clean();
        }else{
            JOptionPane.showMessageDialog(viewNew, "NO NO NO NO NO NO");
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.viewNew.jbtn_registrar){
            nuevo();
        }
    }
}
