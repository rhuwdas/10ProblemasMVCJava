package com.mycompany.resventas.Vista;

import com.mycompany.resventas.controlador.CrtlAgg;


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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblGuardar = new javax.swing.JLabel();
        lblListar = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtCant = new javax.swing.JTextField();
        txtprod = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Fecha");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        jLabel3.setText("Producto");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabel4.setText("cantidad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, 30));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Registro ventas");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 400, -1));

        lblGuardar.setText("Guardar");
        lblGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGuardarMouseClicked(evt);
            }
        });
        getContentPane().add(lblGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, 20));

        lblListar.setText("LIstar");
        lblListar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblListarMouseClicked(evt);
            }
        });
        getContentPane().add(lblListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, -1, -1));
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 120, 30));
        getContentPane().add(txtCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 120, 30));
        getContentPane().add(txtprod, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 120, 30));

        jLabel6.setText("total");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, -1));
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 120, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseClicked
        ctrlAgg.IngresarDatos(this.txtFecha.getText(), this.txtprod.getText(),Integer.parseInt(this.txtCant.getText()),Integer.parseInt(this.txtTotal.getText()));
        limpar();
    }//GEN-LAST:event_lblGuardarMouseClicked

    private void lblListarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblListarMouseClicked
        // TODO add your handling code here:
        FrmList frmEst = new FrmList();
        frmEst.setVisible(true);
    }//GEN-LAST:event_lblListarMouseClicked

  
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblGuardar;
    private javax.swing.JLabel lblListar;
    private javax.swing.JTextField txtCant;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtprod;
    // End of variables declaration//GEN-END:variables

    private void limpar() {
       this.txtCant.setText("");
       this.txtFecha.setText("");
       this.txtTotal.setText("");
       this.txtprod.setText("");

       
    }
}
