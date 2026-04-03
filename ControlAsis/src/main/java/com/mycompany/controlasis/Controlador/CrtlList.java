
package com.mycompany.controlasis.Controlador;
import com.mycompany.controlasis.Modelo.ArchivoTexto;
import com.mycompany.controlasis.Vista.FrmList;
import javax.swing.table.DefaultTableModel;

public class CrtlList {
    FrmList frmList;
    ArchivoTexto objArch;
    public CrtlList(FrmList frmList) {
        this.frmList = frmList;
    }

    public boolean listarDatos(int n) {
        try{
            this.objArch = new ArchivoTexto();
            if (!this.objArch.abrirArchivoTexto('r',"asistencia.txt")) {
                System.out.println("El archivo no existe o no se pudo abrir");
                return false;
            }
            this.objArch.abrirArchivoTexto('r',"asistencia.txt");                
            Object[][] datos = this.objArch.obtenerMatrizLineas(n);        
            this.objArch.cerrarArchivo('r');
             DefaultTableModel modelo = new DefaultTableModel(datos, this.frmList.columnas);
             this.frmList.modelTbl(modelo);
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        
    }
    
    
}
