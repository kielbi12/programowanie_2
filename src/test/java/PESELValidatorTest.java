import day2.PESELValidator;
import org.junit.Test;

import static org.junit.Assert.*;

public class PESELValidatorTest {

//    @BeforeEach
//            void init (){
//        day2.PESELValidator validator = new day2.PESELValidator();
//    }


    @Test
    public void testPeselNull() {
        //given
        PESELValidator validator = new PESELValidator();
        String pesel = null;
        //when
        boolean validate = validator.validate(pesel);
        //then

        assertFalse(validate);

    }

    @Test
    public void testPeselSizeLessThanElevenChars() {
        //given
        PESELValidator validator = new PESELValidator();
        String pesel = "1234567890";
        //when
        boolean validate = validator.validate(pesel);
        //then
        assertFalse(validate);

    }

    @Test
    public void testPeselSizeMoreThanElevenChars() {
        //given
        PESELValidator validator = new PESELValidator();
        String pesel = "123456789012";
        //when
        boolean validate = validator.validate(pesel);
        //then
        assertFalse(validate);

    }

    @Test
    public void testPeselisLastNumberCorrect() {
        //given
        PESELValidator validator = new PESELValidator();
        String pesel = "02070803626";
        //when
        boolean validate = validator.validate(pesel);
        //then
        assertFalse(validate);
    }

    @Test
    public void testPesel() {
        //given
        PESELValidator validator = new PESELValidator();
        String pesel = "02070803628";
        //when
        boolean validate = validator.validate(pesel);
        //then
        assertTrue(validate);
    } @Test
    public void testPesel2() {
        //given
        PESELValidator validator = new PESELValidator();
        String pesel = "020708036t8";
        //when
        boolean validate = validator.validate(pesel);
        //then
        assertFalse(validate);
    }
}
