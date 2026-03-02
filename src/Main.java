public class Main{

    public static void main(String[] args){

        Libro libro1 = new Libro(1, "el quojote", "Migel de Cervantes",678);

        Libro libro2 = new Libro(2,"el gato con botas","Charles perrault",100);

        System.out.println(biblioteca.addlibro(libro1));
        System.out.println(biblioteca.addlibro(libro2));

        System.out.println(biblioteca.obtainCatalogo());
    }
}
