/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Dimension;
import java.beans.PropertyVetoException;
import javax.swing.JPanel;

/**
 *
 * @author Clog_10
 */
public class AyudaForm extends javax.swing.JInternalFrame {

    JPanel loginA;
    /**
     * Creates new form AyudaForm
     */
    public AyudaForm() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuAyuda = new javax.swing.JMenu();
        aProducto = new javax.swing.JMenuItem();
        aVenta = new javax.swing.JMenuItem();
        aProveedor = new javax.swing.JMenuItem();
        aLogin = new javax.swing.JMenuItem();
        aCliente = new javax.swing.JMenuItem();

        setBackground(new java.awt.Color(153, 255, 204));
        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Ayuda");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ayuda.png"))); // NOI18N

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1180, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
        );

        menuAyuda.setText("Ayuda");
        menuAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAyudaActionPerformed(evt);
            }
        });

        aProducto.setText("Producto");
        aProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aProductoActionPerformed(evt);
            }
        });
        menuAyuda.add(aProducto);

        aVenta.setText("Venta");
        menuAyuda.add(aVenta);

        aProveedor.setText("Proveedor");
        menuAyuda.add(aProveedor);

        aLogin.setText("Login");
        aLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aLoginActionPerformed(evt);
            }
        });
        menuAyuda.add(aLogin);

        aCliente.setText("Cliente");
        aCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aClienteActionPerformed(evt);
            }
        });
        menuAyuda.add(aCliente);

        jMenuBar1.add(menuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aProductoActionPerformed
        // TODO add your handling code here:
        ayudaInventario inv = new ayudaInventario();
        jDesktopPane1.add(inv);
        inv.show();
    }//GEN-LAST:event_aProductoActionPerformed

    private void aLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aLoginActionPerformed
        // TODO add your handling code here:
        ayudaLogeo log = new ayudaLogeo();
        jDesktopPane1.add(log);
        log.show();
    }//GEN-LAST:event_aLoginActionPerformed

    private void menuAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAyudaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menuAyudaActionPerformed

    private void aClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aClienteActionPerformed
        // TODO add your handling code here:
        ayudaCliente cl = new ayudaCliente();
        jDesktopPane1.add(cl);
        cl.show();
    }//GEN-LAST:event_aClienteActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aCliente;
    private javax.swing.JMenuItem aLogin;
    private javax.swing.JMenuItem aProducto;
    private javax.swing.JMenuItem aProveedor;
    private javax.swing.JMenuItem aVenta;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuAyuda;
    // End of variables declaration//GEN-END:variables
}

