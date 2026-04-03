package com.mycompany.controlasis.Vista;

import com.mycompany.controlasis.Controlador.CrtlAgg;


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
        txtFecha = new javax.swing.JTextField();
        RdbAsistio = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        jLabel3.setText("fecha");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

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
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 280, -1));

        txtFecha.addActionListener(this::txtFechaActionPerformed);
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 280, -1));

        btnGpoAsis.add(RdbAsistio);
        RdbAsistio.setText("Asistio");
        getContentPane().add(RdbAsistio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        btnGpoAsis.add(jRadioButton2);
        jRadioButton2.setText("Falto");
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseClicked
        String estado = this.RdbAsistio.isSelected() ? "ASISTIO" : "FALTO";

        ctrlAgg.IngresarDatos(
            this.txtNombre.getText(),
            this.txtFecha.getText(),
            estado
        );
        vaciar();
    }//GEN-LAST:event_lblGuardarMouseClicked

    private void lblListarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblListarMouseClicked
        // TODO add your handling code here:
        FrmList frmEst = new FrmList();
        frmEst.setVisible(true);
    }//GEN-LAST:event_lblListarMouseClicked

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

  
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
    private javax.swing.JRadioButton RdbAsistio;
    private javax.swing.ButtonGroup btnGpoAsis;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JLabel lblGuardar;
    private javax.swing.JLabel lblListar;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void vaciar() {
        this.txtNombre.setText("");
        this.txtFecha.setText("");
    }
}
