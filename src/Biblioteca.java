import java.util.ArrayList;

public class Biblioteca {

    private Libro[] catalogo;
    private final int CANT_MAX_LIBRROS;

    public Biblioteca(int cantidad_maxima_libros) {
        CANT_MAX_LIBRROS = cantidad_maxima_libros;
        catalogo = new Libro[CANT_MAX_LIBRROS];
    }

    public Libro findlibro(int idLibro){
        boolean seguirBuscando = true;
        Libro libroEncontrado = null;

        for(int i = 0; i < CANT_MAX_LIBRROS && seguirBuscando; i++){
            if(catalogo[i] != null && catalogo[i].getId() == idLibro){
                seguirBuscando = false;
                libroEncontrado = catalogo[i];

            }
        }
        return libroEncontrado;
    }

    //@Contract(pure = true)
    private int buscarPrimerHuecoLibre(){
        int posicionLibre = 0;
        boolean seguirBuscando = true;

        for(int i = 0; i < CANT_MAX_LIBRROS; i++){
            if(catalogo[i] != null){
                posicionLibre = i;
                seguirBuscando = false;
            }
        }

        return posicionLibre;
    }

    public boolean addlibro(Libro libro){
        boolean libroAnadido = false;
        int posicion;

        if( findlibro(libro.getId()) == null){
            posicion = buscarPrimerHuecoLibre();
            if( posicion >= 0 ){
                catalogo[posicion] = libro;
                libroAnadido = true;
            }
        }
        return libroAnadido;
    }

    public Libro deletelibro(int id){
        Libro libroEncontrado = null;
        int posicion;
        boolean seguirBuscando = true;

        for(int i  = 0; i < CANT_MAX_LIBRROS && seguirBuscando; i++){
            if(catalogo[i] != null && catalogo[i].getId() == id){
                libroEncontrado = catalogo[i];  //guardo libro
                catalogo[i] = null;             //vaciamos la posicion
                seguirBuscando = false;         //para que no siga recorriendo
            }
        }
        return libroEncontrado;
    }

    public boolean updateNumeroPaginas(int idLibro, int numPaginas){
        boolean numPaginasActualizado = false;
        Libro libro;

        libro = findlibro(idLibro);

        if( libro != null ){
            numPaginasActualizado = libro.updateNumeroPaginas(numPaginas);
        }

        return numPaginasActualizado;
    }

    public String obtainCatalogo(){
        StringBuilder sb = new StringBuilder("Catalogo: {");

        for(int i = 0; i < CANT_MAX_LIBRROS; i++){
            if(catalogo[i] != null){
                sb.append(catalogo[i].toString());
            }
        }
        sb.append("\n}");

        return sb.toString();
    }

}
