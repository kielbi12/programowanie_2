package day1.BibliotekaPlytCD;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;


@AllArgsConstructor
@Getter
@EqualsAndHashCode

public class Song {

    private String authorName;
    private String authorSurname;
    private String title;
    private double lenght;

    public String toString(){
        return authorName + " " + authorSurname + " " + title + " " + lenght;
    }

}
