package com.mycompany.controlinv.Vista;

import com.mycompany.controlinv.Controlador.CrtlAgg;


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
        txtNombre = new javax.swing.JTextField();
        txtCant = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, 40));

        jLabel3.setText("Precio");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, 50));

        jLabel4.setText("Cantidad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, -1, 50));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Registro productos");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 400, -1));

        lblGuardar.setText("Guardar");
        lblGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGuardarMouseClicked(evt);
            }
        });
        getContentPane().add(lblGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, -1, 20));

        lblListar.setText("Mostrar productos");
        lblListar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblListarMouseClicked(evt);
            }
        });
        getContentPane().add(lblListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, -1, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 150, 60));
        getContentPane().add(txtCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 150, 60));
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 150, 60));

        jLabel6.setText("ID");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, 50));
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 150, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseClicked
        ctrlAgg.IngresarDatos(Integer.parseInt(this.txtId.getText()), Integer.parseInt(this.txtCant.getText()), this.txtNombre.getText(), Float.parseFloat(this.txtPrecio.getText()));
        //d, cantidad, nombre, precio
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
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
