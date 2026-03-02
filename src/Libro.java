public class Libro {

    private int id;
    private String titulo;
    private String autor;
    private int numPaginas;

    public Libro(int id, String titulo, String autor, int numPaginas){
        int numHojas;

        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;

        numHojas = numPaginas/2;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("\n id: %d;"));
        sb.append(String.format(" titulo: %s;", titulo));
        sb.append(String.format(" autor: %s;", autor));
        sb.append(String.format(" num.pagina: %d;", numPaginas));
        sb.append("}");

        return sb.toString();
    }
}
