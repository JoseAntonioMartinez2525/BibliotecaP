public class Libro {
    private String titulo;
    Persona autor;
    private int ejemplares;
    private int prestados;
    String fechaP;
    int pags;

    //constructor por defecto
    public Libro() {
    }

    //constructor con parámetros
    public Libro(String titulo,  String fechaP, int pags,  Persona autor,int ejemplares) {                                    
        this.titulo = titulo;
        this.fechaP=fechaP;
           this.pags=pags; 
           this.autor = autor;    

        this.ejemplares = ejemplares;
    }



	//getters y setters
    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //método para realizar el prestamo de un libro
    public boolean prestamo() {
        boolean prestado = true;
        if (prestados < ejemplares) {
            prestados++;
        } else {
            prestado = false;
        }
        return prestado;
    }

    //método para realizar la devolución de un libro
    public boolean devolucion() {
        boolean devuelto = true;
        if (prestados == 0) {
            devuelto = false;
        } else {
            prestados--;
        }
        return devuelto;
    }

    
    @Override
    public String toString() {
        return "titulo: " + titulo + "\nautor: " + autor.toString() +
                  "\nejemplares: " + ejemplares + "\nprestados: " + prestados+ "\npags: "+pags;                                    
    }
   
}
