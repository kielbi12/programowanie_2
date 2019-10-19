package day2.rentCars;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor

public class Renting {

    private Client client;
    private Car car;
    private Date rentingBegin;
    private Date rentingEnd;


}
