import com.jpproject.screenmatch.calculos.CalculadoraDeTiempo;
import com.jpproject.screenmatch.modelos.Pelicula;
import com.jpproject.screenmatch.modelos.Series;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setTitulo("Bastardos sin gloria");
        miPelicula.setFechaDeLanzamiento(2015);
        miPelicula.setDuracionEnMinutos(180);
        miPelicula.setIncluidoEnPlan(true);
        miPelicula.mostrarFichaTecnica();
        miPelicula.evaluarPelicula(7.8);
        miPelicula.evaluarPelicula(8.2);
        System.out.println(miPelicula.getCantidadEvaluaciones());
        System.out.println(miPelicula.calcularMedia());

        Series casaDragon = new Series();
        casaDragon.setTitulo("La Casa Del Dragon");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(2);
        casaDragon.setMinutosPorEpisodio(60);
        casaDragon.setEpisodiosPorTemporada(8);
        casaDragon.mostrarFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        CalculadoraDeTiempo calculadoraDeTiempo = new CalculadoraDeTiempo();
        calculadoraDeTiempo.incluye(miPelicula);
        calculadoraDeTiempo.incluye(casaDragon);
        System.out.println(calculadoraDeTiempo.getTiempoTotal());

    }
}
