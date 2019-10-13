package day1.BibliotekaPlytCD;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class CDTest {

    @Test
    public void testConstructor() {
        //given
        List<Song> inputSongs = List.of(new Song("Adam", "Mickiewicz", "Potop", 3.25)
                , new Song("Juliusz", "Słowacki", "Niewiem", 6.42));
        CD cd = new CD(inputSongs, "Wieszcze");
        //when
        String title = cd.getTitle();
        List<Song> outputSongs = cd.getSongs();
        //then
        assertEquals("Wieszcze", title);
        assertEquals(inputSongs, outputSongs);
    }

    @Test
    public void testSearch(){
        //given
        List<Song> inputSongs = List.of(new Song("Adam", "Mickiewicz", "Potop", 3.25)
                , new Song("Juliusz", "Słowacki", "Niewiem", 6.42));
        CD cd = new CD(inputSongs, "Wieszcze");

        //when
        Song adam = cd.search("Potop");
        //then
        assertEquals("Adam",adam.getAuthorName());
        assertEquals("Mickiewicz",adam.getAuthorSurname());
    }

    @Test
    public void testSearchNotFound(){
        //given
        List<Song> inputSongs = List.of(new Song("Adam", "Mickiewicz", "Potop", 3.25)
                , new Song("Juliusz", "Słowacki", "Niewiem", 6.42));
        CD cd = new CD(inputSongs, "Wieszcze");
        //when
        Song adam = cd.search("Troja");
        //then
        assertNull(adam);
    }
    @Test
    public void testSearchNull(){
        //given
        List<Song> inputSongs = List.of(new Song("Adam", "Mickiewicz", "Potop", 3.25)
                , new Song("Juliusz", "Słowacki", "Niewiem", 6.42));
        CD cd = new CD(inputSongs, "Wieszcze");
        //when
        Song adam = cd.search(null);
        //then
        assertNull(adam);
    }
}