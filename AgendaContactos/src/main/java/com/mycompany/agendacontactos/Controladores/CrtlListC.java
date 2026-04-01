
package com.mycompany.agendacontactos.Controladores;
import com.mycompany.agendacontactos.Modelos.ArchivoTexto;
import com.mycompany.agendacontactos.Modelos.Contactos;
import com.mycompany.agendacontactos.Vista.FrmList;
import javax.swing.table.DefaultTableModel;

public class CrtlListC {
    FrmList frmList;
    ArchivoTexto objArch;
    Contactos cont;
    public CrtlListC(FrmList frmList) {
        this.frmList = frmList;
    }

    public boolean listarDatos(int n) {
        try{
            this.objArch = new ArchivoTexto();
            if (!this.objArch.abrirArchivoTexto('r',"contactos.txt")) {
                System.out.println("El archivo no existe o no se pudo abrir");
                return false;
            }
            this.objArch.abrirArchivoTexto('r',"contactos.txt");                
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
