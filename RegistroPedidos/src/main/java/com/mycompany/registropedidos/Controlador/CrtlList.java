
package com.mycompany.registropedidos.Controlador;
import com.mycompany.registropedidos.Modelo.ArchivoTexto;
import com.mycompany.registropedidos.Vista.FrmList;
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
            if (!this.objArch.abrirArchivoTexto('r',"pedido.txt")) {
                System.out.println("El archivo no existe o no se pudo abrir");
                return false;
            }
            this.objArch.abrirArchivoTexto('r',"pedido.txt");                
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
