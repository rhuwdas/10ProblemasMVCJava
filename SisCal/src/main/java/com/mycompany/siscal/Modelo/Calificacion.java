/*
    6. Sistema de calificaciones
    Objetivo: Registrar calificaciones de alumnos.
    Datos:
    • Nombre
    • Materia
    • Calificación
    Archivo: calificaciones.txt
*/
package com.mycompany.siscal.Modelo;


public class Calificacion {
    String nombre,materia;
    float calificacion;

    @Override
    public String toString() {
        return  nombre + " ,"+materia+"," +calificacion ;
    }

    public Calificacion(String nombre, String materia, float calificacion) {
        this.nombre = nombre;
        this.materia = materia;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    
    
}
