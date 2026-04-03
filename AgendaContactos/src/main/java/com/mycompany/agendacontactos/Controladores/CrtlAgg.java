package com.mycompany.agendacontactos.Controladores;

import com.mycompany.agendacontactos.Modelos.ArchivoTexto;
import com.mycompany.agendacontactos.Modelos.Contactos;
import com.mycompany.agendacontactos.Vista.FrmAgg;

public class CrtlAgg {
    Contactos cont;
    FrmAgg frmAgg;
    ArchivoTexto objArch;

    public CrtlAgg(FrmAgg frmAggg) {
        this.frmAgg = frmAggg;
    }

    public boolean IngresarDatos(String nombre, String tel, String email) {
        cont = new Contactos(nombre, tel, email);       
        try {
            this.objArch = new ArchivoTexto();
            this.objArch.abrirArchivoTexto('w', "contactos.txt");
            this.objArch.crearLinea(cont.toString());
            this.objArch.cerrarArchivo('w');
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        
    }
    
}
