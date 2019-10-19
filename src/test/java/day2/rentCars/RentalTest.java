package day2.rentCars;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class RentalTest {


    @Test(expected = IllegalStateException.class)
    public void ifCouldAddRenting() throws ParseException {
        //given
        Client client = new Client("Adek", "Bocian", "Lublin", "GJS3231");
        Car car = new Car("Audi", "LU21205", 2004, 215692L);

        String pattern = "yyyy-mm-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date dateBegin = simpleDateFormat.parse("2019-10-01");
        Date dateEnd = simpleDateFormat.parse("2019-10-11");

        Reservation reservation = new Reservation(client, car, dateBegin, dateEnd);
        Reservation reservation2 = new Reservation(client, car, dateBegin, dateEnd);

        Rental rental = new Rental();
        rental.addReservation(reservation);
        rental.addReservation(reservation2);
    }

    @Test(expected = IllegalStateException.class)
    public void ifCouldAddRenting2() throws ParseException {
        //given
        Client client = new Client("Adek", "Bocian", "Lublin", "GJS3231");
        Car car = new Car("Audi", "LU21205", 2004, 215692L);

        String pattern = "yyyy-mm-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date dateBegin = simpleDateFormat.parse("2019-10-01");
        Date dateBegin1 = simpleDateFormat.parse("2019-09-01");
        Date dateEnd = simpleDateFormat.parse("2019-10-11");
        Date dateEnd1 = simpleDateFormat.parse("2019-10-04");

        Reservation reservation = new Reservation(client, car, dateBegin, dateEnd);
        Reservation reservation2 = new Reservation(client, car, dateBegin1, dateEnd1);

        Rental rental = new Rental();
        rental.addReservation(reservation);
        rental.addReservation(reservation2);
    }

    @Test(expected = IllegalStateException.class)
    public void ifCouldAddRenting3() throws ParseException {
        //given
        Client client = new Client("Adek", "Bocian", "Lublin", "GJS3231");
        Car car = new Car("Audi", "LU21205", 2004, 215692L);

        String pattern = "yyyy-mm-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date dateBegin = simpleDateFormat.parse("2019-10-01");
        Date dateBegin1 = simpleDateFormat.parse("2019-10-06");
        Date dateEnd = simpleDateFormat.parse("2019-10-11");
        Date dateEnd1 = simpleDateFormat.parse("2019-10-20");

        Reservation reservation = new Reservation(client, car, dateBegin, dateEnd);
        Reservation reservation2 = new Reservation(client, car, dateBegin1, dateEnd1);

        Rental rental = new Rental();
        rental.addReservation(reservation);
        rental.addReservation(reservation2);
    }

    @Test(expected = IllegalStateException.class)
    public void ifCouldAddRenting4() throws ParseException {
        //given
        Client client = new Client("Adek", "Bocian", "Lublin", "GJS3231");
        Car car = new Car("Audi", "LU21205", 2004, 215692L);

        String pattern = "yyyy-mm-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date dateBegin = simpleDateFormat.parse("2019-10-01");
        Date dateBegin1 = simpleDateFormat.parse("2019-09-06");
        Date dateEnd = simpleDateFormat.parse("2019-10-11");
        Date dateEnd1 = simpleDateFormat.parse("2019-11-20");

        Reservation reservation = new Reservation(client, car, dateBegin, dateEnd);
        Reservation reservation2 = new Reservation(client, car, dateBegin1, dateEnd1);

        Rental rental = new Rental();
        rental.addReservation(reservation);
        rental.addReservation(reservation2);
    }

    @Test(expected = IllegalStateException.class)
    public void ifCouldAddRenting5() throws ParseException {
        //given
        Client client = new Client("Adek", "Bocian", "Lublin", "GJS3231");
        Car car = new Car("Audi", "LU21205", 2004, 215692L);

        String pattern = "yyyy-mm-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date dateBegin = simpleDateFormat.parse("2019-10-01");
        Date dateBegin1 = simpleDateFormat.parse("2019-10-06");
        Date dateEnd = simpleDateFormat.parse("2019-10-11");
        Date dateEnd1 = simpleDateFormat.parse("2019-10-08");

        Reservation reservation = new Reservation(client, car, dateBegin, dateEnd);
        Reservation reservation2 = new Reservation(client, car, dateBegin1, dateEnd1);

        Rental rental = new Rental();
        rental.addReservation(reservation);
        rental.addReservation(reservation2);
    }

}