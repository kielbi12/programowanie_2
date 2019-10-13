package day1.BibliotekaPlytCD.bazaDanych;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PhoneNumberTest {


    @Test
    public void phoneNumberTest(){
        //given
        PhoneNumber phoneNumber = new PhoneNumber("534535092","48");


        assertEquals("48",phoneNumber.getDirectNumber());
        assertEquals("534535092",phoneNumber.getPhoneNumber());
    }

}