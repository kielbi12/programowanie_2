package day3.dhl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@NoArgsConstructor

public class Package {

    private double weight;
    private Adress adressSenter;
    private Adress adressReciver;
    private LocalDate deliveryDate;
    private LocalDate sendingDate;
    private int idPackage;
    private Dimensions dimensions;


}
