package day1.BibliotekaPlytCD.bazaDanych;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString

public class Firma extends Wpis {

    private String name;
    private String adress;
    private PhoneNumber phoneNumber;

    public Firma(){
    }


    @Override
    public String opis() {
        return "dane kontaktowe firmy";
    }
}
