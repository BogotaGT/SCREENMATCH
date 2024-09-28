package com.aluracursos.screenmathc.modelos;

import com.alura.screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {
   private String director;

    public Pelicula(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {

        return (int) (calculaMedia() / 2);
    }

    @Override
    public String toString() {
        return "Película: " + this.getNombre() + " (" + getFechaDeLanzamiento() + ")";
    }
}
