package com.mycompany.biblioteca.vista;

import com.mycompany.biblioteca.controlador.CrtlAgg;



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
        txtNombre = new javax.swing.JTextField();
        txtISBN = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        jLabel3.setText("ISBN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

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
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 280, -1));

        txtISBN.addActionListener(this::txtISBNActionPerformed);
        getContentPane().add(txtISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 280, -1));

        jLabel4.setText("Autor");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        txtAutor.addActionListener(this::txtAutorActionPerformed);
        getContentPane().add(txtAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 280, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseClicked

        ctrlAgg.IngresarDatos(
            this.txtISBN.getText(),
            this.txtNombre.getText(),
            this.txtAutor.getText()
        );
        vaciar();
    }//GEN-LAST:event_lblGuardarMouseClicked

    private void lblListarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblListarMouseClicked
        // TODO add your handling code here:
        FrmList frmEst = new FrmList();
        frmEst.setVisible(true);
    }//GEN-LAST:event_lblListarMouseClicked

    private void txtISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtISBNActionPerformed

    private void txtAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAutorActionPerformed

  
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
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void vaciar() {
        this.txtNombre.setText("");
        this.txtISBN.setText("");
        this.txtAutor.setText("");
    }
}
