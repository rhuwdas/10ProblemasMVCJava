package com.mycompany.controlinv.Controlador;

import com.mycompany.controlinv.Modelo.ArchivoTexto;
import com.mycompany.controlinv.Modelo.Producto;
import com.mycompany.controlinv.Vista.FrmAgg;

public class CrtlAgg {
    Producto prod;
    FrmAgg frmAgg;
    ArchivoTexto objArch;

    public CrtlAgg(FrmAgg frmAggg) {
        this.frmAgg = frmAggg;
    }

    public boolean IngresarDatos(int id, int cantidad, String nombre, float precio) {
        prod = new Producto(id, cantidad, nombre, precio);       
        try {
            this.objArch = new ArchivoTexto();
            this.objArch.abrirArchivoTexto('w', "Inventario.txt");
            this.objArch.crearLinea(prod.toString());
            this.objArch.cerrarArchivo('w');
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        
    }
    
}
