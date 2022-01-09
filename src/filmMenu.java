import java.util.Vector;
import java.util.List;
import java.util.Scanner;

public class filmMenu {

    public static String newLine = System.getProperty("line.separator");
    public static Scanner sc = new Scanner(System.in);
    public static Vector<Object> liste  = new Vector<Object>();

    public filmMenu() {
    }

    public static void menuFilm() {
        System.out.println("MENU - Gestion de films");
        System.out.println("Appuyer [1] pour ajouter un film , [2] pour voir la liste des films disponible, [3] pour voir la liste des films loués");
        Integer valChoice = sc.nextInt();

        switch(valChoice) {
            case 1:
            menuAjoutFilm();
            break;

            case 2:
            menuListeFilmDispo();
            break;

            case 3:
            menuListeFilmLoue();
            break;

        }

}

    public static void menuAjoutFilm() {

        boolean confirmation = false;
        do {
            System.out.println("AJOUT DE FILM");
            System.out.println("Etape 1 sur 5 - saisir le titre du film");
            String valTitre = sc.next();
            System.out.println("Etape 2 sur 5 - saisir le nom de l'acteur principal");
            String valActeur = sc.next();
            System.out.println("Etape 3 sur 5 - saisir le nom du réalisateur");
            String valRealisateur = sc.next();
            Integer valAnnee;
            do {
                System.out.println("Etape 4 sur 5 - saisir l'année du film");
                while (!sc.hasNextInt()) {
                    System.out.println("saisie inccorect !");
                    System.out.println("Etape 4 sur 5 - saisir l'année du film");
                    sc.next();
                }
                valAnnee = sc.nextInt();
            } while (valAnnee <= 0);
            System.out.println("Etape 5 sur 5 - choisissez le support du film");
            System.out.println("1 pour DVD, 2 pour Blu-Ray, 3 pour clé USB, 4 pour K7");
            Integer supportChoice = sc.nextInt();
            String valSupport = null;
            Boolean valDispo = true;

            switch (supportChoice) {
                case 1:
                    valSupport = "DVD";
                    break;

                case 2:
                    valSupport = "Blu-Ray";
                    break;

                case 3:
                    valSupport = "clé USB";
                    break;

                case 4:
                    valSupport = "K7";
                    break;

                default:
                    System.out.println("Veuillez saisir 1 pour DVD, 2 pour Blu-Ray, 3 pour clé USB, 4 pour K7");
                    break;

            }
            System.out.println("Le film ajouté est : " + newLine +
                    "titre : " + valTitre + newLine +
                    "acteur : " + valActeur + newLine +
                    "réalisateur :" + valRealisateur + newLine +
                    "année :" + valAnnee + newLine +
                    "support :" + valSupport);
            System.out.println("Est-ce que les informations sont correctes ? O pour OUI ou N pour NON");
            String valConfirmation = sc.next();

            switch (valConfirmation) {
                case "O":
                case "o":
                    Film nouveauFilm = new Film(valTitre, valActeur, valRealisateur, valAnnee, valSupport, valDispo);
                    Film.ajoutFilm(liste, nouveauFilm);
                    confirmation = true;
                    System.out.println("Film ajouté !");
                    break;

                case "N":
                case "n":
                    confirmation = false;
                    break;
            }
        } while (confirmation == false);
    }


    public static void menuListeFilmDispo(){
        System.out.println("LISTE DES FILMS DISPONIBLES");
        for(int i = 0; i < liste.size(); i++){
            if( ((Film)(liste.elementAt(i))) .getFilmDispo() == true){
                System.out.println((Film)(liste.elementAt(i)));
            }
        }
    }

    public static void menuListeFilmLoue(){
        System.out.println("LISTE DES FILMS LOUES");
        for(int i = 0; i < liste.size(); i++){
            if( ((Film)(liste.elementAt(i))) .getFilmDispo() == false){
                System.out.println((Film)(liste.elementAt(i)));
            }
        }
    }
}
