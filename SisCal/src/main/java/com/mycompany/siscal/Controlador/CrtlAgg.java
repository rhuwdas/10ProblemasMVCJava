package com.mycompany.siscal.Controlador;

import com.mycompany.siscal.Modelo.ArchivoTexto;
import com.mycompany.siscal.Modelo.Calificacion;
import com.mycompany.siscal.Vista.FrmAgg;



public class CrtlAgg {
    Calificacion cal;
    FrmAgg frmAgg;
    ArchivoTexto objArch;

    public CrtlAgg(FrmAgg frmAggg) {
        this.frmAgg = frmAggg;
    }

    public boolean IngresarDatos(String nombre, String materia, float calificacion) {
        cal = new Calificacion(nombre,materia,calificacion);       
        try {
            this.objArch = new ArchivoTexto();
                this.objArch.abrirArchivoTexto('w', "Calificacion.txt");
            this.objArch.crearLinea(cal.toString());
            this.objArch.cerrarArchivo('w');
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        
    }
    
}
