import java.util.Vector;

public class App {
    public static void main(String[] args) throws Exception {
        Film film1 = new Film("Titanic", "Leonardo Di Caprio", "Cameron Diaz", 2001, "DVD", true);
        Film film2 = new Film("Forrest Gump", "Tom Hanks", "Robert Zemeckis", 2002, "K7", true);

        //Vector v = new Vector<Object>();
        //filmMenu.liste.addElement(film1);
        //filmMenu.liste.addElement(film2);


        Film.ajoutFilm(filmMenu.liste, film1);
        Film.ajoutFilm(filmMenu.liste, film2);

        //Affiche la liste des films disponibles
        //SOUCI : m'affiche un vecteur vide
        filmMenu.menuListeFilmDispo();

        //Affiche la liste des films loués
        filmMenu.menuListeFilmLoue();

        //Afficher le menu
        filmMenu.menuFilm();
    }
}
