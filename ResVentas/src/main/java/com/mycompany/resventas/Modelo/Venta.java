package com.mycompany.resventas.Modelo;

import java.util.Date;

public class Venta {
    private String Fecha;
    private String Producto;
    private int Cantidad;
    private float Total;

    public Venta(String Fecha, String Producto, int Cantidad, float Total) {
        this.Fecha = Fecha;
        this.Producto = Producto;
        this.Cantidad = Cantidad;
        this.Total = Total;
    }

    @Override
    public String toString() {
        return  Fecha + ", " + Producto + "," + Cantidad + ","+ Total ;
    }

    

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public float getTotal() {
        return Total;
    }

    public void setTotal(float Total) {
        this.Total = Total;
    }
    
}
