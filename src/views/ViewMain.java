/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author panda
 */
public class ViewMain extends javax.swing.JFrame {

    /**
     * Creates new form ViewMain
     */
    public ViewMain() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm_inicio = new javax.swing.JMenu();
        jmi_InSe = new javax.swing.JMenuItem();
        jmi_regUsu = new javax.swing.JMenuItem();
        jmi_exit = new javax.swing.JMenuItem();
        jm_suppliers = new javax.swing.JMenu();
        jmi_suppliers = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmi_Customers = new javax.swing.JMenuItem();
        jm_sales = new javax.swing.JMenu();
        jmi_sales = new javax.swing.JMenuItem();
        jmi_shopping = new javax.swing.JMenuItem();
        jm_products = new javax.swing.JMenu();
        jmi_products = new javax.swing.JMenuItem();
        jm_reports = new javax.swing.JMenu();
        jmi_suppliersReport = new javax.swing.JMenuItem();
        jmi_customersReport = new javax.swing.JMenuItem();
        jmi_productsReport = new javax.swing.JMenuItem();
        jmi_salesReport = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jm_inicio.setText("Inicio");

        jmi_InSe.setText("Iniciar Sesion");
        jm_inicio.add(jmi_InSe);

        jmi_regUsu.setText("Registrar Usuarios");
        jm_inicio.add(jmi_regUsu);

        jmi_exit.setText("Salir");
        jm_inicio.add(jmi_exit);

        jMenuBar1.add(jm_inicio);

        jm_suppliers.setText("Proveedores");

        jmi_suppliers.setText("Proveedores");
        jm_suppliers.add(jmi_suppliers);

        jMenuBar1.add(jm_suppliers);

        jMenu2.setText("Clientes");

        jmi_Customers.setText("Clientes");
        jMenu2.add(jmi_Customers);

        jMenuBar1.add(jMenu2);

        jm_sales.setText("Transacciones");

        jmi_sales.setText("Modulo Ventas");
        jm_sales.add(jmi_sales);

        jmi_shopping.setText("Compras");
        jmi_shopping.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_shoppingActionPerformed(evt);
            }
        });
        jm_sales.add(jmi_shopping);

        jMenuBar1.add(jm_sales);

        jm_products.setText("Productos");

        jmi_products.setText("Productos");
        jm_products.add(jmi_products);

        jMenuBar1.add(jm_products);

        jm_reports.setText("Reportes");

        jmi_suppliersReport.setText("Proveedores");
        jmi_suppliersReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_suppliersReportActionPerformed(evt);
            }
        });
        jm_reports.add(jmi_suppliersReport);

        jmi_customersReport.setText("Clientes");
        jm_reports.add(jmi_customersReport);

        jmi_productsReport.setText("Productos");
        jm_reports.add(jmi_productsReport);

        jmi_salesReport.setText("Ventas");
        jm_reports.add(jmi_salesReport);

        jMenuBar1.add(jm_reports);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jmi_suppliersReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_suppliersReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_suppliersReportActionPerformed

    private void jmi_shoppingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_shoppingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_shoppingActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    public javax.swing.JMenu jm_inicio;
    public javax.swing.JMenu jm_products;
    public javax.swing.JMenu jm_reports;
    public javax.swing.JMenu jm_sales;
    public javax.swing.JMenu jm_suppliers;
    public javax.swing.JMenuItem jmi_Customers;
    public javax.swing.JMenuItem jmi_InSe;
    public javax.swing.JMenuItem jmi_customersReport;
    public javax.swing.JMenuItem jmi_exit;
    public javax.swing.JMenuItem jmi_products;
    public javax.swing.JMenuItem jmi_productsReport;
    public javax.swing.JMenuItem jmi_regUsu;
    public javax.swing.JMenuItem jmi_sales;
    public javax.swing.JMenuItem jmi_salesReport;
    public javax.swing.JMenuItem jmi_shopping;
    public javax.swing.JMenuItem jmi_suppliers;
    public javax.swing.JMenuItem jmi_suppliersReport;
    // End of variables declaration//GEN-END:variables
}
