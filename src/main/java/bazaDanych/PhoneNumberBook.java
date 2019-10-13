package bazaDanych;

import java.util.Map;
import java.util.TreeMap;

public class PhoneNumberBook {
    public static void main(String[] args) {
        Map<PhoneNumber,Wpis> book = new TreeMap();
        Osoba osoba = new Osoba("Witek", "Pazio","Lublin",new PhoneNumber("48","555666777"));
        book.put(osoba.getPhoneNumber(),osoba);
        Osoba osoba2 = new Osoba("Maciek", "Kasztan","Lublin",new PhoneNumber("48","111222333"));
        book.put(osoba2.getPhoneNumber(),osoba2);
        Osoba osoba3 = new Osoba("Kasztan", "Zbigniew","Lublin",new PhoneNumber("48","222333444"));
        book.put(osoba3.getPhoneNumber(),osoba3);
        Osoba osoba4 = new Osoba("Witold", "Krowa","Lublin",new PhoneNumber("48","333444555"));
        book.put(osoba4.getPhoneNumber(),osoba4);
        Osoba osoba5 = new Osoba("Michal", "Kajtan","Lublin",new PhoneNumber("48","444555666"));
        book.put(osoba5.getPhoneNumber(),osoba5);

        Firma firma = new Firma("SDA", "Lublin", new PhoneNumber("48", "666777888"));
        book.put(firma.getPhoneNumber(),firma);
        Firma firma2 = new Firma("Leclerc", "Lublin", new PhoneNumber("48", "777888999"));
        book.put(firma2.getPhoneNumber(),firma2);
        Firma firma3 = new Firma("Auchan", "Lublin", new PhoneNumber("48", "888999000"));
        book.put(firma3.getPhoneNumber(),firma3);
        Firma firma4 = new Firma("Olimp", "Lublin", new PhoneNumber("48", "999000111"));
        book.put(firma4.getPhoneNumber(),firma4);


        book.entrySet().forEach(entry->{
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });




    }
}
