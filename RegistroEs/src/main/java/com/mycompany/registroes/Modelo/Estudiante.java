package com.mycompany.registroes.Modelo;
public class Estudiante {
  
    private String nc;
    private String nombre;
    private String carrera;
    private byte promedio; 

    public Estudiante( String nc, String nombre, String carrera, byte promedio) {
        this.nc = nc;
        this.nombre = nombre;
        this.carrera = carrera;
        this.promedio = promedio;
    }
    
    public Estudiante() {
        this.nc = null;
        this.nombre = null;
        this.carrera = null;
        this.promedio = 0;
    }

    public String getNc() {
        return nc;
    }

    public void setNc(String nc) {
        this.nc = nc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public byte getPromedio() {
        return promedio;
    }

    public void setPromedio(byte promedio) {
        this.promedio = promedio;
    }
    
   @Override
    public String toString(){
        return nc + "," + nombre + "," + carrera + "," + promedio;
    }
    
}
