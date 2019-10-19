package day3.dhl;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor


public class Client implements FirmTypes<Client> {

    private String firstname;
    private String surname;
    private Adress adress;
    private String telefonNumber;
    private Long idClient;


    @Override
    public boolean compareType(Client object) {
        return idClient.equals(object.getIdClient());
    }
}
