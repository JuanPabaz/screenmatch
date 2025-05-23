package com.jpproject.screenmatch.modelos;

public class Series extends Titulo{

    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    public Series(String titulo, int fechaDeLanzamiento) {
        super(titulo, fechaDeLanzamiento);
    }

    @Override
    public int getDuracionEnMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public String toString() {
        return "Series: " + this.getTitulo() + " " + "(" + this.getFechaDeLanzamiento() +")";
    }
}
