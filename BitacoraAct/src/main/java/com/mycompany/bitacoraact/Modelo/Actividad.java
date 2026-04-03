
package com.mycompany.bitacoraact.Modelo;

public class Actividad {
    String fecha;
    String nombre;
    
    public Actividad (String fecha,String nombre){
    this.fecha = fecha;
    this.nombre = nombre;
    }
    public String toString(){
        return fecha+","+nombre;
    }
}
