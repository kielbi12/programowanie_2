package day1.BibliotekaPlytCD;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


@EqualsAndHashCode
@Getter
//@AllArgsConstructor
public class Library {

    private List<CD> listOfCDs = new ArrayList<>();



    public void add(CD cd) {
        listOfCDs.add(cd);
    }

    public void removeCDName(String name) {
        CD cd = listOfCDs.stream()
                .filter(a -> a.getTitle().equals(name))
                .findAny().orElse(null);
        if (cd != null) {
            listOfCDs.remove(cd);
        }
    }

    public CD search(String albumTitle) {
        return listOfCDs.stream()
                .filter(a -> a.getTitle()
                        .equals(albumTitle))
                .findAny()
                .orElse(null);
    }

    public String toString() {
        return listOfCDs.stream()
                .map(CD::toString)
                .reduce("", (tmp, a) -> tmp += a);
    }

    public void save() throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("database.txt");
        listOfCDs.forEach(cd -> {
            printWriter.println("-----------------");
            String title = cd.getTitle();
            printWriter.println("@");
            printWriter.println(title);
            cd.getSongs().forEach(song -> {
                String authorName = song.getAuthorName();
                String authorSurname = song.getAuthorSurname();
                String title1 = song.getTitle();
                double lenght = song.getLenght();
                printWriter.print(authorName + "%" + authorSurname + "%\"" + title1 + "\"%" + "   " + lenght);
                printWriter.println();
            });

        });
        printWriter.close();
    }

    public void load() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("database.txt"));
        CD tmp ;
        int licznik = 0;
        String title;
        List<Song> songList = null;
        String authorName, authorSurname, titleOfSong;
        double lenght;
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            switch(line){
                case "-----------------" :
                    songList = new ArrayList<>();
                    break;
                case "@":
                    title = scanner.nextLine();
                    tmp = new CD(songList, title);
                    listOfCDs.add(tmp);
                    break;
                default:
                    String[] split = line.split("%");
                    songList.add(new Song(split[0],split[1],split[2],Double.valueOf(split[3])));

            }
        }

        }



}
