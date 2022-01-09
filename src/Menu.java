import java.util.Scanner;

public class Menu {

    public static String newLine = System.getProperty("line.separator");
    public static Scanner sc = new Scanner(System.in);

    public Menu(){

    }

    public static void choixMenu() {
        System.out.println("MENU");
        System.out.println("Appuyer [1] pour la Gestion de films ou [2] pour la Gestion des clients");
        Integer valChoice = sc.nextInt();

        switch(valChoice) {
            case 1:
            filmMenu.menuFilm();
            break;

        }

    }


}
