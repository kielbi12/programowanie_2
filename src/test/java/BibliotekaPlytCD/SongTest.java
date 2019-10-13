package BibliotekaPlytCD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SongTest {

    @Test
    public void testConstructor(){
        //given
        Song song = new Song("Adam", "Mickiewicz", "Potop", 3.25);
        //when
        String authorName = song.getAuthorName();
        String authorSurname = song.getAuthorSurname();
        String title = song.getTitle();
        double lenght = song.getLenght();
        //then
        assertEquals("Adam",authorName);
        assertEquals("Mickiewicz",authorSurname);
        assertEquals("Potop",title);
        assertEquals(3.25,lenght);
    }

}