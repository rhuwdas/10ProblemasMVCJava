package com.mycompany.login.Controlador;

import com.mycompany.login.Modelo.ArchivoTexto;
import com.mycompany.login.Modelo.Usuario;
import com.mycompany.login.Vista.FrmAgg;


public class CrtlAgg {
    Usuario obj;
    FrmAgg frmAgg;
    ArchivoTexto objArch;

    public CrtlAgg(FrmAgg frmAggg) {
        this.frmAgg = frmAggg;
    }

    public boolean IngresarDatos(String nombre, String contra) {
        obj = new Usuario(nombre, contra);       
        try {
            this.objArch = new ArchivoTexto();
            this.objArch.abrirArchivoTexto('w', "contactos.txt");
            this.objArch.crearLinea(obj.toString());
            this.objArch.cerrarArchivo('w');
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        
    }
    
}
