package org.rivera.apicollection.List.modelo;

import java.util.Objects;

//interface Comparable para metodos compareTo
public class Alumno implements Comparable<Alumno> {
    private String nombre;
    private Integer nota;

    public Alumno(){}

    public Alumno (String nombre,Integer nota){
        this.nombre = nombre;
        this.nota = nota;
    }

 //set y get

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nombre + ", nota = " + nota;
    }

    //Ordenar por nombre
    @Override
    public int compareTo(Alumno a) {
        if (this.nombre == null){
            return 0;
        }
        return this.nombre.compareTo(a.nombre);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(nombre, alumno.nombre) && Objects.equals(nota, alumno.nota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nota);
    }
}
