import com.jpproject.screenmatch.modelos.Pelicula;

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

    }
}
