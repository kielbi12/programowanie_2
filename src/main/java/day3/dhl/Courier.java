package day3.dhl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Courier implements FirmTypes<Courier> {

    private String firstname;
    private String surname;
    private String telefonNumber;
    private Long idCourier;

    @Override
    public boolean compareType(Courier object) {
        return idCourier.equals(object.getIdCourier());
    }
}
