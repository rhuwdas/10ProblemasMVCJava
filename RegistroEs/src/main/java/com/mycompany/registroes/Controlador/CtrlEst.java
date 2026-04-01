
package com.mycompany.registroes.Controlador;

import com.mycompany.registroes.Modelo.ArchivoTexto;
import com.mycompany.registroes.Modelo.Estudiante;
import com.mycompany.registroes.Vista.FrmListEst;
import com.mycompany.registroes.Vista.FrmResEst;
import javax.swing.table.DefaultTableModel;


public class CtrlEst {
    Estudiante est;
    FrmResEst frmRes;
    ArchivoTexto objArch;
    FrmListEst frmLis;
     public CtrlEst(FrmListEst frmLis) {
        this.frmLis = frmLis;
    }

    public CtrlEst(FrmResEst frmRes) {
        this.frmRes = frmRes;
    }
    
    public boolean IngresarDatos(String nControl, String Nombre, String Carrera, byte Promedio){
        est = new Estudiante(nControl,  Nombre,  Carrera,  Promedio);
       try {
            this.objArch = new ArchivoTexto();
            this.objArch.abrirArchivoTexto('w', "estudiantes.txt");
            this.objArch.crearLinea(est.toString());
            this.objArch.cerrarArchivo('w');
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
       
    }
    public boolean listarEst(int n){
        
        try{
            this.objArch = new ArchivoTexto();
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
    
    
    
    
}
