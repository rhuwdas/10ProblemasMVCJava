
package com.mycompany.registroes.Controlador;

import com.mycompany.registroes.Modelo.ArchivoTexto;
import com.mycompany.registroes.Modelo.Estudiante;
import com.mycompany.registroes.Vista.FrmListEst;
import com.mycompany.registroes.Vista.FrmResEst;
import javax.swing.table.DefaultTableModel;


public class CtrlEstAgg {
    Estudiante est;
    FrmResEst frmRes;
    ArchivoTexto objArch;
     
    public CtrlEstAgg(FrmResEst frmRes) {
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
    
        
        
    }