public class Pelicula {

    String titulo;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnPlan;
    private double sumaEvaluaciones;
    private int cantidadEvaluaciones;

    void mostrarFichaTecnica() {
        System.out.println("Mi pelicula es: " + titulo);
        System.out.println("Su fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("Su duracion en minutos es: " + duracionEnMinutos);
    }

    void evaluarPelicula(double nota){
        sumaEvaluaciones += nota;
        cantidadEvaluaciones++;
    }

    double calcularMedia(){
        return sumaEvaluaciones/cantidadEvaluaciones;
    }

    public double getSumaEvaluaciones() {
        return sumaEvaluaciones;
    }

    public void setSumaEvaluaciones(double sumaEvaluaciones) {
        this.sumaEvaluaciones = sumaEvaluaciones;
    }

    public int getCantidadEvaluaciones() {
        return cantidadEvaluaciones;
    }

    public void setCantidadEvaluaciones(int cantidadEvaluaciones) {
        this.cantidadEvaluaciones = cantidadEvaluaciones;
    }
}
