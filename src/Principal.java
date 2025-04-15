public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.titulo = "Bastardos sin gloria";
        miPelicula.fechaDeLanzamiento = 2015;
        miPelicula.duracionEnMinutos = 180;
        miPelicula.incluidoEnPlan = true;
        miPelicula.mostrarFichaTecnica();
        miPelicula.evaluarPelicula(7.8);
        miPelicula.evaluarPelicula(8.2);
        System.out.println(miPelicula.getCantidadEvaluaciones());
        System.out.println(miPelicula.calcularMedia());

    }
}
