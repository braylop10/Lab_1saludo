
package com.lab_1.model;

public class Lab1 {
    String nombre;
    String apellido;
    int actual;
    int nacimiento;

    public Lab1() {
    }

    public Lab1(String nombre, String apellido, int actual, int nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.actual = actual;
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getActual() {
        return actual;
    }

    public void setActual(int actual) {
        this.actual = actual;
    }

    public int getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }
    

    
}
