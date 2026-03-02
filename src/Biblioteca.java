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



}
