package com.jpproject.screenmatch.principal;

import com.jpproject.screenmatch.modelos.Pelicula;
import com.jpproject.screenmatch.modelos.Series;
import com.jpproject.screenmatch.modelos.Titulo;

import java.util.ArrayList;

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
    }
}
