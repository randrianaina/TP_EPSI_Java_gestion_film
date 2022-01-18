import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Vector;

public class Film {

    public static void main(String[] args) {
    }

    public String titreFilm;
    public String acteurFilm;
    public Integer dateFilm;
    public String realisateurFilm;
    public String supportFilm;
    public boolean dispo;

    public Film(String _titreFilm, String _acteurFilm, String _realisateurFilm, Integer _dateFilm,
    String _supportFilm, boolean _dispo) {
        this.titreFilm = _titreFilm;
        this.acteurFilm = _acteurFilm;
        this.realisateurFilm = _realisateurFilm;
        this.dateFilm = _dateFilm;
        this.supportFilm = _supportFilm;
        this.dispo = _dispo;
    }

    public static void ajoutFilm(Vector<Object> v, Film f ) {
        v.addElement(f);
            }

    public String getFilmTitre(){
        return this.titreFilm;
    }

    public boolean getFilmDispo(){
        return this.dispo;
    }

}
