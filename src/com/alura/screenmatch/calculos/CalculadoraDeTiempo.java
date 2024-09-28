package com.alura.screenmatch.calculos;
import com.aluracursos.screenmathc.modelos.Pelicula;
import com.aluracursos.screenmathc.modelos.Serie;
import com.aluracursos.screenmathc.modelos.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return this.tiempoTotal;
    }

    public void incluye(Titulo titulo ) {
        System.out.println("Agregando doración en minutos de " + titulo);
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }

}
