package day1.BibliotekaPlytCD.bazaDanych;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirmaTest {

    @Test
    public void testConstructor(){
        //given
        PhoneNumber phoneNumber = new PhoneNumber("123456789", "48");
        Firma firma = new Firma("SDA", "Lublin", phoneNumber);



//        assertEquals("dane kontaktowe osoby nie bedaca firma", opis);
        assertEquals("SDA", firma.getName());
        assertEquals("Lublin", firma.getAdress());
        assertEquals(phoneNumber, firma.getPhoneNumber());
    }

}