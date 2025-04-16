package com.jpproject.screenmatch.modelos;

import com.jpproject.screenmatch.calculos.Clasificable;

public class Pelicula extends Titulo implements Clasificable {

    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificicacion() {
        return (int) calcularMedia() / 2;
    }
}

