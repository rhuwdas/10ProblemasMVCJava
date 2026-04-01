package com.mycompany.registroes.Vista;

import com.mycompany.registroes.Controlador.CtrlEstListado;
import javax.swing.table.DefaultTableModel;

public class FrmListEst extends javax.swing.JFrame {
    public String[] columnas = {"NC","Nombre","Carrera","Promedio"} ;
    CtrlEstListado contrlEs;

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmListEst.class.getName());

    public FrmListEst() {
        initComponents();
        this.contrlEs = new CtrlEstListado(this);
        contrlEs.listarEst(columnas.length);
        vaciar();
    }

    public void modelTbl(DefaultTableModel modelo){
        tblEstudiantes.setModel(modelo); 
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEstudiantes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 510, 20));

        tblEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "nc", "Nombre", "Carrera", "promedio"
            }
        ));
        jScrollPane1.setViewportView(tblEstudiantes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 530, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

        java.awt.EventQueue.invokeLater(() -> new FrmListEst().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tblEstudiantes;
    // End of variables declaration//GEN-END:variables

    private void vaciar() {
        
    }
}
