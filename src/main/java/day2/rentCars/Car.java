package day2.rentCars;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Car {

    private String mark;
    private String registrationCar;
    private int productionYear;
    private Long mileage;

}
