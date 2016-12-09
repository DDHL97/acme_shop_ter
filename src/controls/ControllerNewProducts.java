/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controls;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.ModelProducts;
import views.ViewNewProducts;
/**
 *
 * @author Diego
 */
public class ControllerNewProducts implements  ActionListener{
     ModelProducts mnp = new ModelProducts();
    ViewNewProducts vnp = new ViewNewProducts();
    public ControllerNewProducts(ModelProducts mnp, ViewNewProducts vnp){
        this.mnp = mnp;
        this.vnp = vnp;
      this.vnp.jtf_existencias.addActionListener(this);
      this.vnp.jtf_idProducto.addActionListener(this);
      this.vnp.jtf_idProducto.addActionListener(this);
      this.vnp.jtf_precioCompra.addActionListener(this);
      this.vnp.jtf_precioVenta.addActionListener(this);
      this.vnp.jtf_producto.addActionListener(this);
      this.vnp.jbtn_save.addActionListener(this);
      this.vnp.jbtn_back.addActionListener(this);
      this.vnp.jtf_stock.addActionListener(this);
      this.vnp.jtf_descuento.addActionListener(this);
      this.vnp.jcb_descuento.addActionListener(this);
      
      init_view();
      
    } 
    public void clean(){
        this.vnp.jta_descripcion.setText("");
        this.vnp.jtf_existencias.setText("");
        this.vnp.jtf_precioCompra.setText("");
        this.vnp.jtf_precioVenta.setText("");
        this.vnp.jtf_producto.setText("");
        this.vnp.jtf_descuento.setText("");
        this.vnp.jtf_stock.setText("");
        this.vnp.jcb_descuento.setSelectedIndex(0);
    }
    public void init_view(){
        this.vnp.setVisible(true);
    }

    public void nuevo(){
        int existencias = Integer.parseInt(this.vnp.jtf_existencias.getText());
        String descripcion = this.vnp.jta_descripcion.getText();
        Double precioCompra = Double.parseDouble(this.vnp.jtf_precioCompra.getText());
        Double precioVenta = Double.parseDouble(this.vnp.jtf_precioVenta.getText());
        String producto = this.vnp.jtf_producto.getText();
        int descuento = Integer.parseInt(this.vnp.jtf_descuento.getText());
        //String descuento = (String) this.vnp.jcb_descuento.getSelectedItem();
        String stock = this.vnp.jtf_stock.getText();
        
        String query = "Insert into productos (producto, descripcion, precio_compra, precio_venta, existencias, stock, id_descuento)"+ "values('"+producto+"','"+descripcion+"','"+precioCompra+"','"+precioVenta+"','"+existencias+"','"+stock+"','"+descuento+"');";
        this.mnp.add(query);
        if(this.mnp.getErrores()==0){
            JOptionPane.showMessageDialog(vnp, "El producto se han guardado correctamente");
            clean();
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.vnp.jbtn_save)
            nuevo();
    }
}
