package com.jpproject.screenmatch.principal;

import com.jpproject.screenmatch.modelos.Pelicula;
import com.jpproject.screenmatch.modelos.Series;
import com.jpproject.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula bastardosSinGloria = new Pelicula("Bastardos sin gloria", 2015);
        bastardosSinGloria.evaluarPelicula(10);
        Pelicula avatar = new Pelicula("Avatar", 2012);
        avatar.evaluarPelicula(8);
        var senorDeLosAnillos = new Pelicula("El señor de los anillos", 2001);
        senorDeLosAnillos.evaluarPelicula(9);
        Series casaDragon = new Series("La Casa Del Dragon", 2022);
        casaDragon.evaluarPelicula(9);

        ArrayList<Titulo> listaDeTitulos = new ArrayList<>();
        listaDeTitulos.add(bastardosSinGloria);
        listaDeTitulos.add(avatar);
        listaDeTitulos.add(senorDeLosAnillos);
        listaDeTitulos.add(casaDragon);

        for (Titulo titulo : listaDeTitulos) {
            System.out.println(titulo.getTitulo());
            if (titulo instanceof Pelicula pelicula) {
                System.out.println(pelicula.getClasificicacion());
            }
        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penelope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darin");
        System.out.println("Lista de Artistas no ordenada: " + listaDeArtistas);
        Collections.sort(listaDeArtistas);
        System.out.println("Lista de Artistas ordenada: " + listaDeArtistas);

        System.out.println("Lista de titulos sin ordenar:" + listaDeTitulos);
        Collections.sort(listaDeTitulos);
        System.out.println("Lista de titulos ordeandos:" + listaDeTitulos);
    }
}
