package Actividad1;

public class Examen {
    private String titulo;
    private float calificacion;

    public Examen() {
    }

    public Examen(String titulo, float calificacion) {
        this.titulo = titulo;
        this.calificacion = calificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public String comprobarCalificacion() {
        if (getCalificacion() < 0 || getCalificacion() > 10){
            return "Calificacion no valida";
        } else {
            return "Calificacion valida";
        }
    }

    @Override
    public String toString() {
        return "Examen{" +
                "Titulo='" + titulo + '\'' +
                ", Calificacion=" + calificacion +
                '}';
    }
}
