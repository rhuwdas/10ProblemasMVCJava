package com.mycompany.biblioteca.controlador;

import com.mycompany.biblioteca.modelo.Libro;
import com.mycompany.biblioteca.vista.FrmAgg;
import com.mycompany.controlasis.Modelo.ArchivoTexto;


public class CrtlAgg {
    Libro obj;
    FrmAgg frmAgg;
    ArchivoTexto objArch;

    public CrtlAgg(FrmAgg frmAggg) {
        this.frmAgg = frmAggg;
    }

    public boolean IngresarDatos(String isbn, String titulo, String autor) {
    try {
        
        obj = new Libro(isbn, titulo, autor);
            this.objArch = new ArchivoTexto();
            this.objArch.abrirArchivoTexto('w', "Libros.txt");
            this.objArch.crearLinea(obj.toString());
            this.objArch.cerrarArchivo('w');
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        
    }
    
}
