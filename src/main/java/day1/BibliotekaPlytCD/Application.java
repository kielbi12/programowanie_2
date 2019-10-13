package day1.BibliotekaPlytCD;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    private static final Library LIBRARY = new Library();

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        String tmp = null;


        do {
            System.out.println("Witaj w menu biblioteki płyt");
            System.out.println(" 1 - jeżeli chcesz zapisać biblioteke");
            System.out.println(" 2 - jeżeli chcesz wyświetlić biblioteke");
            System.out.println(" 3 - jeżeli chcesz odczytać z biblioteki");
            System.out.println(" 4 - dodać płytę");
            System.out.println(" 5 - wyszukać płytę");
            System.out.println(" 6 - usunąć płytę");
            System.out.println(" 0 - zakończyć program");

            tmp = scanner.nextLine();

            switch (tmp) {
                case "1":
                    LIBRARY.save();
                    break;
                case "2":
                    System.out.println(LIBRARY);
                    break;
                case "3":
                    LIBRARY.load();
                    break;
                case "4":
                    System.out.println("Podaj nazwę płyty");
                    String title = scanner.nextLine();
                    List<Song> songList = new ArrayList<>();
                    CD cd = new CD(songList, title);
                    LIBRARY.add(new CD());

                    do {
                        System.out.println("Podaj nazwę utworu");
                        String title2 = scanner.nextLine();
                        System.out.println("Podaj imię wykonawcy");
                        String authorName = scanner.nextLine();
                        System.out.println("Podaj imię wykonawcy");
                        String authorSurame = scanner.nextLine();
                        System.out.println("Podaj długość utworu");
                        double lenght = scanner2.nextDouble();
                        songList.add(new Song(authorName, authorSurame, title2, lenght));
                        System.out.println("Czy chcesz dodać kolejny utwór? T/N");
                        String switched = scanner.nextLine();
                        if (switched.equals("T")) {
                            break;
                        }
                    } while (true);
                    break;
                case "5":
                    System.out.println("Podaj nazwę płyty");
                    String cdName = scanner.nextLine();
                     cd = LIBRARY.search(cdName);
                    if (cd != null) {
                        System.out.println(cd);
                    } else {
                        System.out.println("Nie znaleziono takiej płyty!");
                    }
                    ;
                    break;
                case "6":
                    System.out.println("Podaj nazwę płyty, którą chcesz usunąć");
                    String cdName2 = scanner.nextLine();
                    LIBRARY.removeCDName(cdName2);
                case "0":
                    break;
            }
        }
        while (true);


    }
}
