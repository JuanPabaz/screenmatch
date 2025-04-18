import com.jpproject.screenmatch.calculos.CalculadoraDeTiempo;
import com.jpproject.screenmatch.calculos.FiltroRecomendacion;
import com.jpproject.screenmatch.modelos.Episidio;
import com.jpproject.screenmatch.modelos.Pelicula;
import com.jpproject.screenmatch.modelos.Series;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Bastardos sin gloria", 2015);
        miPelicula.setDuracionEnMinutos(180);
        miPelicula.setIncluidoEnPlan(true);
        miPelicula.mostrarFichaTecnica();
        miPelicula.evaluarPelicula(7.8);
        miPelicula.evaluarPelicula(8.2);
        System.out.println(miPelicula.getCantidadEvaluaciones());
        System.out.println(miPelicula.calcularMedia());

        Series casaDragon = new Series("La Casa Del Dragon", 2022);
        casaDragon.setTemporadas(2);
        casaDragon.setMinutosPorEpisodio(60);
        casaDragon.setEpisodiosPorTemporada(8);
        casaDragon.mostrarFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        CalculadoraDeTiempo calculadoraDeTiempo = new CalculadoraDeTiempo();
        calculadoraDeTiempo.incluye(miPelicula);
        calculadoraDeTiempo.incluye(casaDragon);
        System.out.println(calculadoraDeTiempo.getTiempoTotal());

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtrar(miPelicula);

        Episidio episidio = new Episidio();
        episidio.setNumero(24);
        episidio.setTitulo("La boda roja");
        episidio.setSerie(casaDragon);
        episidio.setTotalVisualizaciones(50);
        episidio.getClasificicacion();
        filtroRecomendacion.filtrar(episidio);

        var peliculaNueva = new Pelicula("El señor de los anillos", 2001);
        peliculaNueva.setDuracionEnMinutos(180);
        peliculaNueva.setIncluidoEnPlan(true);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(peliculaNueva);
        System.out.println("Tamaño de la lista de peliculas: " + listaDePeliculas.size());
        System.out.println("La primera pelicula es: " + listaDePeliculas.get(0).getTitulo());
        System.out.println(listaDePeliculas);
        System.out.println(listaDePeliculas.get(0).toString());

    }
}
