package com.jpproject.screenmatch.modelos;

import com.jpproject.screenmatch.calculos.Clasificable;

public class Episidio implements Clasificable{

    private int numero;
    private String titulo;
    private Series serie;
    private int totalVisualizaciones;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Series getSerie() {
        return serie;
    }

    public void setSerie(Series serie) {
        this.serie = serie;
    }

    @Override
    public int getClasificicacion() {
        if (totalVisualizaciones > 100) {
            return 4;
        }else{
            return 2;
        }
    }
}
