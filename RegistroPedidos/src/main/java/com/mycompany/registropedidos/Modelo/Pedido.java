package com.mycompany.registropedidos.Modelo;


public class Pedido {
    String Cliente, pedido;
    float cantidad;

    public Pedido(String Cliente, String pedido, float cantidad) {
        this.Cliente = Cliente;
        this.pedido = pedido;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return Cliente + "," + pedido + "," + cantidad ;
    }
    
    
}
