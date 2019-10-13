package bazaDanych;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OsobaTest {

    @Test
    public void testConstructor() {
        //given
        PhoneNumber phoneNumber = new PhoneNumber("123456789", "48");
        Osoba osoba = new Osoba("Wojtek", "Sum", "Lublin", phoneNumber);

        String opis = osoba.opis();

        assertEquals("dane kontaktowe osoby nie bedaca firma", opis);
        assertEquals("Wojtek", osoba.getName());
        assertEquals("Sum", osoba.getSurname());
        assertEquals("Lublin", osoba.getAdress());
        assertEquals(phoneNumber, osoba.getPhoneNumber());

    }

}