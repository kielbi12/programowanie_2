package BibliotekaPlytCD;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    public void testRemove() {
        //given

        List<Song> inputSongs = List.of(new Song("Adam", "Mickiewicz", "Potop", 3.25)
                , new Song("Juliusz", "Słowacki", "Niewiem", 6.42));
        CD cd = new CD(inputSongs, "Wieszcze");
        Library library = new Library();
        //when
        library.add(cd);
        List<CD> listOfCDs = library.getListOfCDs();
        //then
        assertEquals(1, listOfCDs.size());
        library.removeCDName("Wieszcze");
        List<CD> listOfCDs1 = library.getListOfCDs();
        assertEquals(0, listOfCDs1.size());

    }

    @Test
    public void toStringTest() {
        //given

        List<Song> inputSongs = List.of(new Song("Adam", "Mickiewicz", "Potop", 3.25)
                , new Song("Juliusz", "Słowacki", "Niewiem", 6.42));
        CD cd = new CD(inputSongs, "Wieszcze");
        Library library = new Library();

        //when
        library.add(cd);
        String s = library.toString();

        //then
        assertEquals("Wieszcze \n" +
                "Adam Mickiewicz Potop 3.25\n" +
                "Juliusz Słowacki Niewiem 6.42", s);
    }

    @Test
    public void testSave() throws FileNotFoundException {
        //given
        //given

        List<Song> inputSongs = List.of(new Song("Adam", "Mickiewicz", "Potop", 3.25)
                , new Song("Juliusz", "Słowacki", "Niewiem", 6.42));
        CD cd = new CD(inputSongs, "Wieszcze");

        List<Song> inputSongs2 = List.of(new Song("Mike", "Tyson", "Eye of a tiger", 3.25)
                , new Song("Mariusz", "Pudzianowski", "Dawaj na ring", 4.12));
        CD cd2 = new CD(inputSongs2, "Koksy");
        Library library = new Library();
        library.add(cd);
        library.add(cd2);
        //when
        library.save();
        List<CD> listaPlyt = library.getListOfCDs();

        //then
        library.getListOfCDs().clear();
        library.load();
        assertEquals(2,listaPlyt.size());
        assertEquals(2,listaPlyt.get(0).getSongs().size());
        assertEquals(2,listaPlyt.get(1).getSongs().size());

    }
}