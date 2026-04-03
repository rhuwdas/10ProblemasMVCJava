package com.mycompany.controlasis.Controlador;

import com.mycompany.controlasis.Modelo.ArchivoTexto;
import com.mycompany.controlasis.Modelo.Asistencia;
import com.mycompany.controlasis.Vista.FrmAgg;


public class CrtlAgg {
    Asistencia obj;
    FrmAgg frmAgg;
    ArchivoTexto objArch;

    public CrtlAgg(FrmAgg frmAggg) {
        this.frmAgg = frmAggg;
    }

    public boolean IngresarDatos(String nombre, String fecha, String estado) {
    try {
        Asistencia.Estado estadoEnum;

        if (estado.equalsIgnoreCase("Asistio")) {
            estadoEnum = Asistencia.Estado.ASISTIO;
        } else {
            estadoEnum = Asistencia.Estado.FALTO;
        }
        obj = new Asistencia(nombre, fecha, estadoEnum);
            this.objArch = new ArchivoTexto();
            this.objArch.abrirArchivoTexto('w', "asistencia.txt");
            this.objArch.crearLinea(obj.toString());
            this.objArch.cerrarArchivo('w');
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        
    }
    
}
