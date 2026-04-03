package com.mycompany.registropedidos.Controlador;

import com.mycompany.registropedidos.Modelo.ArchivoTexto;
import com.mycompany.registropedidos.Modelo.Pedido;
import com.mycompany.registropedidos.Vista.FrmAgg;



public class CrtlAgg {
    Pedido obj;
    FrmAgg frmAgg;
    ArchivoTexto objArch;

    public CrtlAgg(FrmAgg frmAggg) {
        this.frmAgg = frmAggg;
    }

    public boolean IngresarDatos(String isbn, String pedido, int cantidad) {
    try {
        
        obj = new Pedido(isbn,pedido, cantidad);
            this.objArch = new ArchivoTexto();
            this.objArch.abrirArchivoTexto('w', "pedido.txt");
            this.objArch.crearLinea(obj.toString());
            this.objArch.cerrarArchivo('w');
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        
    }
    
}
