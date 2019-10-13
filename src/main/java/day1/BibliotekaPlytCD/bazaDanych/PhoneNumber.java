package day1.BibliotekaPlytCD.bazaDanych;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString

public class PhoneNumber implements Comparable<PhoneNumber> {

    private String directNumber;
    private String phoneNumber;




    @Override
    public int compareTo(PhoneNumber phoneNumber) {

        return this.phoneNumber.compareTo(phoneNumber.phoneNumber);
    }
}
