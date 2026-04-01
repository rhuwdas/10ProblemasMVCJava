
package com.mycompany.controlinv.Modelo;


public class Producto {
    int id, cantidad;
    String nombre;
    float precio;

    public Producto(int id, int cantidad, String nombre, float precio) {
        this.id = id;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public String toString(){
        return ""+this.id+","+this.nombre+","+this.cantidad+","+this.precio;
    }
}
