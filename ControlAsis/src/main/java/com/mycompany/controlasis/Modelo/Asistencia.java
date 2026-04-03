package com.mycompany.controlasis.Modelo;

public class Asistencia {
    private String nombre;
    private String fecha;
    private Estado estado;

    public Asistencia(String nombre, String fecha, Estado estado) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.estado = estado;
    }

    public enum Estado {
        ASISTIO("Asistió"),
        FALTO("Faltó");

        private String valor;

        Estado(String valor) {
            this.valor = valor;
        }

        public String getValor() {
            return valor;
        }
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    @Override
    public String toString() {
        return nombre + "," + fecha + "," + estado;
    }
}