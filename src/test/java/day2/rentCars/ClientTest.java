package day2.rentCars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClientTest {

    @Test
    public void testConstructor() {
        //given
        Client client = new Client("Adek", "Bocian", "Lublin", "GJS3231");
        //when

        //then

        assertEquals("Adek", client.getName());
        assertEquals("Bocian", client.getSurname());
        assertEquals("Lublin", client.getAdress());
        assertEquals("GJS3231", client.getIdNumber());
    }

}