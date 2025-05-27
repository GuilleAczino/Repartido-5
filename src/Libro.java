public class Libro {
    private String titulo;
    private String autor;
    private int anio_publicacion;

    public Libro(String titulo, String autor, int anio_publicacion) {
        this.titulo = titulo;
        this.autor = autor;
        if(anio_publicacion<2025) {
            this.anio_publicacion = anio_publicacion;
        }else{
            System.out.println("EL año de publicacion no es valido porque supera al actual");
        }
       // System.out.println("Creado exitosamente");
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnio_publicacion() {
        return anio_publicacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnio_publicacion(int anio_publicacion) {
        this.anio_publicacion = anio_publicacion;
    }

    public static void main(String[] args) {
        Libro p1 = new Libro("Harry Potter","J. K. Rowling", 28);
        Libro p2 = new Libro("Bajo la misma estrella","John Green", 35);

    }
}
