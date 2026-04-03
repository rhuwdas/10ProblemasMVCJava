package com.mycompany.registropedidos.Vista;

import com.mycompany.registropedidos.Controlador.CrtlAgg;




public class FrmAgg extends javax.swing.JFrame {
    CrtlAgg ctrlAgg;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmAgg.class.getName());
    
    public FrmAgg() {
        initComponents();
        ctrlAgg = new CrtlAgg(this);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGpoAsis = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblGuardar = new javax.swing.JLabel();
        lblListar = new javax.swing.JLabel();
        txtPedido = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Pedido");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        jLabel3.setText("Cliente");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Registro contactos");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 730, -1));

        lblGuardar.setText("Guardar");
        lblGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGuardarMouseClicked(evt);
            }
        });
        getContentPane().add(lblGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, 20));

        lblListar.setText("LIstar");
        lblListar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblListarMouseClicked(evt);
            }
        });
        getContentPane().add(lblListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, -1, -1));
        getContentPane().add(txtPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 280, -1));

        txtCliente.addActionListener(this::txtClienteActionPerformed);
        getContentPane().add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 280, -1));

        jLabel4.setText("Cantidad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        txtCantidad.addActionListener(this::txtCantidadActionPerformed);
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 280, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseClicked

        ctrlAgg.IngresarDatos(
            this.txtCliente.getText(),
            this.txtPedido.getText(),
            Integer.parseInt(this.txtCantidad.getText())
        );
        vaciar();
    }//GEN-LAST:event_lblGuardarMouseClicked

    private void lblListarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblListarMouseClicked
        // TODO add your handling code here:
        FrmList frmEst = new FrmList();
        frmEst.setVisible(true);
    }//GEN-LAST:event_lblListarMouseClicked

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

  
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> new FrmAgg().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGpoAsis;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblGuardar;
    private javax.swing.JLabel lblListar;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtPedido;
    // End of variables declaration//GEN-END:variables

    private void vaciar() {
        this.txtPedido.setText("");
        this.txtCliente.setText("");
        this.txtCantidad.setText("");
    }
}
