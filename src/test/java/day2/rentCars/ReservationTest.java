package day2.rentCars;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReservationTest {

    @Test
    public void testConstructor() throws ParseException {
        //given
        Client client = new Client("Adek", "Bocian", "Lublin", "GJS3231");
        Car car = new Car("Audi", "LU21205", 2004, 215692L);

        String pattern = "yyyy-mm-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        Date dateBegin = simpleDateFormat.parse("2019-10-01");
        Date dateEnd = simpleDateFormat.parse("2019-10-11");

        Reservation reservation = new Reservation(client, car, dateBegin, dateEnd);
        //when

        //then

        assertEquals(client, reservation.getClient());
        assertEquals(car, reservation.getCar());
        assertEquals(dateBegin, reservation.getRentingBegin());
        assertEquals(dateEnd, reservation.getRentingEnd());
    }

}