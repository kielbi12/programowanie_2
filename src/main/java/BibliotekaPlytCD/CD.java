package BibliotekaPlytCD;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;


@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor

public class CD {

    private List<Song> songs;
    private String title;

    public void add(String authorName, String authorSurname, String title, double lenght) {
        songs.add(new Song(authorName, authorSurname, title, lenght));
    }

    public Song search(String query) {
        return songs.stream()
                .filter(a -> a.getTitle()
                        .equals(query))
                .findAny()
                .orElse(null);
    }

    public String toString() {
        List<String> list = songs.stream()
                .map(a -> a.toString())
                .collect(Collectors.toList());

        String reduce = list.stream().reduce("", (tmp, a) -> tmp += "\n" + a);
        return title + " " + reduce;
    }
}




