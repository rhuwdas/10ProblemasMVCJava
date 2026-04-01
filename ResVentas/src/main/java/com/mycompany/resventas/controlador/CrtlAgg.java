package com.mycompany.resventas.controlador;

import com.mycompany.resventas.Modelo.ArchivoTexto;
import com.mycompany.resventas.Modelo.Venta;
import com.mycompany.resventas.Vista.FrmAgg;

public class CrtlAgg {
    Venta venta;
    FrmAgg frmAgg;
    ArchivoTexto objArch;

    public CrtlAgg(FrmAgg frmAggg) {
        this.frmAgg = frmAggg;
    }

    public boolean IngresarDatos(String fecha, String producto, int cantidad, int total) {
        venta = new Venta(fecha, producto, cantidad, total);       
        try {
            this.objArch = new ArchivoTexto();
            this.objArch.abrirArchivoTexto('w', "inventario.txt");
            this.objArch.crearLinea(venta.toString());
            this.objArch.cerrarArchivo('w');
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        
    }
    
}
