
package com.mycompany.registroes.Controlador;

import com.mycompany.registroes.Modelo.ArchivoTexto;
import com.mycompany.registroes.Modelo.Estudiante;
import com.mycompany.registroes.Vista.FrmListEst;
import com.mycompany.registroes.Vista.FrmResEst;
import javax.swing.table.DefaultTableModel;


public class CtrlEstListado {
    Estudiante est;
    ArchivoTexto objArch;
    FrmListEst frmLis;
     public CtrlEstListado(FrmListEst frmLis) {
        this.frmLis = frmLis;
    }

    public boolean listarEst(int n){
        
        try{
            this.objArch = new ArchivoTexto();

            if (!this.objArch.abrirArchivoTexto('r',"estudiantes.txt")) {
                System.out.println("El archivo no existe o no se pudo abrir");
                return false;
            }
            this.objArch.abrirArchivoTexto('r',"estudiantes.txt");                

          
            Object[][] datos = this.objArch.obtenerMatrizLineas(n);        
            this.objArch.cerrarArchivo('r');
             DefaultTableModel modelo = new DefaultTableModel(datos, this.frmLis.columnas);
             this.frmLis.modelTbl(modelo);
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        
        
    }
    
    
    
    z
}
