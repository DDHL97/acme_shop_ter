/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author Diego
 */
public class ViewIniciarSesion extends javax.swing.JPanel {

    /**
     * Creates new form ViewIniciarSesion
     */
    public ViewIniciarSesion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_InSe = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtf_user = new javax.swing.JTextField();
        jpt_password = new javax.swing.JPasswordField();
        jbtn_ingresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setLayout(null);

        jp_InSe.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        jLabel1.setText("Iniciar Sesion.");
        jp_InSe.add(jLabel1);
        jLabel1.setBounds(230, 20, 153, 44);

        jLabel3.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel3.setText("Contraseña:");
        jp_InSe.add(jLabel3);
        jLabel3.setBounds(230, 170, 130, 29);

        jtf_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_userActionPerformed(evt);
            }
        });
        jtf_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_userKeyTyped(evt);
            }
        });
        jp_InSe.add(jtf_user);
        jtf_user.setBounds(230, 130, 150, 20);
        jp_InSe.add(jpt_password);
        jpt_password.setBounds(230, 220, 150, 20);

        jbtn_ingresar.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jbtn_ingresar.setText("Ingresar");
        jp_InSe.add(jbtn_ingresar);
        jbtn_ingresar.setBounds(250, 260, 100, 31);

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel2.setText("Usuario:");
        jp_InSe.add(jLabel2);
        jLabel2.setBounds(230, 90, 110, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo3.jpg"))); // NOI18N
        jp_InSe.add(jLabel4);
        jLabel4.setBounds(0, 0, 580, 330);

        add(jp_InSe);
        jp_InSe.setBounds(0, 0, 580, 330);
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_userKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_userKeyTyped
        char c = evt.getKeyChar();
        if(c<'a' || c>'z')evt.consume();
        
    }//GEN-LAST:event_jtf_userKeyTyped

    private void jtf_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_userActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JButton jbtn_ingresar;
    public javax.swing.JPanel jp_InSe;
    public javax.swing.JPasswordField jpt_password;
    public javax.swing.JTextField jtf_user;
    // End of variables declaration//GEN-END:variables
}
