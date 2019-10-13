package bazaDanych;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;


@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString

public class Osoba extends Wpis {

    private String name;
    private String surname;
    private String adress;
    private PhoneNumber phoneNumber;

    public Osoba() {
    }


    @Override
    public String opis() {
        return "dane kontaktowe osoby nie bedaca firma";
    }
}
