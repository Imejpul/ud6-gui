package com.ivanmejia;

public class Alumno {

    private String nombre;
    private String apellidos;
    private int telefono;
    private String email;

    private GestionAlumnos gestionAlumnos;

    Alumno() {
    }

    Alumno(String nombre, String apellidos, int telefono, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public GestionAlumnos getGestionAlumnos() {
        return gestionAlumnos;
    }

    public void setGestionAlumnos(GestionAlumnos gestionAlumnos) {
        this.gestionAlumnos = gestionAlumnos;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono=" + telefono +
                ", email='" + email + '\'' +
                '}';
    }
}
