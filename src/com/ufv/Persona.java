package com.ufv;

public class Persona {
    private String nombre;
    private String apellidos;
    private int dnisinletra;
    private int edad;

    //constructor
    public Persona(String nombre, String apellidos, int dnisinletra, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dnisinletra = dnisinletra;
        this.edad = edad;
    }

    //getters
    public String getNombre() {
        return nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public int getDnisinletra() {
        return dnisinletra;
    }
    public int getEdad() {
        return edad;
    }

    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setDnisinletra(int dnisinletra) {
        this.dnisinletra = dnisinletra;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    //to string
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dnisinletra=" + dnisinletra +
                ", edad=" + edad +
                '}';
    }
}
