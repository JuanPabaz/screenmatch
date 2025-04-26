package com.jpproject.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;
import com.jpproject.screenmatch.excepciones.ConversionRuntimeException;

public class Titulo implements Comparable<Titulo> {

    @SerializedName("Title")
    private String titulo;

    @SerializedName("Year")
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnPlan;
    private double sumaEvaluaciones;
    private int cantidadEvaluaciones;

    public Titulo(String titulo, int fechaDeLanzamiento) {
        this.titulo = titulo;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public Titulo(TituloOmdb tituloOmdb) {
        this.titulo = tituloOmdb.title();
        this.fechaDeLanzamiento = Integer.parseInt(tituloOmdb.year());
        if (tituloOmdb.runtime().contains("N/A")){
            throw new ConversionRuntimeException("No se puede convertir la duración N/A");
        }
        this.duracionEnMinutos = Integer.parseInt(tituloOmdb.runtime().substring(0, tituloOmdb.runtime().indexOf(" ")));
    }

    public void mostrarFichaTecnica() {
        System.out.println("Mi pelicula es: " + titulo);
        System.out.println("Su fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("Su duracion en minutos es: " + getDuracionEnMinutos());
    }

    public void evaluarPelicula(double nota){
        sumaEvaluaciones += nota;
        cantidadEvaluaciones++;
    }

    public double calcularMedia(){
        return sumaEvaluaciones/cantidadEvaluaciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public boolean isIncluidoEnPlan() {
        return incluidoEnPlan;
    }

    public void setIncluidoEnPlan(boolean incluidoEnPlan) {
        this.incluidoEnPlan = incluidoEnPlan;
    }

    public double getSumaEvaluaciones() {
        return sumaEvaluaciones;
    }


    public int getCantidadEvaluaciones() {
        return cantidadEvaluaciones;
    }

    @Override
    public int compareTo(Titulo tituloAComparar) {
        return this.titulo.compareTo(tituloAComparar.getTitulo());
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Fecha de lanzamiento: " + fechaDeLanzamiento + ", Duración: " + duracionEnMinutos;
    }
}
