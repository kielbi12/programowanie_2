package day2.rentCars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarTest {

    @Test
    public void testConstructor() {
        //given
        Car car = new Car("Audi", "LU21205", 2004, 215692L);
        //when

        //then

        assertEquals("Audi", car.getMark());
        assertEquals("LU21205", car.getRegistrationCar());
        assertEquals(2004, car.getProductionYear());
        assertEquals(215692L, car.getMileage());
    }

}