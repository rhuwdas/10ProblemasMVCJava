package com.mycompany.bitacoraact.Controlador;

import com.mycompany.bitacoraact.Modelo.Actividad;
import com.mycompany.bitacoraact.Modelo.ArchivoTexto;
import com.mycompany.bitacoraact.Vista.FrmAgg;



public class CrtlAgg {
    Actividad obj;
    FrmAgg frmAgg;
    ArchivoTexto objArch;

    public CrtlAgg(FrmAgg frmAggg) {
        this.frmAgg = frmAggg;
    }

    public boolean IngresarDatos(String fecha, String nombre) {
        obj = new Actividad(fecha, nombre);       
        try {
            this.objArch = new ArchivoTexto();
            this.objArch.abrirArchivoTexto('w', "Agenda.txt");
            this.objArch.crearLinea(obj.toString());
            this.objArch.cerrarArchivo('w');
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        
    }
    
}
